package com.rais.haidar.gitreaddata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rais.haidar.gitreaddata.ApiRetrofit.ApiService;
import com.rais.haidar.gitreaddata.ApiRetrofit.InstanceRetrofit;
import com.rais.haidar.gitreaddata.ResponseServer.DataItem;
import com.rais.haidar.gitreaddata.ResponseServer.Response;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataItem> dataItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getData();
    }

    private void getData() {
        ApiService api = InstanceRetrofit.getInstance();
        Call<Response> call = api.response_read_data();
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Boolean status = response.body().isSuccess();
                if(status){
                    dataItems = response.body().getData();
                    CustomAdapter adapter = new CustomAdapter(MainActivity.this, dataItems);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }

}
