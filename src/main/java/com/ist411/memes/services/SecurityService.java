package com.ist411.memes.services;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
