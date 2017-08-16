package com.hfad.javadevsinlag.api;

import com.hfad.javadevsinlag.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sammie on 8/15/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}
