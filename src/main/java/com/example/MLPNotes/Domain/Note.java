package com.example.MLPNotes.Domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString


@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String description;



    private LocalDate creationDate;
    @ManyToOne
    private User user;

    public Note(String name, String description, LocalDate creationDate, User user) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.user = user;
    }


}
