package com.phoenix.happyheartsfund.models;

import java.util.ArrayList;

public class ImagePost extends MessagePost
{
    public String imageURL;

    public ImagePost(String userID, String uniqueID, String message, String imageURL, double likeCount, ArrayList<Comment> comments) {
        super(userID, uniqueID, message, likeCount, comments);
        this.imageURL = imageURL;
    }
}
