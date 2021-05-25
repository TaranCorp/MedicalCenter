package com.javateam.medicalcenter.users.domain;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<User> getById(Long id);
    List<User> getAll();
    User save(User user);
    void removeById(Long id);
}
