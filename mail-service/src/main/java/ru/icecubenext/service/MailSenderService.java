package ru.icecubenext.service;

import ru.icecubenext.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}
