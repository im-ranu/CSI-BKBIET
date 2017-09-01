package com.csi_bkbiet;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Frag_home frag_home = new Frag_home();
                    FragmentTransaction transaction_home = getSupportFragmentManager().beginTransaction();
                    transaction_home.replace(R.id.content, frag_home);
                    transaction_home.addToBackStack(null);
                    transaction_home.commit();
                    return true;
                case R.id.navigation_notice:

                    Frag_notice newFragment = new Frag_notice();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.content, newFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;
                case R.id.navigation_events:
                    Frag_events frag_notification = new Frag_events();
                    FragmentTransaction transaction_not = getSupportFragmentManager().beginTransaction();
                    transaction_not.replace(R.id.content, frag_notification);
                    transaction_not.addToBackStack(null);
                    transaction_not.commit();
                    return true;

                case R.id.navigation_scanner:
                    Frag_scanner frag_scanner = new Frag_scanner();
                    FragmentTransaction transaction_scan = getSupportFragmentManager().beginTransaction();
                    transaction_scan.replace(R.id.content, frag_scanner);
                    transaction_scan.addToBackStack(null);
                    transaction_scan.commit();
                    return true;

                case R.id.navigation_feedback:
                    Frag_feedback frag_feedback = new Frag_feedback();
                    FragmentTransaction transaction_feed = getSupportFragmentManager().beginTransaction();
                    transaction_feed.replace(R.id.content, frag_feedback);
                    transaction_feed.addToBackStack(null);
                    transaction_feed.commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);



        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Frag_home frag_home = new Frag_home();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.content,frag_home,"Hello").commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
