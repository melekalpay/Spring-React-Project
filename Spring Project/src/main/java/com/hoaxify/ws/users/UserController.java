package com.hoaxify.ws.users;


import com.hoaxify.ws.shared.GenericResponse;
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
    UserServis userServis;

    @PostMapping("api/1.0/users")
    public GenericResponse createUser(@RequestBody Users users){
        userServis.save(users);
        GenericResponse response=new GenericResponse();
        response.setMessage("user created");
        return response;

    }
}
