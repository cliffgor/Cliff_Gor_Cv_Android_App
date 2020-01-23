package com.cliffgor.cliffgor_cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cliffgor.cliffgor_cv.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar() .hide();
        setHomeFragment();
    }




    void setHomeFragment (){
        getSupportFragmentManager().beginTransaction().replace(R.id.conainer, new HomeFragment()).commit() ;
    }
}
