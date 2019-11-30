package com.example.jpa_example.model.entity.instagram.media;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MediaId implements Serializable {
    @Column(name = "media_id")
    private Long id;
}
