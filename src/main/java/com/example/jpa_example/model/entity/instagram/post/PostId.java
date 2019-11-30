package com.example.jpa_example.model.entity.instagram.post;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class PostId implements Serializable {
    @Column(name = "post_id")
    @EmbeddedId @GeneratedValue
    private Long id;
}
