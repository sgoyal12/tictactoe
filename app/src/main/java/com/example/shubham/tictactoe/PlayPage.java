package com.example.shubham.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class PlayPage extends AppCompatActivity {
Button btn1,btn2;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_page);
        tv=findViewById(R.id.tv);
        btn1=findViewById(R.id.pg);
        btn2=findViewById(R.id.exit);
        Animation animation = AnimationUtils.loadAnimation(PlayPage.this , R.anim.text) ;

        tv.startAnimation(animation);
        btn1.startAnimation(animation);
        btn2.startAnimation(animation);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sactive = new Intent(PlayPage.this,game.class);
                startActivity(sactive);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });


    }
}
