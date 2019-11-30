package com.example.jpa_example.model.entity.instagram.media;

import com.example.jpa_example.model.entity.instagram.post.Post;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Media {

    public enum MediaType {
        PHOTO, VIDEO
    }

    @EmbeddedId
    private MediaId id;

    @Embedded
    private Url url;

    @Embedded
    private SortedOrder sortedOrder;

    @Enumerated(EnumType.STRING)
    private MediaType mediaType;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Media media;

}
