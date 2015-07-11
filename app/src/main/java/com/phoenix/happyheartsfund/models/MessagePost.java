package com.phoenix.happyheartsfund.models;

import java.util.ArrayList;

public class MessagePost {

    public String uniqueID;
    public String message;
    public double likeCount;
    public ArrayList<Comment> comments;

    public MessagePost(String uniqueID, String message, double likeCount, ArrayList<Comment> comments) {
        this.uniqueID = uniqueID;
        this.message = message;
        this.likeCount = likeCount;
        this.comments = comments;
    }
}
