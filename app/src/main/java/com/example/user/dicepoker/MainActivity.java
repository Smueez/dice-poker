package com.example.user.dicepoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class MainActivity extends AppCompatActivity {

    public int[] x = new int[7];
    public int[] ax = new int[7];
    public int[] y = new int[7];
    public int[] ay = new int[7];
    public int[] dicep1={1,1,1,1,1};
    public int[] dicep2={1,1,1,1,1};
    public int sx=0,sy=0,cx=0,cy=0,sxl=0,syl=0,winx,winy,px=0,py=0;
    public  int[] qx={0,0,0,0,0};
    public  int[] qy={0,0,0,0,0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void picx1(View view){
    if(cx>0) {
        if (qx[0] % 2 == 0) {
            final ImageView imx1 = (ImageView) findViewById(R.id.picx1);
            imx1.animate().alpha(0.7f).setDuration(100);
            dicep1[0] = 0;
        } else if (qx[0] % 2 != 0) {
            final ImageView imx1 = (ImageView) findViewById(R.id.picx1);
            imx1.animate().alpha(1f).setDuration(100);
            dicep1[0] = 1;
        }
        qx[0]++;
    }
    }
    public void picx2(View view){
        if(cx!=0) {
            if (qx[1] % 2 == 0) {
                final ImageView imx1 = (ImageView) findViewById(R.id.picx2);
                imx1.animate().alpha(0.7f).setDuration(100);
                dicep1[1] = 0;
            } else if (qx[1] % 2 != 0) {
                final ImageView imx1 = (ImageView) findViewById(R.id.picx2);
                imx1.animate().alpha(1f).setDuration(100);
                dicep1[1] = 1;
            }
            qx[1]++;
        }
    }
    public void picx3(View view){
        if(cx!=0) {
            if (qx[2] % 2 == 0) {
                final ImageView imx1 = (ImageView) findViewById(R.id.picx3);
                imx1.animate().alpha(0.7f).setDuration(100);
                dicep1[2] = 0;
            } else if (qx[2] % 2 != 0) {
                final ImageView imx1 = (ImageView) findViewById(R.id.picx3);
                imx1.animate().alpha(1f).setDuration(100);
                dicep1[2] = 1;
            }
            qx[2]++;
        }
    }
    public void picx4(View view){
        if(cx!=0) {
            if (qx[3] % 2 == 0) {
                final ImageView imx1 = (ImageView) findViewById(R.id.picx4);
                imx1.animate().alpha(0.7f).setDuration(100);
                dicep1[3] = 0;
            } else if (qx[3] % 2 != 0) {
                final ImageView imx1 = (ImageView) findViewById(R.id.picx4);
                imx1.animate().alpha(1f).setDuration(100);
                dicep1[3] = 1;
            }
            qx[3]++;
        }
    }
    public void picx5(View view){
            if (cx != 0) {
                if (qx[4] % 2 == 0) {
                    final ImageView imx1 = (ImageView) findViewById(R.id.picx5);
                    imx1.animate().alpha(0.7f).setDuration(100);
                    dicep1[4] = 0;
                } else if (qx[4] % 2 != 0) {
                    final ImageView imx1 = (ImageView) findViewById(R.id.picx5);
                    imx1.animate().alpha(1f).setDuration(100);
                    dicep1[4] = 1;
                }
                qx[4]++;
            }
    }
    public void picy1(View view){
        if(cy!=0) {
            if (qy[0] % 2 == 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy1);
                imy1.animate().alpha(0.7f).setDuration(100);
                dicep2[0] = 0;
            } else if (qy[0] % 2 != 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy1);
                imy1.animate().alpha(1f).setDuration(100);
                dicep2[0] = 1;
            }
            qy[0]++;
        }
    }
    public void picy2(View view){
        if(cy!=0) {
            if (qy[1] % 2 == 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy2);
                imy1.animate().alpha(0.7f).setDuration(100);
                dicep2[1] = 0;
            } else if (qy[1] % 2 != 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy2);
                imy1.animate().alpha(1f).setDuration(100);
                dicep2[1] = 1;
            }
            qy[1]++;
        }
    }
    public void picy3(View view){
        if(cy!=0) {
            if (qy[2] % 2 == 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy3);
                imy1.animate().alpha(0.7f).setDuration(100);
                dicep2[2] = 0;
            } else if (qy[2] % 2 != 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy3);
                imy1.animate().alpha(1f).setDuration(100);
                dicep2[2] = 1;
            }
            qy[2]++;
        }
    }
    public void picy4(View view){
        if(cy!=0) {
            if (qy[3] % 2 == 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy4);
                imy1.animate().alpha(0.7f).setDuration(100);
                dicep2[3] = 0;
            } else if (qy[3] % 2 != 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy4);
                imy1.animate().alpha(1f).setDuration(100);
                dicep2[3] = 1;
            }
            qy[3]++;
        }
    }
    public void picy5(View view){
        if(cy!=0) {
            if (qy[4] % 2 == 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy5);
                imy1.animate().alpha(0.7f).setDuration(100);
                dicep2[4] = 0;
            } else if (qy[4] == 0) {
                final ImageView imy1 = (ImageView) findViewById(R.id.picy5);
                imy1.animate().alpha(1f).setDuration(100);
                dicep2[4] = 1;
            }
            qy[4]++;
        }
    }
    public void Roll1(View view) {
        cx++;
        final ImageView imx1 = (ImageView) findViewById(R.id.picx1);
        final ImageView imx2 = (ImageView) findViewById(R.id.picx2);
        final ImageView imx3 = (ImageView) findViewById(R.id.picx3);
        final ImageView imx4 = (ImageView) findViewById(R.id.picx4);
        final ImageView imx5 = (ImageView) findViewById(R.id.picx5);

        if(dicep1[0]==1) {
            Random randx1 = new Random();
            x[0] = randx1.nextInt(6) + 1;

            if (x[0] == 1) {
                imx1.setImageResource(R.drawable.one);
            } else if (x[0] == 5) {
                imx1.setImageResource(R.drawable.five);
            } else if (x[0] == 2) {
                imx1.setImageResource(R.drawable.two);
            } else if (x[0] == 3) {
                imx1.setImageResource(R.drawable.three);
            } else if (x[0] == 4) {
                imx1.setImageResource(R.drawable.four);
            } else {
                imx1.setImageResource(R.drawable.six);
            }
        }
        if(dicep1[1]==1) {

            Random randx2 = new Random();
            x[1] = randx2.nextInt(6) + 1;

            if (x[1] == 1) {
                imx2.setImageResource(R.drawable.one);
            } else if (x[1] == 5) {
                imx2.setImageResource(R.drawable.five);
            } else if (x[1] == 2) {
                imx2.setImageResource(R.drawable.two);
            } else if (x[1] == 3) {
                imx2.setImageResource(R.drawable.three);
            } else if (x[1] == 4) {
                imx2.setImageResource(R.drawable.four);
            } else {
                imx2.setImageResource(R.drawable.six);
            }
        }
        if(dicep1[2]==1) {
            Random randx3 = new Random();
            x[2] = randx3.nextInt(6) + 1;

            if (x[2] == 1) {
                imx3.setImageResource(R.drawable.one);
            } else if (x[2] == 5) {
                imx3.setImageResource(R.drawable.five);
            } else if (x[2] == 2) {
                imx3.setImageResource(R.drawable.two);
            } else if (x[2] == 3) {
                imx3.setImageResource(R.drawable.three);
            } else if (x[2] == 4) {
                imx3.setImageResource(R.drawable.four);
            } else {
                imx3.setImageResource(R.drawable.six);
            }
        }
        if(dicep1[3]==1) {
            Random randx4 = new Random();
            x[3] = randx4.nextInt(6) + 1;

            if (x[3] == 1) {
                imx4.setImageResource(R.drawable.one);
            } else if (x[3] == 5) {
                imx4.setImageResource(R.drawable.five);
            } else if (x[3] == 2) {
                imx4.setImageResource(R.drawable.two);
            } else if (x[3] == 3) {
                imx4.setImageResource(R.drawable.three);
            } else if (x[3] == 4) {
                imx4.setImageResource(R.drawable.four);
            } else {
                imx4.setImageResource(R.drawable.six);
            }
        }
        if(dicep1[4]==1) {
            Random randx5 = new Random();
            x[4] = randx5.nextInt(6) + 1;

            if (x[4] == 1) {
                imx5.setImageResource(R.drawable.one);
            } else if (x[4] == 5) {
                imx5.setImageResource(R.drawable.five);
            } else if (x[4] == 2) {
                imx5.setImageResource(R.drawable.two);
            } else if (x[4] == 3) {
                imx5.setImageResource(R.drawable.three);
            } else if (x[4] == 4) {
                imx5.setImageResource(R.drawable.four);
            } else {
                imx5.setImageResource(R.drawable.six);
            }
        }
        if(cx==3) {
            Set<Integer> setx = new TreeSet<Integer>();
            for (int i = 0; i < 5; i++) {
                ax[i] = x[i];
                setx.add(x[i]);
                sx += x[i];
                Log.d("x: "," "+ax[i]);
            }
            Log.d("setx"," "+setx);
            Arrays.sort(ax);
            sxl = setx.size();
            if(sxl==1){
                winx=7;
            }
            else if(sxl==2){
                int max=0;
                for(int i=0;i<5;i++){
                    for(int j=i;j<5;j++) {
                        if (ax[i] == ax[j]) {
                            px++;
                        }
                    }
                    if(max<px){
                        max=px;
                    }
                    px=0;
                }
                Log.d("max "," "+max);
                if(max==4){
                    winx=6;
                }
                else if(max==3){
                    winx=5;
                }
                px=0;
            }
            else if(sxl==3){
                int max=0;
                for(int i=0;i<5;i++){
                    for(int j=i;j<5;j++) {
                        if (x[i] == x[j]) {
                            px++;
                        }
                    }
                    if(max<px){
                        max=px;
                    }
                    px=0;
                }
                Log.d("max "," "+max);
                if(max==2){
                    winx=2;
                }
                else if(max==3) {
                    winx=3;
                }
                px=0;
            }
            else if(sxl==4){
                winx=1;
            }
            else if(sxl==5){
                winx=4;
            }

        }
        Log.d("winx: "," "+winx);
    }
    public void Roll2(View view){
        cy++;
        final ImageView imy1 = (ImageView) findViewById(R.id.picy1);
        final ImageView imy2 = (ImageView) findViewById(R.id.picy2);
        final ImageView imy3 = (ImageView) findViewById(R.id.picy3);
        final ImageView imy4 = (ImageView) findViewById(R.id.picy4);
        final ImageView imy5 = (ImageView) findViewById(R.id.picy5);
        if(dicep2[0]==1) {
            Random randy1 = new Random();
            y[0] = randy1.nextInt(6) + 1;

            if (y[0] == 1) {
                imy1.setImageResource(R.drawable.one);
            } else if (y[0] == 5) {
                imy1.setImageResource(R.drawable.five);
            } else if (y[0] == 2) {
                imy1.setImageResource(R.drawable.two);
            } else if (y[0] == 3) {
                imy1.setImageResource(R.drawable.three);
            } else if (y[0] == 4) {
                imy1.setImageResource(R.drawable.four);
            } else {
                imy1.setImageResource(R.drawable.six);
            }
        }
        if(dicep2[1]==1) {
            Random randy2 = new Random();
            y[1] = randy2.nextInt(6) + 1;

            if (y[1] == 1) {
                imy2.setImageResource(R.drawable.one);
            } else if (y[1] == 5) {
                imy2.setImageResource(R.drawable.five);
            } else if (y[1] == 2) {
                imy2.setImageResource(R.drawable.two);
            } else if (y[1] == 3) {
                imy2.setImageResource(R.drawable.three);
            } else if (y[1] == 4) {
                imy2.setImageResource(R.drawable.four);
            } else {
                imy2.setImageResource(R.drawable.six);
            }
        }
        if(dicep2[2]==1) {
            Random randy3 = new Random();
            y[2] = randy3.nextInt(6) + 1;

            if (y[2] == 1) {
                imy3.setImageResource(R.drawable.one);
            } else if (y[2] == 5) {
                imy3.setImageResource(R.drawable.five);
            } else if (y[2] == 2) {
                imy3.setImageResource(R.drawable.two);
            } else if (y[2] == 3) {
                imy3.setImageResource(R.drawable.three);
            } else if (y[2] == 4) {
                imy3.setImageResource(R.drawable.four);
            } else {
                imy3.setImageResource(R.drawable.six);
            }
        }
        if(dicep2[3]==1) {
            Random randy4 = new Random();
            y[3] = randy4.nextInt(6) + 1;

            if (y[3] == 1) {
                imy4.setImageResource(R.drawable.one);
            } else if (y[3] == 5) {
                imy4.setImageResource(R.drawable.five);
            } else if (y[3] == 2) {
                imy4.setImageResource(R.drawable.two);
            } else if (y[3] == 3) {
                imy4.setImageResource(R.drawable.three);
            } else if (y[3] == 4) {
                imy4.setImageResource(R.drawable.four);
            } else {
                imy4.setImageResource(R.drawable.six);
            }
        }
        if(dicep2[4]==1) {
            Random randy5 = new Random();
            y[4] = randy5.nextInt(6) + 1;

            if (y[4] == 1) {
                imy5.setImageResource(R.drawable.one);
            } else if (y[4] == 5) {
                imy5.setImageResource(R.drawable.five);
            } else if (y[4] == 2) {
                imy5.setImageResource(R.drawable.two);
            } else if (y[4] == 3) {
                imy5.setImageResource(R.drawable.three);
            } else if (y[4] == 4) {
                imy5.setImageResource(R.drawable.four);
            } else {
                imy5.setImageResource(R.drawable.six);
            }
        }
        Set<Integer> sety = new TreeSet<Integer>();
        if(cy==3) {

            for (int i = 0; i < 5; i++) {
                ay[i] = y[i];
                sy += y[i];
                sety.add(y[i]);
                Log.d("y array "," "+ay[i]);

            }
            Log.d("setx"," "+sety);
            Arrays.sort(ay);
            syl=sety.size();
            if(syl==1){
                winy=7;
            }
            else if(syl==2){
                int may = 0;
                for(int i=0;i<5;i++){
                    for(int j=i;j<5;j++) {
                        if (ay[i] == ay[j]) {
                            py++;
                        }
                    }
                    if(may<py){
                        may=py;
                    }
                    py=0;
                }
                Log.d("may "," "+may);
                if(may+1==4){
                    winy=6;
                }
                else if(may+1==3){
                    winy=5;
                }
                py=0;
            }
            else if(syl==3){
                int may=0;
                for(int i=0;i<5;i++) {
                    for (int j = i; j < 5; j++) {
                        if (ay[i] == ay[j]) {
                            py++;
                        }
                    }
                    if (may < py) {
                        may = py;
                    }
                    py=0;
                }
                Log.d("may "," "+may);
                if(may==2){
                    winy=2;
                }
                else if(may==3) {
                    winy=3;
                }
                py=0;
            }
            else if(syl==4){
                winy=1;
            }
            else if(syl==5){
                winy=4;
            }
            Log.d("winy "," "+winy);
            win();
        }
    }


   public void win(){


        if(winx>winy){
            LinearLayout pop = (LinearLayout)findViewById(R.id.pop);
            pop.setVisibility(View.VISIBLE);
            TextView text = (TextView) findViewById(R.id.poptxt);
            if(winx==7){
                text.setText("Player 1 has won with FIVE OF THE KIND!");

            }
            else if(winx==6){
                text.setText("Player 1 has won with FOUR OF THE KIND!");

            }
            else if(winx==5){
                text.setText("Player 1 has won with FULL HOUSE!");

            }
            else if(winx==4){
                text.setText("Player 1 has won with STRAIGHT!");

            }
            else if(winx==3){
                text.setText("Player 1 has won with THREE OF A KIND!");

            }
            else if(winx==2){
                text.setText("Player 1 has won with TWO PAIR!");

            }
            else if(winx==1){
                text.setText("Player 1 has won with ONE PAIR!");

            }
        }
        else if(winx<winy){
            LinearLayout pop = (LinearLayout)findViewById(R.id.pop);
            pop.setVisibility(View.VISIBLE);
            TextView text = (TextView) findViewById(R.id.poptxt);
            if(winy==7){
                text.setText("Player 2 has won with FIVE OF THE KIND!");

            }
            else if(winy==6){
                text.setText("Player 2 has won with FOUR OF THE KIND!");

            }
            else if(winx==5){
                text.setText("Player 1 has won with FULL HOUSE!");

            }
            else if(winy==4){
                text.setText("Player 2 has won with STRAIGHT!");

            }
            else if(winy==3){
                text.setText("Player 2 has won with THREE OF A KIND!");

            }
            else if(winy==2){
                text.setText("Player 2 has won with TWO PAIR!");

            }
            else if(winy==1){
                text.setText("Player 2 has won with ONE PAIR!");

            }
        }
        else {
            LinearLayout pop = (LinearLayout)findViewById(R.id.pop);
            pop.setVisibility(View.VISIBLE);
            TextView text = (TextView) findViewById(R.id.poptxt);
            text.setText("Match is DRAW!");
        }
    }
    public void play(View view){
        for(int i=0;i<5;i++) {
            x[i]=1;
            y[i]=1;
            dicep1[i]=1;
            dicep2[i]=1;
            qx[i]=0;
            qy[0]=0;
        }
        cx=0;cy=0;syl=0;sy=0;sxl=0;sx=0;winx=0;winy=0;px=0;py=0;
        ImageView imx1 = (ImageView) findViewById(R.id.picx1);
        final ImageView imx2 = (ImageView) findViewById(R.id.picx2);
        final ImageView imx3 = (ImageView) findViewById(R.id.picx3);
        final ImageView imx4 = (ImageView) findViewById(R.id.picx4);
        final ImageView imx5 = (ImageView) findViewById(R.id.picx5);
        final ImageView imy1 = (ImageView) findViewById(R.id.picy1);
        final ImageView imy2 = (ImageView) findViewById(R.id.picy2);
        final ImageView imy3 = (ImageView) findViewById(R.id.picy3);
        final ImageView imy4 = (ImageView) findViewById(R.id.picy4);
        final ImageView imy5 = (ImageView) findViewById(R.id.picy5);
        imx1.setImageResource(R.drawable.one);
        imx2.setImageResource(R.drawable.one);
        imx3.setImageResource(R.drawable.one);
        imx4.setImageResource(R.drawable.one);
        imx5.setImageResource(R.drawable.one);
        imy1.setImageResource(R.drawable.one);
        imy2.setImageResource(R.drawable.one);
        imy3.setImageResource(R.drawable.one);
        imy4.setImageResource(R.drawable.one);
        imy5.setImageResource(R.drawable.one);

        imx1.animate().alpha(1f).setDuration(100);

        imx2.animate().alpha(1f).setDuration(100);

        imx3.animate().alpha(1f).setDuration(100);

        imx4.animate().alpha(1f).setDuration(100);

        imx5.animate().alpha(1f).setDuration(100);

        imy1.animate().alpha(1f).setDuration(100);

        imy2.animate().alpha(1f).setDuration(100);

        imy3.animate().alpha(1f).setDuration(100);

        imy4.animate().alpha(1f).setDuration(100);

        imy5.animate().alpha(1f).setDuration(100);

        LinearLayout lay = (LinearLayout) findViewById(R.id.pop);
        lay.setVisibility(View.INVISIBLE);

    }
    public void back(View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
    public void ruleimg(View view){
        ImageView img = (ImageView) findViewById(R.id.rule);
        img.animate().alpha(1f).setDuration(10);
    }
}
