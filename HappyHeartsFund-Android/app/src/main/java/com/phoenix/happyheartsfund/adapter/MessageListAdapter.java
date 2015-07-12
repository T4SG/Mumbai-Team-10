package com.phoenix.happyheartsfund.adapter;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.happyheartsfund.common.ImageLoadTask;
import com.phoenix.happyheartsfund.models.Account;
import com.phoenix.happyheartsfund.models.DataSource;
import com.phoenix.happyheartsfund.models.MessagePost;
import com.phoenix.happyheartsfund.R;

import java.util.ArrayList;

public class MessageListAdapter extends ArrayAdapter<MessagePost> {

    Context mContext;
    String baseURL = "http://ec2-52-69-88-33.ap-northeast-1.compute.amazonaws.com/";

    public MessageListAdapter(Context mContext, int layoutResourceId, MessagePost[] data) {
        super(mContext, layoutResourceId, data);
        this.mContext = mContext;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.fragment_main_tab1_listview_item, parent, false);
        }

        MessagePost messagePost = DataSource.experiencePosts.get(position);
        Account account = DataSource.getAccount(messagePost.userID);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        new ImageLoadTask(baseURL + account.displayPicURL, imageView).execute();
        TextView username = (TextView) convertView.findViewById(R.id.username);
        username.setText(account.userName);
        TextView message = (TextView) convertView.findViewById(R.id.message);
        message.setText(messagePost.message);

        return convertView;
    }
}