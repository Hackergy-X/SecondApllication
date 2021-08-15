package com.programming.leb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void none(View view) {
      EditText edittext=(EditText)findViewById(R.id.edittext);
      int YourYears= Integer.parseInt(edittext.getText().toString());
      int age=2020-YourYears;
        Toast.makeText(this,"age:"+ String.valueOf(age),Toast.LENGTH_LONG).show();
    }
}
