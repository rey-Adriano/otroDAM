package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        res = findViewById(R.id.TVresultado);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.manu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void enviar(View view){
        float n1, n2, resul;
        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());
        resul = n1 + n2;
        res.setText("resultado " + resul);
    }





}