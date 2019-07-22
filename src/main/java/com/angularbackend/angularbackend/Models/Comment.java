package com.angularbackend.angularbackend.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Comment {

    @Id @GeneratedValue
    private Long Id;

    @Column
    private String commentBody;

    @JsonBackReference
    @ManyToOne
    private post post;

    @JsonBackReference
    @ManyToOne
    private User user;

    public Comment(){

    }

    public Comment(String commentBody, post post, User user) {
        this.commentBody = commentBody;
        this.post = post;
        this.user = user;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public com.angularbackend.angularbackend.Models.post getPost() {
        return post;
    }

    public void setPost(com.angularbackend.angularbackend.Models.post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
