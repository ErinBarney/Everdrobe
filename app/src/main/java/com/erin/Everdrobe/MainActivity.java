package com.erin.Everdrobe;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.erin.Everdrobe.ui.account.AccountFragment;
import com.erin.Everdrobe.ui.point.PointFragment;
import com.erin.Everdrobe.ui.shopping.ShoppingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    Fragment currentFragment = null;
    FragmentTransaction ft;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_shopping:
                    currentFragment = new ShoppingFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, currentFragment);
                    ft.commit();
                    return true;
                case R.id.navigation_account:
                    currentFragment = new AccountFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, currentFragment);
                    ft.commit();
                    return true;
                case R.id.navigation_point:
                    currentFragment = new PointFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, currentFragment);
                    ft.commit();
                    return true;
            }

            return false;
        }


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ft = getSupportFragmentManager().beginTransaction();
        currentFragment = new ShoppingFragment();
        ft.replace(R.id.container, currentFragment);
        ft.commit();

        BottomNavigationView navView = (BottomNavigationView) findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }


}


