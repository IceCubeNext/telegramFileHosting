package ru.icecubenext.dao;

import ru.icecubenext.entity.AppPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long>{
}
