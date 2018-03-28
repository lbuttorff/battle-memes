package com.ist411.memes.services;

import com.ist411.memes.daos.UserRepository;
import com.ist411.memes.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional
    public User registerNewUserAccount(User u) throws EmailExistsException {

        if (emailExist(u.getEmail())) {
            throw new EmailExistsException(
                    "There is an account with that email address: "+ u.getEmail());
        }
        return repository.save(u);
    }
    private boolean emailExist(String email) {
        User user = repository.findByEmail(email);
        if (user != null) {
            return true;
        }
        return false;
    }
}

class EmailExistsException extends Exception {
    public EmailExistsException(String message){
        super(message);
    }
}