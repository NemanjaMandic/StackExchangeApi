package com.example.nemus.model;

import java.util.List;

/**
 * Created by nemus on 25-Dec-16.
 */
public class UsersReceived {

    @SerializedName("items")
    private List<User> users;

    public List<User> getUsers(){
        return users;
    }

    public void setUsers(List<User> users){
        this.users=users;
    }

}
