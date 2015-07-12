package com.phoenix.happyheartsfund.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.phoenix.happyheartsfund.R;

/*
Display splashscreen with donate button

Prachi Kevalramani (12-07-2015)
*/
public class SplashActivity extends RootActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ((LinearLayout) findViewById(R.id.l)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDonate(v);
            }
        });
    }

    public void OpenMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void OpenDonate(View view) {
        Intent intent = new Intent(this, DonateActivity.class);
        startActivity(intent);
    }
}
