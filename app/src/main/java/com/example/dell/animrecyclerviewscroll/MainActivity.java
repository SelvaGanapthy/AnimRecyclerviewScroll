package com.example.dell.animrecyclerviewscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    DataAdapter adapter;
    ArrayList<String> Datalist = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView)findViewById(R.id.rv);
        for (int i = 0; i < 20; i++)
            Datalist.add("Item " + i);
        set_rvLayoutManager();
        set_rvAdapter();
    }

    public void set_rvLayoutManager() {
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rv.setHasFixedSize(true);
    }

    public void set_rvAdapter() {
        adapter = new DataAdapter(MainActivity.this, Datalist);
        rv.setAdapter(adapter);
    }


}
