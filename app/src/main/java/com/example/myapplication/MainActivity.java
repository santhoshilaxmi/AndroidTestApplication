package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private EditText num1;
    private EditText num2;
    private Button add, multiply, substract;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        num1 = (EditText) findViewById(R.id.editTextNumber);
        num2 = (EditText) findViewById(R.id.editTextNumber2);
        
        add = (Button) findViewById(R.id.Addbutton);

        multiply = (Button) findViewById(R.id.Mulbutton3);

        substract = (Button) findViewById(R.id.Subbutton2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int sum = number1+number2;

                Intent launchActivity2 = new Intent(getApplicationContext(), MainActivity2.class);
                launchActivity2.putExtra("Sum",sum);
                MainActivity.this.startActivity(launchActivity2);
                finish();
            }
        });

                multiply.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number1 = Integer.parseInt(num1.getText().toString());
                        int number2 = Integer.parseInt(num2.getText().toString());

                        int sum = number1*number2;

                        Intent launchActivity2 = new Intent(getApplicationContext(), MainActivity2.class);
                        launchActivity2.putExtra("Sum",sum);
                        MainActivity.this.startActivity(launchActivity2);
                        finish();
                    }
                });

                        substract.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int number1 = Integer.parseInt(num1.getText().toString());
                                int number2 = Integer.parseInt(num2.getText().toString());

                                int sum = number1-number2;

                                Intent launchActivity2 = new Intent(getApplicationContext(), MainActivity2.class);
                                launchActivity2.putExtra("Sum",sum);
                                MainActivity.this.startActivity(launchActivity2);
                            }
                        }

        );
    }
}