package com.example.nemus.rest;

/**
 * Created by nemus on 25-Dec-16.
 */
public class ApiClient {

    public static final String BASE_URL = "https://api.stackexchange.com";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
