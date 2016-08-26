package com.edwincobos.subscribersapp.commons.abstracts;

import android.support.v7.app.AppCompatActivity;

/**
 * Abstract class to common methods for all activities.
 * @author edwin.cobos
 * @since 19/08/2016
 */
public abstract class AbstractActivity extends AppCompatActivity {

    protected void hideBar() {
        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

}
