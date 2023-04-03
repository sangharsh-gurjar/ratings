package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

public class WatchRating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_rating);
        RoadDB db = Room.databaseBuilder(getApplicationContext(),
                RoadDB.class, "database-name").build();
        RoadsDAO roadsDAO=db.roadsDao();


        //TODO fetch rating and display
    }
}