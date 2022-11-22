package com.hoaxify.ws.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserServis {
    UserRepository userRepository;
    PasswordEncoder passwordEncoder;

    public UserServis(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder= new BCryptPasswordEncoder();
    }

    public void save(Users users) {
        String encrytedPassword = this.passwordEncoder.encode(users.getPassword());
        users.setPassword(encrytedPassword);
        userRepository.save(users);
    }
}
