package dev.albruiz.filoserver.Controller;

import dev.albruiz.filoserver.Model.Note;
import dev.albruiz.filoserver.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    NoteService noteService;

    @CrossOrigin
    @GetMapping("/status")
    public String status() {
        return "Working ✅";
    }

    @CrossOrigin
    @GetMapping("/notes")
    public List<Note> notes() {
        return noteService.getNotes();
    }

    @CrossOrigin
    @PostMapping("/notes")
    public void addNote(@RequestBody Note note) {
        noteService.addNote(note);
    }

    @CrossOrigin
    @DeleteMapping("/notes")
    public void deleteNote(@RequestBody Note note) {
        noteService.deleteNote(note.getId());
    }


}
