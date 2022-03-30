package com.example.MLPNotes.Repository;

import com.example.MLPNotes.Domain.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepo extends CrudRepository<Note, Long> {
}
