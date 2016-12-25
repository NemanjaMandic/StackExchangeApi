package com.example.nemus.rest;



import com.example.nemus.model.UsersReceived;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by nemus on 25-Dec-16.
 */
public interface UserEndPoints {

    @GET("/2.2/users?page=1&pagesize=5&order=desc&sort=reputation&site=stackoverflow")
    Call<UsersReceived> getUsers(@Query("sort") String sort);
}
