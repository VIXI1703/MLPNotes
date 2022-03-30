package com.example.MLPNotes.Repository;

import com.example.MLPNotes.Domain.Case;
import org.springframework.data.repository.CrudRepository;

public interface CaseRepo extends CrudRepository<Case,Long> {
}
