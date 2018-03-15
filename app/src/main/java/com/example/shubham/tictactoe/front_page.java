package com.example.shubham.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class front_page extends AppCompatActivity {
    Handler mhandler = new Handler();
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        image =findViewById(R.id.logo);
        Animation animation = AnimationUtils.loadAnimation(front_page.this , R.anim.logo) ;
        image.startAnimation(animation);

        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent sactive = new Intent(front_page.this,PlayPage.class);
                startActivity(sactive);
                finish();
            }
        },2000);
    }
}
