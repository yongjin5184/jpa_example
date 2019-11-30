package com.example.jpa_example.model.entity.instagram.post;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Author {
    @EmbeddedId
    private AuthorId id;
    private String userId;
    private boolean activation;
}
