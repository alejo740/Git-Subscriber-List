package com.edwincobos.subscribersapp.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.edwincobos.subscribersapp.R;
import com.edwincobos.subscribersapp.commons.utils.Constants;
import com.edwincobos.subscribersapp.subscriberslist.SubscribersListActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView logoImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        startAnimation();
        startTimer();
    }

    private void startAnimation() {
        logoImage = (ImageView) findViewById(R.id.splashLogo);

        logoImage.setScaleX(Constants.SPLASH_LOGO_ANIMATION.INIT_SCALE);
        logoImage.setScaleY(Constants.SPLASH_LOGO_ANIMATION.INIT_SCALE);
        logoImage.animate().
                setStartDelay(Constants.SPLASH_LOGO_ANIMATION.START_DELAY).
                setDuration(Constants.SPLASH_LOGO_ANIMATION.DURATION).
                scaleX(Constants.SPLASH_LOGO_ANIMATION.FINAL_SCALE).
                scaleY(Constants.SPLASH_LOGO_ANIMATION.FINAL_SCALE);
    }

    private void startTimer(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), SubscribersListActivity.class);
                startActivity(intent);
                finish();
            }
        }, Constants.SPLASH_DELAY);

    }
}
