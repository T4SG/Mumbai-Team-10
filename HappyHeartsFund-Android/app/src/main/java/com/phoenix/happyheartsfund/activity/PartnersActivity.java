package com.phoenix.happyheartsfund.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.phoenix.happyheartsfund.R;
import com.phoenix.happyheartsfund.common.ShareTask;

/*
Corporate Partners

Oshina Lalwani (11-07-2015)
 */

public class PartnersActivity extends RootActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partners);
        b =(Button)findViewById(R.id.button);

       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Uri x=Uri.parse("https://happyheartsfund.org");
               Intent i= new Intent(Intent.ACTION_VIEW,x);
               startActivity(i);
           }
       });

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
            ShareTask.Share(this, "https://happyheartsfund.org");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
