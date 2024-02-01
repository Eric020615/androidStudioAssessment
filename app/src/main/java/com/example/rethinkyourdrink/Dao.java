package com.example.rethinkyourdrink;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface Dao {
    @Insert(onConflict= OnConflictStrategy.IGNORE)
    void insert(Details details);

    @Query("DELETE FROM Details")
    void deleteAll();

    @Query("SELECT * FROM Details")
    public List<Details> getPeople();
}
