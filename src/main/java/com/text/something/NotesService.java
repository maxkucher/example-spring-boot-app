package com.text.something;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {
    private NoteRepository repository;

    @Autowired
    public NotesService(NoteRepository repository) {
        this.repository = repository;
    }


    public List<Note> getAllNotes() {
        return repository.findAll();
    }

    public List<Note> findNotesByTitle(String title) {
        return repository.findByTitle(title);
    }

    public Note saveNote(Note note) {
        return repository.save(note);
    }
}
