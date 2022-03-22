package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    
    private static final String ENVIARMSG = "com.example.myapplication";
    
    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void enviarMsg(View view){
        Intent it = new Intent(this, ActivityReceive.class);
        
        EditText txt = (EditText) findViewById(R.id.enviarMsg);
        String msg = txt.getText().toString();
        it.putExtra(ENVIARMSG, msg);
        
        startActivity(it);
    }
    
}