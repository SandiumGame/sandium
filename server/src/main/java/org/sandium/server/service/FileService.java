package org.sandium.server.service;

import java.io.FileNotFoundException;
import java.io.InputStream;

public interface FileService {
    void uploadFile(String key, InputStream inputStream, long contentLength, String contentType);

    InputStream downloadFile(String key) throws FileNotFoundException;

    void deleteFile(String key) throws FileNotFoundException;
}
