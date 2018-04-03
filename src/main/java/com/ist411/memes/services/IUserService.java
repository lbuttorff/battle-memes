package com.ist411.memes.services;

import com.ist411.memes.models.User;

public interface IUserService {
    User registerNewUserAccount(User account)
            throws EmailExistsException;

    class EmailExistsException extends Exception {
        EmailExistsException(String m){

        }
    }
}