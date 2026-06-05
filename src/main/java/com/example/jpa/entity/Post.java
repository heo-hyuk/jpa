package com.example.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)




public class Post {
    @Id
    private long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;
    private  LocalDateTime updatedAt;
    public static Post create(String title, String content, String author, LocalDateTime createdAt, LocalDateTime updatedAt) {
        Post post = new Post();
        post.title = title;
        post.content = content;
        post.author = author;
        return post;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
