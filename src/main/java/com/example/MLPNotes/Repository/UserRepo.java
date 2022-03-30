package com.example.MLPNotes.Repository;

import com.example.MLPNotes.Domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {
}
