package com.phoenix.happyheartsfund.models;

public class Account {

    public String uniqueID;
    public String userName;
    public String password;
    public String displayPicURL;

    public Account(String uniqueID, String userName, String password, String displayPicURL) {
        this.uniqueID = uniqueID;
        this.userName = userName;
        this.password = password;
        this.displayPicURL = displayPicURL;
    }
}