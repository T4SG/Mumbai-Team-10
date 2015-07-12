package com.phoenix.happyheartsfund.models;

import android.content.Context;
import android.os.AsyncTask;
import android.text.Html;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.phoenix.happyheartsfund.fragment.MainFragmentTab1;
import com.phoenix.happyheartsfund.fragment.MainFragmentTab2;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.UUID;

import com.phoenix.happyheartsfund.common.DownloadWebPageTask;

public class DataSource {

    public static Context mContext;

    public static MainFragmentTab1 mainFragmentTab1;
    public static MainFragmentTab2 mainFragmentTab2;

    public static ArrayList<Account> userAccounts;
    public static ArrayList<MessagePost> experiencePosts;
    public static ArrayList<ImagePost> photoPosts;

    public static void loadData(Context context) {
        mContext = context;
        DownloadWebPageTask downloadWebPageTask = new DownloadWebPageTask(1);
        downloadWebPageTask.execute("http://ec2-52-69-88-33.ap-northeast-1.compute.amazonaws.com/connectAccount.php");
    }

    public static Account getAccount(String uuid) {
        for (int i = 0; i < userAccounts.size(); i++) {
            if (uuid.equals(userAccounts.get(i).uniqueID))
                return userAccounts.get(i);
        }
        return null;
    }
}
