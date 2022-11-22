package com.hoaxify.ws.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @PostMapping("api/1.0/users")
    public void createuser(@RequestBody Users users){
        userRepository.save(users);

    }
}
