package com.example.user.submissiondicoding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Bunga>list;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(BungaData.getListData());

        showRecyclerCardView();

    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter = new CardViewAdapter(this);
        cardViewAdapter.setListBunga(list);
        rvCategory.setAdapter(cardViewAdapter);
    }

//    pindah activity baru
    public void intentActivity(View view) {
        Intent detail = new Intent(MainActivity.this, PindahActivity.class);
        startActivity(detail);
    }

}
