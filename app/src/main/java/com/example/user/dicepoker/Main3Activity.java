package com.example.user.dicepoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void multi(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void single(View view){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    public void yes(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void no(View view){
        RelativeLayout exit =(RelativeLayout)findViewById(R.id.popexit);
        exit.setVisibility(View.INVISIBLE);
    }
    public void exit(View view){
        RelativeLayout exit =(RelativeLayout)findViewById(R.id.popexit);
        exit.setVisibility(View.VISIBLE);


    }

    public void rule(View view){
        RelativeLayout img = (RelativeLayout) findViewById(R.id.rules);
        img.setVisibility(View.VISIBLE);
    }
    public void ruleimg(View view){
        RelativeLayout img = (RelativeLayout) findViewById(R.id.rules);
        img.setVisibility(View.INVISIBLE);
    }
}
