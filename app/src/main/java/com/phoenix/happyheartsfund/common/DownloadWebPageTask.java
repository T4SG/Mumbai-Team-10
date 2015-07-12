package com.phoenix.happyheartsfund.common;

import android.os.AsyncTask;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.phoenix.happyheartsfund.models.Account;
import com.phoenix.happyheartsfund.models.DataSource;
import com.phoenix.happyheartsfund.models.ImagePost;
import com.phoenix.happyheartsfund.models.MessagePost;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Ronak on 12-07-2015.
 */
public class DownloadWebPageTask extends AsyncTask<String, Void, String> {

    int type;

    public DownloadWebPageTask(int type) {
        this.type = type;
    }

    @Override
    protected String doInBackground(String... urls) {
        String response = "";
        for (String url : urls) {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(url);
            try {
                HttpResponse execute = client.execute(httpGet);
                InputStream content = execute.getEntity().getContent();

                BufferedReader buffer = new BufferedReader(
                        new InputStreamReader(content));
                String s = "";
                while ((s = buffer.readLine()) != null) {
                    response += s;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return response;
    }

    @Override
    protected void onPostExecute(String result) {
        if (type == 1) {
            Gson gson = new Gson();
            DataSource.userAccounts = gson.fromJson(result, new TypeToken<ArrayList<Account>>(){}.getType());
            DownloadWebPageTask downloadWebPageTask = new DownloadWebPageTask(2);
            downloadWebPageTask.execute("http://ec2-52-69-88-33.ap-northeast-1.compute.amazonaws.com/connect.php");
        } else if (type == 2) {
            Gson gson = new Gson();
            DataSource.experiencePosts = gson.fromJson(result, new TypeToken<ArrayList<MessagePost>>() {}.getType());
            DownloadWebPageTask downloadWebPageTask = new DownloadWebPageTask(3);
            downloadWebPageTask.execute("http://ec2-52-69-88-33.ap-northeast-1.compute.amazonaws.com/connectImage.php");
            DataSource.mainFragmentTab1.initializeListView();
        } else if (type == 3) {
            Gson gson = new Gson();
            DataSource.photoPosts = gson.fromJson(result, new TypeToken<ArrayList<ImagePost>>() {}.getType());
            DataSource.mainFragmentTab2.InitializeListView();
        }
    }
}