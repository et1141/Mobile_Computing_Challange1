package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_view, Fragment1.class, null)
                .commit(); // from activity - container

    }

    protected void sth(View el){
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.fragment_view, Fragment2.class, null)
//                .commit(); // from activity - container
    }

    public void switchToFr2() {
                getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_view, Fragment2.class, null)
                .commit(); // from activity - container
    }
    public void switchToFr1() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_view, Fragment1.class, null)
                .commit(); // from activity - container
    }
}