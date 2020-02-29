package com.example.eduhelp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AudiActivity extends AppCompatActivity {

    private String[] title = {"title1", "title1", "title1", "title1"};
    private String[] content = {"title1", "title1", "title1", "title1"};
    private int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, title, content, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
