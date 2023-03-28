package com.ifz2126006.pizzaorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Button button;
    public final String LOGTAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button = (Button) findViewById(R.id.button4);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openactivity2();
        }
    });
    }
public void openactivity2(){
     Intent intent = new Intent(this, Customise.class);
     startActivity(intent);
}



}