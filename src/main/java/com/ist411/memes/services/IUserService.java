package com.ist411.memes.services;

import com.ist411.memes.models.User;

public interface IUserService {
    void save(User user);
    User findByUsername(String username);
}
