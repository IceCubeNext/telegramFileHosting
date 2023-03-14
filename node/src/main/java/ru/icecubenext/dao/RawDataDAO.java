package ru.icecubenext.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.icecubenext.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
