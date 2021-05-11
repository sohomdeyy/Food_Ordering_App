package com.example.tomato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class mainmenu extends AppCompatActivity {
    Button signmail,signphone,signup;
    ImageView bgimage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        signmail = findViewById(R.id.button);
        signphone = findViewById(R.id.button2);
        signup = findViewById(R.id.button6);
        bgimage = findViewById(R.id.back2);

        final Animation zoomin = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        final Animation zoomout = AnimationUtils.loadAnimation(this, R.anim.zoomout);
        bgimage.setAnimation(zoomin);
        bgimage.setAnimation(zoomout);
        zoomout.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bgimage.setAnimation(zoomin);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        zoomin.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bgimage.setAnimation(zoomout);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        signmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(mainmenu.this, chooseone.class);
                intent1.putExtra("Home", "Mail");
                startActivity(intent1);
                //finish();
            }
        });
        signphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(mainmenu.this, chooseone.class);
                intent2.putExtra("Home", "Phone");
                startActivity(intent2);
                //finish();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(mainmenu.this, chooseone.class);
                intent3.putExtra("Home", "SignUp");
                startActivity(intent3);
                //finish();
            }
        });
    }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            System.gc();

    }
}