package com.example.eduhelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView audi,room,semi,ground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audi = findViewById(R.id.audi);
        room = findViewById(R.id.room);
        semi = findViewById(R.id.semi);
        ground = findViewById(R.id.ground);

    }

    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {

            case R.id.audi:
                i = new Intent(this, AudiActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
                break;
            case R.id.room:
                i = new Intent(this, RoomActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
                break;

            case R.id.semi:
                i = new Intent(this, SeminarActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
                break;
            case R.id.ground:
                i = new Intent(this, GroundActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
                break;
            default:
                break;


        }
    }
}