package com.ist411.memes.services;

import com.ist411.memes.models.User;
import com.ist411.memes.models.UserDto;

public interface IUserService {
    User registerNewUserAccount(UserDto accountDto)
            throws EmailExistsException;

    class EmailExistsException extends Exception {
        EmailExistsException(String m){
            super(m);
        }
    }
}
