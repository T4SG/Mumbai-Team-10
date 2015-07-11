package com.phoenix.happyheartsfund.models;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class DataSource {

    public static ArrayList<Account> userAccounts;
    public static ArrayList<MessagePost> experiencePosts;
    public static ArrayList<ImagePost> photoPosts;

    public static void loadData() {
        loadAccounts();
        loadMessages();
        loadPhotos();
    }
    public static void loadAccounts() {
        userAccounts = new ArrayList<Account>();
        userAccounts.add(new Account(UUID.randomUUID().toString(),
                "Laura Giannini",
                "tsec",
                "http://happyheartsfund.org/wp-content/uploads/2014/06/Laura-for-website.jpg"));
        userAccounts.add(new Account(UUID.randomUUID().toString(),
                "Olga Ruggeiro",
                "tsec",
                "http://happyheartsfund.org/wp-content/uploads/2014/06/Olga-photo-for-website.jpg"));
        userAccounts.add(new Account(UUID.randomUUID().toString(),
                "Petra Nemcova",
                "tsec",
                "http://happyheartsfund.org/wp-content/uploads/2014/06/HHF_ABOUT_06.jpg"));
    }
    public static void loadMessages() {
        experiencePosts = new ArrayList<MessagePost>();
        experiencePosts.add(new MessagePost(userAccounts.get(2).uniqueID,
                UUID.randomUUID().toString(),
                "The frequency of natural disasters in the country has cost billions of dollars, and countless lives have been lost.",0,
                new ArrayList<Comment>()));

        experiencePosts.add(new MessagePost(userAccounts.get(2).uniqueID,
                UUID.randomUUID().toString(),
                "The lack of resources needed to prepare for natural disasters and to rehabilitate communities in their aftermath furthers the cycle of poverty, which then leaves the country unprepared for future disasters creating a second destructive cycle",0,
                new ArrayList<Comment>()));

        experiencePosts.add(new MessagePost(userAccounts.get(0).uniqueID,
                UUID.randomUUID().toString(),
                "The evidence shows that weak infrastructure not only disrupts businesses but also classes, which leads to long-term indirect effects to the economy",0,
                new ArrayList<Comment>()));
        experiencePosts.add(new MessagePost(userAccounts.get(1).uniqueID,
                UUID.randomUUID().toString(),
                "The frequency of natural disasters in the country has cost billions of dollars, and countless lives have been lost.",0,
                new ArrayList<Comment>()));

        experiencePosts.add(new MessagePost(userAccounts.get(1).uniqueID,
                UUID.randomUUID().toString(),
                "The lack of resources needed to prepare for natural disasters and to rehabilitate communities in their aftermath furthers the cycle of poverty, which then leaves the country unprepared for future disasters creating a second destructive cycle",0,
                new ArrayList<Comment>()));

        experiencePosts.add(new MessagePost(userAccounts.get(0).uniqueID,
                UUID.randomUUID().toString(),
                "The evidence shows that weak infrastructure not only disrupts businesses but also classes, which leads to long-term indirect effects to the economy",0,
                new ArrayList<Comment>()));
        experiencePosts.add(new MessagePost(userAccounts.get(0).uniqueID,
                UUID.randomUUID().toString(),
                "The frequency of natural disasters in the country has cost billions of dollars, and countless lives have been lost.",0,
                new ArrayList<Comment>()));

        experiencePosts.add(new MessagePost(userAccounts.get(2).uniqueID,
                UUID.randomUUID().toString(),
                "The lack of resources needed to prepare for natural disasters and to rehabilitate communities in their aftermath furthers the cycle of poverty, which then leaves the country unprepared for future disasters creating a second destructive cycle",0,
                new ArrayList<Comment>()));

        experiencePosts.add(new MessagePost(userAccounts.get(2).uniqueID,
                UUID.randomUUID().toString(),
                "The evidence shows that weak infrastructure not only disrupts businesses but also classes, which leads to long-term indirect effects to the economy",0,
                new ArrayList<Comment>()));
    }
    public static void loadPhotos() {
        photoPosts = new ArrayList<ImagePost>();

        photoPosts.add(new ImagePost(userAccounts.get(2).uniqueID,
                UUID.randomUUID().toString(),
                "HHF can help avert the loss of instructional time, when students would be unproductive and parents would have had to stop working or to arrange care for their children.",
                "http://happyheartsfund.org/wp-content/uploads/2014/06/Pic-21.jpg", 0,
                new ArrayList<Comment>()));

        photoPosts.add(new ImagePost(userAccounts.get(2).uniqueID,
                UUID.randomUUID().toString(),
                "HHF can help avert the loss of instructional time, when students would be unproductive and parents would have had to stop working or to arrange care for their children.",
                "http://happyheartsfund.org/wp-content/uploads/2014/06/Pic-11.jpg", 0,
                new ArrayList<Comment>()));
    }

    public static Account getAccount(String uuid) {
        for (int i = 0; i < userAccounts.size(); i++) {
            if (userAccounts.get(i).uniqueID == uuid)
                return userAccounts.get(i);
        }
        return null;
    }
}
