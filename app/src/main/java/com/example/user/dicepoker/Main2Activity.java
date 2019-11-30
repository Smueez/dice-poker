package com.example.user.dicepoker;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Intent intent = new Intent(this, Main3Activity.class);
        new CountDownTimer(10000, 2000) {
            public void onFinish() {


                startActivity(intent);//sada

            }

            public void onTick(long millisUntilFinished) {
                ImageView img = (ImageView) findViewById(R.id.imageView2);
                ImageView img1 = (ImageView)findViewById(R.id.imageView1);

                img.animate().alpha(0f).setDuration(5000);



                img1.animate().alpha(1f).setDuration(2000);
            }
        }.start();


    }

}
