package com.edwincobos.subscribersapp.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.edwincobos.subscribersapp.R;
import com.edwincobos.subscribersapp.commons.abstracts.AbstractActivity;
import com.edwincobos.subscribersapp.subscriberslist.SubscribersListActivity;

public class MainActivity extends AbstractActivity {

    private ImageView logoImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideBar();
        startAnimation();
        startTimer();
    }

    private void startAnimation() {
        logoImage = (ImageView) findViewById(R.id.splashLogo);

        logoImage.setScaleX(0.0f);
        logoImage.setScaleY(0.0f);
        logoImage.animate().setStartDelay(200).setDuration(1300).scaleX(1.0f).scaleY(1.0f);
    }

    private void startTimer(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), SubscribersListActivity.class);
                startActivity(intent);
                //overridePendingTransition(R.anim.effect_fade_in, R.anim.effect_fade_out);
                finish();
            }
        }, 3000);

    }
}
