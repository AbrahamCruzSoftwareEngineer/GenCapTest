package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.myapplication.entities.ResultApus;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    private RecyclerView recyclerView;
    private List<ResultApus> resultList;
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.a_main_recycler);
        resultList = new ArrayList<>();
        recyclerAdapter = new RecyclerAdapter(resultList);

        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RetrofitManager retrofitManager = new RetrofitManager.Factory()
                .generateRetrofitManager();

        Log.d(TAG, "onCreate: ");

        retrofitManager.getLaunches().enqueue(new Callback<List<ResultApus>>() {
            @Override
            public void onResponse(Call<List<ResultApus>> call, Response<List<ResultApus>> response) {
                Log.d(TAG, "onResponse: ");
                List<ResultApus> body = response.body();
                for (ResultApus resultApus : body) {
                    Log.d(TAG, "onResponse: " + resultApus);
                }

                resultList.clear();
                resultList.addAll(body);
                recyclerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<ResultApus>> call, Throwable t) {
                Log.d(TAG, "onFailure: ");
                t.printStackTrace();
            }
        });
    }
}
