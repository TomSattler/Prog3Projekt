package com.example.prog3projekt.DayDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.prog3projekt.NoteDB.Note;

import java.util.List;

@Dao
public interface DayDao {

    @Insert
    void insert(Day day);

    @Update
    void update(Day day);

    @Delete
    void delete(Day day);

    @Query("DELETE FROM note_table")
    void deleteAllDays();

    @Query("SELECT * FROM day_table ORDER BY date DESC")
    LiveData<List<Day>> getAllDays();
}