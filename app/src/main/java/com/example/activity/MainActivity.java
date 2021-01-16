package com.example.activity;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {


//    onCreate() is called when the Activity is created; that is,
//    it is launched or started. (Additionally, this triggers when
//    the orientation is changed.) It is called again when the process
//    is killed, then returned to. onStart() is called following
//    onCreate() at startup.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}