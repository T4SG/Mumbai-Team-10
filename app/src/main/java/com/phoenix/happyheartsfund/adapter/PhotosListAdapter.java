package com.phoenix.happyheartsfund.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.happyheartsfund.R;
import com.phoenix.happyheartsfund.common.ImageLoadTask;
import com.phoenix.happyheartsfund.models.Account;
import com.phoenix.happyheartsfund.models.DataSource;
import com.phoenix.happyheartsfund.models.ImagePost;

public class PhotosListAdapter extends ArrayAdapter<ImagePost> {

    Context mContext;

    public PhotosListAdapter(Context mContext, int layoutResourceId, ImagePost[] data) {
        super(mContext, layoutResourceId, data);
        this.mContext = mContext;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.fragment_main_tab2_listview_item, parent, false);
        }

        ImagePost imagePost = DataSource.photoPosts.get(position);
        Account account = DataSource.getAccount(imagePost.userID);

        ImageView image = (ImageView) convertView.findViewById(R.id.post_image);
        new ImageLoadTask(imagePost.imageURL, image).execute();
        ImageView userImage = (ImageView) convertView.findViewById(R.id.user_image);
        new ImageLoadTask(account.displayPicURL, userImage).execute();
        ((TextView) convertView.findViewById(R.id.username)).setText(account.userName);
        ((TextView) convertView.findViewById(R.id.message)).setText(imagePost.message);

        return convertView;
    }
}
