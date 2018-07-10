package com.example.yusuf.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yusuf.miwok.NumbersFragment;
import com.example.yusuf.miwok.R;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
    }
}