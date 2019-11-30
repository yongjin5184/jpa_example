package com.example.jpa_example.model.entity.instagram.post;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Comment implements Serializable {
    @Column(length = 4000)
    private String text;
}
