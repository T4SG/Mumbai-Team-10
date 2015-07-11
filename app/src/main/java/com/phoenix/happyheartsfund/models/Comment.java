package com.phoenix.happyheartsfund.models;

public class Comment {

    public String userUniqueID;
    public String message;

    public Comment (String userUniqueID, String message) {
        this.userUniqueID = userUniqueID;
        this.message = message;
    }
}
