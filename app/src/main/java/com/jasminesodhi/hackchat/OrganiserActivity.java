package com.jasminesodhi.hackchat;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jasminesodhi on 21/06/17.
 */

public class OrganiserActivity extends AppCompatActivity{

    TabLayout tabLayout;
    TabPagerAdapter tabPagerAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organiser_window);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        tabLayout.addTab(tabLayout.newTab().setText("Manage Users"), 0);
        tabLayout.addTab(tabLayout.newTab().setText("Notifications"), 1);
        tabLayout.addTab(tabLayout.newTab().setText("Set Timer"), 2);

        tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabPagerAdapter);
    }
}
