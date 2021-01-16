package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity1 extends Activity {


//    onCreate() is called when the Activity is created; that is,
//    it is launched or started. (Additionally, this triggers when
//    the orientation is changed.) It is called again when the process
//    is killed, then returned to. onStart() is called following
//    onCreate() at startup.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"OnCreate",Toast.LENGTH_LONG).show();
    }

//    The difference is that MainActivity.this refers to the
//    current activity ( context ) whereas the getApplicationContext() \
//    refers to the Application class.

    @Override
    protected void onStart() {
        super.onStart();

        

        Toast.makeText(MainActivity1.this,"OnStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"OnDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(MainActivity1.this,"OnPostResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity1.this,"OnStop",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity1.this,"OnPause",Toast.LENGTH_LONG).show();
    }
}