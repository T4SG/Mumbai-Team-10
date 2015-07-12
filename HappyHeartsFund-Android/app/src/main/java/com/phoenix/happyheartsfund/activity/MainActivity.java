package com.phoenix.happyheartsfund.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.phoenix.happyheartsfund.R;
import com.phoenix.happyheartsfund.adapter.ViewPagerAdapter;
import com.phoenix.happyheartsfund.common.SlidingTabLayout;
import com.phoenix.happyheartsfund.models.DataSource;

/*
The main page with 2 tabs and action buttons

Ronak Manglani (11-07-2015)
 */
public class MainActivity extends RootActivity {

    // Variables for sliding tabs
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[] = new CharSequence[2];
    int NumOfTabs = 2;

    // Page Initialization
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeSlidingTabs();
        DataSource.loadData(this);
    }
    protected void initializeSlidingTabs() {
        // Initialize titles
        Titles[0] = getResources().getString(R.string.main_tab1_title);
        Titles[1] = getResources().getString(R.string.main_tab2_title);

        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewPagerAdapter(getSupportFragmentManager(), Titles, NumOfTabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assigning the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.ColorTextLight);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
    }

    // ActionBar Events
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_donate) {
            Intent intent = new Intent(this, DonateActivity.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.action_login)
        {
            Uri x=Uri.parse("http://ec2-52-69-88-33.ap-northeast-1.compute.amazonaws.com/loginh.php");
            Intent i= new Intent(Intent.ACTION_VIEW,x);
            startActivity(i);
            return true;
        }
        else if (id == R.id.action_contact) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("message/rfc822");
            i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"info@happyheartsfund.org"});
            i.putExtra(Intent.EXTRA_SUBJECT, "Happy Hearts Fund");
            try
            {
                startActivity(Intent.createChooser(i, "Send mail..."));
            }
            catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        else if (id == R.id.action_partners) {
            Intent intent = new Intent(this, PartnersActivity.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
