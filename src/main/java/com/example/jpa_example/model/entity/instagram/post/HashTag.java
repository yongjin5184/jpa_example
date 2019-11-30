package com.example.jpa_example.model.entity.instagram.post;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class HashTag {
    @EmbeddedId
    private HashTagId id;
    private String name;
    private String url;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private HashTag hashTag;
}
