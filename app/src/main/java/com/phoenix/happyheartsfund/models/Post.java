package com.phoenix.happyheartsfund.models;

import java.util.ArrayList;

public class Post {

    public String uniqueID;
    public String message;
    public String imageURL;
    public double likeCount;
    public ArrayList<Comment> comments;

    public Post(String uniqueID, String message, String imageURL, double likeCount, ArrayList<Comment> comments) {
        this.uniqueID = uniqueID;
        this.message = message;
        this.imageURL = imageURL;
        this.likeCount = likeCount;
        this.comments = comments;
    }
}
