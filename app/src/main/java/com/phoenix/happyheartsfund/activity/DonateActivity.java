package com.phoenix.happyheartsfund.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.phoenix.happyheartsfund.R;
import com.phoenix.happyheartsfund.common.ShareTask;

/*
Donate page with different options for donation

Vinita Kundnani (11-07-2015)
*/
public class DonateActivity extends RootActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_share, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            ShareTask.Share(this, "https://happyheartsfund.org/donate/");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openLink(View v)
    {
        Uri uri1;
        uri1 = Uri.parse("http://happyheartsfund.org/donate/");
        Intent intent1 = new Intent(Intent.ACTION_VIEW,uri1);
        startActivity(intent1);
    }

    public void openLinkPay5(View v)
    {
        ShareTask.Share(this, "Hey! I just earned 5 hearts by donating to Happy Hearts Fund. You can too, by visiting http://happyheartsfund.org/donate/");
    }

    public void openLinkPay10(View v)
    {
        ShareTask.Share(this, "Hey! I just earned 10 hearts by donating to Happy Hearts Fund. You can too, by visiting http://happyheartsfund.org/donate/");
    }

    public void openLinkPay20(View v)
    {
        ShareTask.Share(this, "Hey! I just earned 20 hearts by donating to Happy Hearts Fund. You can too, by visiting http://happyheartsfund.org/donate/");
    }
}
