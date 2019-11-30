package com.example.jpa_example.model.entity.instagram.post;

import com.example.jpa_example.model.entity.instagram.media.Media;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@SecondaryTable(name = "location", pkJoinColumns = @PrimaryKeyJoinColumn(name = "post_id"))
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "post")
public class Post {
    @Id @GeneratedValue
    private PostId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id")
    private Author author;

    @Embedded
    private Content content;

    @Embedded
    @Column(table = "location")
    private Location location;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<HashTag> tags;

    @ElementCollection
    @JoinTable(name = "comment", joinColumns = @JoinColumn(name = "post_id"))
    @OrderColumn(name = "comment_idx")
    private List<Comment> comments;

    @ElementCollection
    @JoinTable(name = "post_like", joinColumns = @JoinColumn(name = "post_id"))
    private List<Like> likes;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    @OrderColumn(name = "media_idx")
    private List<Media> medias;
}


