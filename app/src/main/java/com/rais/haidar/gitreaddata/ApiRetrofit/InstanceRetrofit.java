package com.rais.haidar.gitreaddata.ApiRetrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hoidar on 8/24/18.
 */

public class InstanceRetrofit {
    public static final String WebUrl = "http://192.168.10.84/kamusidiom/read_data.php/";

    public static Retrofit setInit() {
        return new Retrofit.Builder()
                .baseUrl(WebUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getInstance() {
        return setInit().create(ApiService.class);
    }
}
