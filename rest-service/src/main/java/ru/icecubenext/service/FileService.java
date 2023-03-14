package ru.icecubenext.service;

import org.springframework.core.io.FileSystemResource;
import ru.icecubenext.entity.AppDocument;
import ru.icecubenext.entity.AppPhoto;
import ru.icecubenext.entity.BinaryContent;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
    FileSystemResource getFileSystemResource(BinaryContent binaryContent);
}
