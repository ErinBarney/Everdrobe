package com.erin.Everdrobe;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.erin.Everdrobe.R;
import com.erin.Everdrobe.ui.account.AccountFragment;
import com.erin.Everdrobe.ui.point.HowToFragment;
import com.erin.Everdrobe.ui.point.PointFragment;
import com.erin.Everdrobe.ui.point.SustainableClothesFragment;
import com.erin.Everdrobe.ui.shopping.ShoppingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


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
                    ft.replace(R.id.FrameLayout_activity, currentFragment);
                    ft.commit();
                    return true;
                case R.id.navigation_account:
                    currentFragment = new AccountFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.FrameLayout_activity, currentFragment);
                    ft.commit();
                    return true;
                case R.id.navigation_point:
                    currentFragment = new PointFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.FrameLayout_activity, currentFragment);
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
        ft.replace(R.id.FrameLayout_activity, currentFragment);
        ft.commit();

        BottomNavigationView navigation = (BottomNavigationView)
                findViewById(R.id.mobile_navigation); navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}


