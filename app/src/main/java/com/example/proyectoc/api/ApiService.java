package com.example.proyectoc.api;

import com.example.proyectoc.model.LoginRequest;
import com.example.proyectoc.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("routes/login_general.php")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
