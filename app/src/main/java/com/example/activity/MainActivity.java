package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView view1;
    private ImageView view2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = (ImageView) findViewById(R.id.view1);
        view2 = (ImageView) findViewById(R.id.view2);
        view1.setOnClickListener(this);
        view2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.view1:
                Intent intent1 = new Intent(MainActivity.this,BioActivity.class);
                intent1.putExtra("name","Sai");
                Toast.makeText(MainActivity.this, "view1", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
                break;
            case R.id.view2:
                Intent intent2 = new Intent(MainActivity.this,BioActivity.class);
                intent2.putExtra("name","ashish");
                Toast.makeText(MainActivity.this, "view2", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
                break;
        }
    }
}

