package com.bonaventurajason.twoactivitieschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private int buttonId;
    private Button mButtonOne;
    private Button mButtonTwo;
    private Button mButtonThree;
    private TextView mTextOne;
    private TextView mTextTwo;
    private TextView mTextThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mButtonOne = findViewById(R.id.button_text_one);
        mButtonTwo = findViewById(R.id.button_text_two);
        mButtonThree = findViewById(R.id.button_text_three);

        mTextTwo = findViewById(R.id.article_two);
        mTextThree = findViewById(R.id.article_three);
        mTextOne = findViewById(R.id.article_one);

        Intent intent = getIntent();
        buttonId =intent.getIntExtra(MainActivity.EXTRA_TEXT,0);

        switch (buttonId){
            case 1:
                mTextOne.setVisibility(View.VISIBLE);
                break;
            case 2:
                mTextTwo.setVisibility(View.VISIBLE);
                break;
            case 3:
                mTextThree.setVisibility(View.VISIBLE);
        }
    }
}
