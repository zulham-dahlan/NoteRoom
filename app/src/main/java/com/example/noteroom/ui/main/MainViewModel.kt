package com.example.noteroom.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.noteroom.database.Note
import com.example.noteroom.repository.NoteRepository

class MainViewModel(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes() : LiveData<List<Note>> = mNoteRepository.getALlNotes()
}