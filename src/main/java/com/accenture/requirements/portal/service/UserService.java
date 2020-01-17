package com.accenture.requirements.portal.service;

import com.accenture.requirements.portal.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
