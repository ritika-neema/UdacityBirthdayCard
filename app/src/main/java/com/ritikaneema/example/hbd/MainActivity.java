package com.ritikaneema.example.hbd;

import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity; //since v7 is not working now so we have to import this
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;



public class MainActivity extends AppCompatActivity {

    ImageView imgView1,imgView2,imgView3,imgView4,imgView5,imgView6,imgView7,imgView8,imgView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imgView1=(ImageView) findViewById(R.id.imageView);
        imgView2=(ImageView) findViewById(R.id.imageView2);
        imgView3=(ImageView) findViewById(R.id.imageView3);
        imgView4=(ImageView) findViewById(R.id.imageView4);
        imgView5=(ImageView) findViewById(R.id.imageView5);
        imgView6=(ImageView) findViewById(R.id.imageView6);
        imgView7=(ImageView) findViewById(R.id.imageView7);
        imgView8=(ImageView) findViewById(R.id.imageView8);
        imgView9=(ImageView) findViewById(R.id.imageView9);


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                imgView1.animate().translationYBy(-2000f).setDuration(5500);
                imgView2.animate().translationYBy(-1850f).setDuration(5000);
                imgView3.animate().translationYBy(-2000f).setDuration(5000);
                imgView4.animate().translationYBy(-1950f).setDuration(6000);
                imgView5.animate().translationYBy(-1900f).setDuration(5000);
                imgView6.animate().translationYBy(-2000f).setDuration(4000);
                imgView7.animate().translationYBy(-1850f).setDuration(4500);
                imgView8.animate().translationYBy(-1950f).setDuration(5500);
                imgView9.animate().translationYBy(-2000f).setDuration(5000);


            }
        }, 2000);

    }
}
