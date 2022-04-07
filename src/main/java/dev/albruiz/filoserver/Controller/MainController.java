package dev.albruiz.filoserver.Controller;

import dev.albruiz.filoserver.Model.Note;
import dev.albruiz.filoserver.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MainController {

    @Autowired
    NoteService noteService;

    @GetMapping("/status")
    public String status() {
        return "Working ✅";
    }

    @GetMapping("/notes")
    public List<Note> notes() {
        return noteService.getNotes();
    }

    @PostMapping("/notes")
    public void addNote(@RequestBody Note note) {
        noteService.addNote(note);
    }

    @DeleteMapping("/notes")
    public void deleteNote(@RequestBody Note note) {
        noteService.deleteNote(note.getId());
    }


}
