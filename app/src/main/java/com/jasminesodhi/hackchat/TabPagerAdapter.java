package com.jasminesodhi.hackchat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jasminesodhi.hackchat.Fragments.NotificationFragment;
import com.jasminesodhi.hackchat.Fragments.StartTimerFragment;
import com.jasminesodhi.hackchat.Fragments.UserFragment;

/**
 * Created by jasminesodhi on 21/06/17.
 */

public class TabPagerAdapter extends FragmentPagerAdapter{

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new UserFragment();
            case 1:
                return new NotificationFragment();
            case 2:
                return new StartTimerFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
