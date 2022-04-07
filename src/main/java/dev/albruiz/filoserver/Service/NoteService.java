package dev.albruiz.filoserver.Service;

import dev.albruiz.filoserver.Model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {

    private List<Note> notes = new ArrayList<>();

    public List<Note> getNotes() {
        return notes;
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    private Note getNoteById(int id) {
        for (Note note : notes) {
            if (note.getId() == id) {
                return note;
            }
        }
        return null;
    }

    public void deleteNote(int id) {
        notes.remove(getNoteById(id));
    }
}
