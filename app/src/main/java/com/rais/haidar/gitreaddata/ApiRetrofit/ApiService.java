package com.rais.haidar.gitreaddata.ApiRetrofit;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hoidar on 8/24/18.
 */

public interface ApiService {
    @GET("read_data.php")
    Call<Response> response_read_data();
}
