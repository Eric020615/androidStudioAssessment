package com.example.rethinkyourdrink;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.RoomDatabase;

@Database(entities = {Details.class},version = 1)
public abstract class Room extends RoomDatabase {
    private static Room INSTANCE;

    public abstract Dao getMyDao();

    static synchronized Room getDataBase(Context context){
        if (INSTANCE==null){
            INSTANCE= androidx.room.Room.databaseBuilder(context.getApplicationContext(),Room.class,"People_database").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
}
