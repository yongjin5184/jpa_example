package com.example.jpa_example.model.entity.instagram.post;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Like implements Serializable {
    private Long userId;
    private boolean activation;
}