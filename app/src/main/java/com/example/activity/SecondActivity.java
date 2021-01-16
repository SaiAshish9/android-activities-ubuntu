package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView showMessage;
    private Button backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();

        showMessage = (TextView) findViewById(R.id.showMessage);
        backBtn = (Button) findViewById(R.id.goBack);

        if(extras != null){
            String message = extras.getString("Message");
            int myInt = extras.getInt("value");
            showMessage.setText(message + " " + String.valueOf(myInt));
        }


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retuenIntent = getIntent();
                retuenIntent.putExtra("returnData","From second");
                setResult(RESULT_OK,retuenIntent);
                finish();
            }
        });


    }




}