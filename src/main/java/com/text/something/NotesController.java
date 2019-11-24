package com.text.something;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/notes")
public class NotesController {

    private NotesService notesService;

    @Autowired
    public NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    @GetMapping
    public List<Note> findNotes() {
        return notesService.getAllNotes();
    }

    @PostMapping
    public Note saveNote(@RequestBody Note note) {
        return notesService.saveNote(note);
    }

}
