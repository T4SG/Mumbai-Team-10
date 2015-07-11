package com.phoenix.happyheartsfund.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.phoenix.happyheartsfund.R;


public class viewProfile extends AppCompatActivity {

    TextView tvName,tvHeart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        tvName = (TextView) findViewById(R.id.textViewName);
        tvHeart  = (TextView) findViewById(R.id.textViewHeart);

    }
}
