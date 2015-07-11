package com.phoenix.happyheartsfund.common;

import android.content.Context;
import android.content.Intent;

import com.phoenix.happyheartsfund.R;

/**
 * Created by Ronak on 12-07-2015.
 */
public class ShareTask {

    public static void Share(Context context,String body) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, body);
        context.startActivity(Intent.createChooser(sharingIntent, context.getResources().getString(R.string.share_using)));
    }
}
