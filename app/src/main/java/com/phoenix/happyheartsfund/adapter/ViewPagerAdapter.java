package com.phoenix.happyheartsfund.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.phoenix.happyheartsfund.fragment.*;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    // Fragments
    public MainFragmentTab1 mainFragmentTab1;
    public MainFragmentTab2 mainFragmentTab2;

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created

    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        mainFragmentTab1 = new MainFragmentTab1();
        mainFragmentTab2 = new MainFragmentTab2();

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
            return mainFragmentTab1;
        else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
            return mainFragmentTab2;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
