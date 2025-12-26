package org.sandium.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

import java.io.FileNotFoundException;
import java.io.InputStream;

@Service
@ConditionalOnProperty(prefix = "s3", name = "access-key")
@RequiredArgsConstructor
@Slf4j
public class S3FileService implements FileService {
    
    private final S3Client s3Client;
    
    @Value("${s3.bucket}")
    private String bucketName;
    
    /**
     * Upload a file to S3
     * @param key The S3 key (path) for the file
     * @param inputStream The file content
     * @param contentLength The file size in bytes
     * @param contentType The MIME type of the file
     */
    @Override
    public void uploadFile(String key, InputStream inputStream, long contentLength, String contentType) {
        try {
            PutObjectRequest request = PutObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .contentType(contentType)
                    .contentLength(contentLength)
                    .build();
            
            s3Client.putObject(request, RequestBody.fromInputStream(inputStream, contentLength));
        } catch (S3Exception e) {
            log.error("Failed to upload file to S3: {}", key, e);
            throw new RuntimeException("Failed to upload file to S3", e);
        }
    }
    
    /**
     * Download a file from S3
     * @param key The S3 key (path) for the file
     * @return InputStream of the file content
     */
    @Override
    public InputStream downloadFile(String key) throws FileNotFoundException {
        try {
            GetObjectRequest request = GetObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .build();
            
            return s3Client.getObject(request);
        } catch (NoSuchKeyException e) {
            throw new FileNotFoundException("File not found " + key);
        } catch (S3Exception e) {
            log.error("Failed to download file from S3: {}", key, e);
            throw new RuntimeException("Failed to download file from S3", e);
        }
    }
    
    /**
     * Delete a file from S3
     * @param key The S3 key (path) for the file
     */
    @Override
    public void deleteFile(String key) throws FileNotFoundException {
        try {
            DeleteObjectRequest request = DeleteObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .build();
            
            s3Client.deleteObject(request);
        } catch (NoSuchKeyException e) {
            throw new FileNotFoundException("File not found " + key);
        } catch (S3Exception e) {
            log.error("Failed to delete file from S3: {}", key, e);
            throw new RuntimeException("Failed to delete file from S3", e);
        }
    }

}
