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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
