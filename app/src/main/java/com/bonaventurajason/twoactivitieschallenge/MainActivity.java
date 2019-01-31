package com.bonaventurajason.twoactivitieschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.bonaventurajason.extra.TEXT";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchTextOne(View view) {

        Intent intent =new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT, 1);
        startActivity(intent);
    }

    public void launchTextTwo(View view) {
        Intent intent =new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT, 2 );
        startActivity(intent);
    }

    public void launchTextThree(View view) {
        Intent intent =new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT, 3 );
        startActivity(intent);
    }
}
