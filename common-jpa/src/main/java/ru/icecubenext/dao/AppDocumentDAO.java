package ru.icecubenext.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.icecubenext.entity.AppDocument;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}
