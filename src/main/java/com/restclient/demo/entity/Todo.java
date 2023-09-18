package com.restclient.demo.entity;

import java.io.Serializable;

public class Todo implements Serializable {

    private int userId;
    private int id;
    private String title;
    private boolean completed;

    // No-argument constructor
    public Todo() {
    }

    // Parameterized constructor
    public Todo(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    // Getter for userId
    public int getUserId() {
        return userId;
    }

    // Setter for userId
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for completed
    public boolean isCompleted() {
        return completed;
    }

    // Setter for completed
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Override toString() for debugging purposes
    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
