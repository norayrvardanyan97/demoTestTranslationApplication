package com.haat.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.localazy.android.Localazy;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Localazy.setEnabled(true);
        Localazy.forceUpdate();
        TextView appNameTextView = (TextView) findViewById(R.id.appNameTextView);
        Log.d("TAG", "onCreate: local text - " + getResources().getString(R.string.app_name));
        String text = Localazy.getString(this, R.string.app_name);
        Log.d("TAG", "onCreate: remote text - " + text);
        appNameTextView.setText(text);
    }
}
