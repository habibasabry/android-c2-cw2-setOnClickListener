package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.FirstNumber);
        EditText num2 = findViewById(R.id.SecondNumber);

        Button cal = findViewById(R.id.calculate);
        TextView result = findViewById(R.id.total);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int FirstNumber = Integer.parseInt(num1.getText().toString());
                int SecondNumber = Integer.parseInt(num2.getText().toString());
                int total = FirstNumber + SecondNumber;
                result.setText(total + "");
            }
        });
    }
}