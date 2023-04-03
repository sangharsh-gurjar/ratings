package com.example.rating;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RoadsDAO {
    @Query("SELECT * FROM roads")
    List<Roads> getAll();

    @Query("SELECT * FROM roads WHERE uid IN (:userIds)")
    List<Roads> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM roads WHERE road_name LIKE :first AND " +
            "rating LIKE :last LIMIT 1")
    Roads findByName(String first, double last);

    @Insert
    void insert(Roads roads);

    @Query("SELECT * FROM roads WHERE uid=:id ")
    Roads getRoad(int id);

    @Update
    void update(Roads roads);

    @Query("SELECT EXISTS(SELECT * FROM roads WHERE uid = :id)")
    boolean exists(int id);



}