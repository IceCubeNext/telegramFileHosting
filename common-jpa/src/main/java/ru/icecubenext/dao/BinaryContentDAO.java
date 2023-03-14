package ru.icecubenext.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.icecubenext.entity.BinaryContent;

public interface BinaryContentDAO extends JpaRepository<BinaryContent, Long> {
}
