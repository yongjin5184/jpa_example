package com.example.jpa_example.model.entity.instagram.post;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Location implements Serializable {
    @Column(table = "location", name = "x")
    private double x;

    @Column(table = "location", name = "y")
    private double y;
}
