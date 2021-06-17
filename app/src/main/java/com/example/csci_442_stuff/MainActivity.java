package com.example.csci_442_stuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastButton = findViewById(R.id.toastButton);
        toastButton.setOnClickListener(this);
        Button activityButton = findViewById(R.id.newActivityButton);
        activityButton.setOnClickListener(this);
        Button talkButton = findViewById(R.id.talkButton);
        talkButton.setOnClickListener(this);


    }
    public void onClick(View view){
        if(view.getId() == R.id.toastButton){
            Toast.makeText(this, "Hello CSCI 442", Toast.LENGTH_LONG).show();
        }
        if(view.getId() == R.id.newActivityButton){
            Toast.makeText(this, "Start New Activity", Toast.LENGTH_LONG).show();
            startSecondActivity();

        }
        if(view.getId() == R.id.talkButton){
            Toast.makeText(this, "Start Talking", Toast.LENGTH_LONG).show();
            startTalkActivity();

        }


    }
    public void startSecondActivity(){
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);

    }
    public void startTalkActivity(){
        Intent talkActivity = new Intent(this, TalkActivity.class);
        startActivity(talkActivity);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}