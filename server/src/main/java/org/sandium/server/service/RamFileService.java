package org.sandium.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

@Service
@ConditionalOnProperty(prefix = "s3", name = "access-key", matchIfMissing = true)
@Slf4j
public class RamFileService implements FileService {

    private final HashMap<String, byte[]> files;

    public RamFileService() {
        files = new HashMap<>();
    }

    @Override
    public void uploadFile(String key, InputStream inputStream, long contentLength, String contentType) {
        try {
            byte[] content = new byte[(int) contentLength];
            if (inputStream.read(content) != contentLength) {
                throw new RuntimeException("File shorter then expected");
            }
            files.put(key, content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public InputStream downloadFile(String key) throws FileNotFoundException {
        byte[] content = files.get(key);
        if (content == null) {
            throw new FileNotFoundException("File not found " + key);
        }
        return new ByteArrayInputStream(content);
    }

    @Override
    public void deleteFile(String key) throws FileNotFoundException {
        if (files.remove(key) == null) {
            throw new FileNotFoundException("File not found " + key);
        }
    }

}
