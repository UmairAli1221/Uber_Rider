package com.uberclone.rider.Remote;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Umair Ali on 1/20/2018.
 */

public class FCMClient {
    private static Retrofit retrofit=null;
    public static Retrofit getClent(String baseUrl){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
