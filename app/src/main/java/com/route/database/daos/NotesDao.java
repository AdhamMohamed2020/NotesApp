package com.route.database.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.route.database.model.Note;

import java.util.List;

@Dao
public interface NotesDao {

    @Insert
    void addNote(Note note);

    @Delete
    void deleteNote(Note note);

    @Update
    void updateNote(Note note);

    @Query("select * from Note where id=:id")
    Note searchNoteById(int id);

    @Query("select * from note")
    List<Note> getAllNotes();
}