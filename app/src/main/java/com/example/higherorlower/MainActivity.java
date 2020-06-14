package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n ;
public void ranDomN(){
    Random rand= new Random();
    n =rand.nextInt(20)+1;
}
    public void guess(View view) {

    Log.i("Info", Integer.toString(n));
    EditText editText = (EditText) findViewById(R.id.editTextNumber);
    int guessInt = Integer.parseInt(editText.getText().toString());
    String message;
    if (guessInt>n){
        message="LOWER";

    }
    else if(guessInt<n){
        message="HIGHER";


    }
    else{
        message="you got it ..Try Again";
        ranDomN();
    }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
}


protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ranDomN();
    }
}