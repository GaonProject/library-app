package com.group.libraryapp.domain;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    protected Book() {
    }

    public Book(String name) {
        if (name ==  null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
