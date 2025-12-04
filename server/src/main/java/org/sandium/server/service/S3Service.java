package org.sandium.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

import java.io.InputStream;
import java.nio.file.Path;

@Service
@RequiredArgsConstructor
@Slf4j
public class S3Service {
    
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
    public void uploadFile(String key, InputStream inputStream, long contentLength, String contentType) {
        try {
            PutObjectRequest request = PutObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .contentType(contentType)
                    .contentLength(contentLength)
                    .build();
            
            s3Client.putObject(request, RequestBody.fromInputStream(inputStream, contentLength));
            log.info("Successfully uploaded file to S3: {}", key);
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
    public InputStream downloadFile(String key) {
        try {
            GetObjectRequest request = GetObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .build();
            
            return s3Client.getObject(request);
        } catch (NoSuchKeyException e) {
            log.error("File not found in S3: {}", key);
            throw new RuntimeException("File not found in S3: " + key, e);
        } catch (S3Exception e) {
            log.error("Failed to download file from S3: {}", key, e);
            throw new RuntimeException("Failed to download file from S3", e);
        }
    }
    
    /**
     * Delete a file from S3
     * @param key The S3 key (path) for the file
     */
    public void deleteFile(String key) {
        try {
            DeleteObjectRequest request = DeleteObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .build();
            
            s3Client.deleteObject(request);
            log.info("Successfully deleted file from S3: {}", key);
        } catch (S3Exception e) {
            log.error("Failed to delete file from S3: {}", key, e);
            throw new RuntimeException("Failed to delete file from S3", e);
        }
    }
    
    /**
     * Check if a file exists in S3
     * @param key The S3 key (path) for the file
     * @return true if the file exists, false otherwise
     */
    public boolean fileExists(String key) {
        try {
            HeadObjectRequest request = HeadObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .build();
            
            s3Client.headObject(request);
            return true;
        } catch (NoSuchKeyException e) {
            return false;
        } catch (S3Exception e) {
            log.error("Failed to check if file exists in S3: {}", key, e);
            throw new RuntimeException("Failed to check if file exists in S3", e);
        }
    }
    
    /**
     * Get the size of a file in S3
     * @param key The S3 key (path) for the file
     * @return The file size in bytes
     */
    public long getFileSize(String key) {
        try {
            HeadObjectRequest request = HeadObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .build();
            
            HeadObjectResponse response = s3Client.headObject(request);
            return response.contentLength();
        } catch (S3Exception e) {
            log.error("Failed to get file size from S3: {}", key, e);
            throw new RuntimeException("Failed to get file size from S3", e);
        }
    }
}
