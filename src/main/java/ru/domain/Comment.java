package ru.domain;

import java.util.Date;

public class Comment {

    private int id;
    private int childCommentId;
    private String commentText;
    private int authorId;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChildCommentId() {
        return childCommentId;
    }

    public void setChildCommentId(int childCommentId) {
        this.childCommentId = childCommentId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
