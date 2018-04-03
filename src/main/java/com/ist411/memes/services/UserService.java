package com.ist411.memes.services;

import com.ist411.memes.daos.UserRepository;
import com.ist411.memes.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Transactional
    @Override
    public User registerNewUserAccount(User account)
            throws EmailExistsException {

        if (emailExist(account.getEmail())) {
            throw new EmailExistsException(
                    "There is an account with that email address:"  + account.getEmail());
        }
        User user = new User();
        //user.setFirstName(account.getFirstName());
        //user.setLastName(account.getLastName());
        user.setPassword(account.getPassword());
        user.setEmail(account.getEmail());
        user.setRoles(Arrays.asList("ROLE_USER"));
        return repository.save(user);
    }
    private boolean emailExist(String email) {
        User user = repository.findByEmail(email);
        if (user != null) {
            return true;
        }
        return false;
    }
}