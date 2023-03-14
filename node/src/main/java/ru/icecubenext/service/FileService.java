package ru.icecubenext.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.icecubenext.entity.AppDocument;
import ru.icecubenext.entity.AppPhoto;
import ru.icecubenext.service.enums.LinkType;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
    String generateLink(Long docId, LinkType linkType);
}
