package com.example.rating;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Roads {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "road_name")
    public String roadName;

    @ColumnInfo(name = "rating")
    public double rating;
    @ColumnInfo(name = "count")
    public int count;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    Roads(int uid, String name, double rating, int count){
        this.uid=uid;
        this.roadName=name;
        this.rating=rating;
        this.count=count;
    }

}
