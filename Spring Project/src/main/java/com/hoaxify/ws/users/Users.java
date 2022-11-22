package com.hoaxify.ws.users;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity


public class Users {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String displayname;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", displayname='" + displayname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
