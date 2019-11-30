package com.example.jpa_example.model.entity.instagram.post;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Content implements Serializable {
    private String name;
}
