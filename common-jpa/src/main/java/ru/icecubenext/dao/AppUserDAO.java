package ru.icecubenext.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.icecubenext.entity.AppUser;

public interface AppUserDAO extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByTelegramUserId(Long id);
}
