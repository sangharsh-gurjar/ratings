package com.example.rating;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.rating.Roads;

@Database(entities = {Roads.class}, version = 1)
public abstract class RoadDB extends RoomDatabase {
    public abstract RoadsDAO roadsDao();
}