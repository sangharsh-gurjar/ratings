package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

public class RatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        RoadDB db = Room.databaseBuilder(getApplicationContext(),
                RoadDB.class, "database-name").build();
        RoadsDAO roadsDAO=db.roadsDao();

        // TODO fetch data from text view into following double variables
        double rating1=3.5,rating2=5,rating3=4;
        Roads r1,r2,r3;
        r1=roadsDAO.getRoad(1);
        r2=roadsDAO.getRoad(2);
        r3=roadsDAO.getRoad(3);

        r1.setRating(((r1.getRating()*r1.getCount())+rating1)/r1.getCount()+1);
        r1.setCount(r1.getCount()+1);

        r2.setRating(((r2.getRating()*r2.getCount())+rating2)/r2.getCount()+1);
        r2.setCount(r2.getCount()+1);

        r3.setRating(((r3.getRating()*r3.getCount())+rating3)/r3.getCount()+1);
        r3.setCount(r3.getCount()+1);


        // TODO update data on button click
        roadsDAO.update(r1);
        roadsDAO.update(r2);
        roadsDAO.update(r3);

    }
}