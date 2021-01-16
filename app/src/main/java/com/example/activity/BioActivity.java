package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView petName;

    private Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = (ImageView) findViewById(R.id.imageView);
        petName = (TextView) findViewById(R.id.textView);

        extras = getIntent().getExtras();

        if(extras != null){
            String name = extras.getString("name");
            petName.setText(name.toString());
            setUp(name);
        }

    }


    public void setUp(String name){

        if(name.equals("sai")){

            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher));
            petName.setText(name);

        }else if(name.equals("ashish")){

            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher));
            petName.setText(name);
        }

    }

}