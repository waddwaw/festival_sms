package com.example.li.festival_sms;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewParent;

import com.example.li.festival_sms.fragment.FetivalCategaryFragment;
import com.example.li.festival_sms.fragment.SmsHistoryFragment;

public class MainActivity extends AppCompatActivity {


            private TabLayout mTabLayout ;
            private ViewPager mViewPager ;
            private String[] mTitles = new String[]{"节日短信","已发记录","BUG好难"};
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                initViews();
    }

    private void initViews() {
            mTabLayout = (TabLayout) findViewById(R.id.id_tablayout);
            mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

            mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
                @Override
                public Fragment getItem(int position) {
                    if(position == 1){
                        return  new SmsHistoryFragment();
                    }
                    return new FetivalCategaryFragment();
                }

                @Override
                public int getCount() {
                    return mTitles.length;
                }

                @Override
                public CharSequence getPageTitle(int position) {
                    return mTitles[position];
                }
            });
            mTabLayout.setupWithViewPager(mViewPager);


    }

}
