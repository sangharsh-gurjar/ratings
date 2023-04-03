package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RoadDB db = Room.databaseBuilder(getApplicationContext(),
                RoadDB.class, "database-name").build();
        RoadsDAO roadsDAO=db.roadsDao();


        if(roadsDAO.exists(1)){


        }else{
            roadsDAO.insert(new Roads(1,"Road 1",0,0));

        }
        if(roadsDAO.exists(2)){


        }else{
            roadsDAO.insert(new Roads(2,"Road 2",0,0));

        }
        if(roadsDAO.exists(3)){


        }else{
            roadsDAO.insert(new Roads(3,"Road 3",0,0));

        }

    }
}