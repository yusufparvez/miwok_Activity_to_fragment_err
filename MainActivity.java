package com.example.yusuf.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    MediaPlayer mediaPlayer;
    public TextView numberTextView, colorsTextView, familyMembersTextView, phrasesTextView;
    public void init() {
        numberTextView = (TextView) findViewById(R.id.numbers_text_view);
        colorsTextView = (TextView) findViewById(R.id.colors_text_view);
        familyMembersTextView = (TextView) findViewById(R.id.family_members_text_view);
        phrasesTextView = (TextView) findViewById(R.id.phrases_text_view);


       numberTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i_openNumbersActivity = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i_openNumbersActivity);
            }
        });

        colorsTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i_openColorsActivity = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i_openColorsActivity);
            }
        });

        familyMembersTextView.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent i_openFamilyMembersActivity = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(i_openFamilyMembersActivity);
            }
        });

        phrasesTextView.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent i_openPhrasesActivity = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i_openPhrasesActivity);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}
