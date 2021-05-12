package com.javateam.medicalcenter.users.infrastructure;

import com.javateam.medicalcenter.users.domain.User;
import com.javateam.medicalcenter.users.domain.UserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
@Primary
public class MemoryUserRepository implements UserRepository {
    private final Map<Long, User> storage = new ConcurrentHashMap<>();
    private final AtomicLong ID_NEXT_VALUE = new AtomicLong(0L);

    @Override
    public List<User> getAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<User> getById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public User save(User user) {
        if (user.getId() != null) {
            storage.put(user.getId(), user);
        } else {
            long nextId = nextId();
            user.setId(nextId);
            storage.put(nextId, user);
        }
        return user;
    }

    @Override
    public void removeById(Long id) {
        storage.remove(id);
    }

    private long nextId() {
        return ID_NEXT_VALUE.getAndIncrement();
    }
}
