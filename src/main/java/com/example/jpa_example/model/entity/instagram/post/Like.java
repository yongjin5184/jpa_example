package com.example.jpa_example.model.entity.instagram.post;

import javax.persistence.Embeddable;

@Embeddable
public class Like {
    private Long userId;
    private boolean activation;
}