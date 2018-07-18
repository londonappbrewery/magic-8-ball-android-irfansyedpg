package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] arryImage={
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         img=(ImageView)findViewById(R.id.img);
        Button btn=(Button)findViewById(R.id.btn_);



        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Random rdm=new Random();
        int number=rdm.nextInt(5);

        img.setImageResource(arryImage[number]);


    }
}
