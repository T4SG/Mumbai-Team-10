package com.phoenix.happyheartsfund.models;

import java.util.ArrayList;

public class MessagePost {

    public String userID;
    public String uniqueID;
    public String message;
    public double likeCount;
    public ArrayList<Comment> comments;

    public MessagePost(String userID, String uniqueID, String message, double likeCount, ArrayList<Comment> comments) {
        this.userID = userID;
        this.uniqueID = uniqueID;
        this.message = message;
        this.likeCount = likeCount;
        this.comments = comments;
    }
}
