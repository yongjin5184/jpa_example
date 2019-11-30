package com.example.jpa_example.model.entity.instagram.post;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Comment {
    @Column(length = 4000)
    private String text;
}
