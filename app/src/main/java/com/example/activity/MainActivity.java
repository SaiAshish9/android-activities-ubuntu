package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    private final int REQUEST_CODE = 2;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE){

            if(resultCode == RESULT_OK){
                String result = data.getStringExtra("returnData");
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
            }

        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn =(Button) findViewById(R.id.showButtonID);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Message","Main Activity");
                intent.putExtra("Message1","Main Activity this side");
                intent.putExtra("value",123);

//                startActivity(intent);
                startActivityForResult(intent,REQUEST_CODE);

//                startActivity(new Intent(MainActivity.this,SecondActivity.class));



            }
        });




    }


//    Pixels(px) – corresponds to actual pixels on the screen. This is used if you want to give in terms of absolute pixels for width or height.
//
//            Density-independent Pixels (dp or dip) – an abstract unit that is based on the physical density of the screen. These units are relative to a 160 dpi screen, so one dp is one pixel on a 160 dpi screen. The ratio of dp-to-pixel will change with the screen density, but not necessarily in direct proportion. Note: The compiler accepts both “dip” and “dp”, though “dp” is more consistent with “sp”.
//
//    Scale-independent Pixels(sp) – this is like the dp unit, but it is also scaled by the user’s font size preference. It is recommend you use this unit when specifying font sizes, so they will be adjusted for both the screen density and user’s preference.
//
//    Always use dp and sp only. sp for font sizes and dp for everything else. It will make UI compatible for Android devices with different densities.

}