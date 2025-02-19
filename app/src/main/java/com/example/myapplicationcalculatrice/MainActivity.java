package com.example.myapplicationcalculatrice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //declaration des variables
    private EditText firstNumber, secondNumber;
    private Button btnPlus, btnSous, btnMult, btnDiv;
    private TextView result;
    private String val1, val2, res;

    private int resultInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//affectation des variables
        firstNumber = findViewById(R.id.first_number);
        secondNumber = findViewById(R.id.second_number);
        btnPlus = findViewById(R.id.btn_plus);
        btnSous = findViewById(R.id.btn_sous);
        btnMult = findViewById(R.id.btn_mult);
        btnDiv = findViewById(R.id.btn_div);
        result = findViewById(R.id.result);


        // Actions

        btnPlus.setOnClickListener(v -> {

            val1 = firstNumber.getText().toString();
            val2 = secondNumber.getText().toString();
            resultInt = Integer.parseInt(val1) + Integer.parseInt(val2);
            res = Integer.toString(resultInt);
            result.setText("Resultat=" + res);
        });

        btnSous.setOnClickListener(v -> {

            val1 = firstNumber.getText().toString();
            val2 = secondNumber.getText().toString();
            resultInt = Integer.parseInt(val1) - Integer.parseInt(val2);
            res = Integer.toString(resultInt);
            result.setText("Resultat=" + res);
        });

        btnMult.setOnClickListener(v -> {

            val1 = firstNumber.getText().toString();
            val2 = secondNumber.getText().toString();
            resultInt = Integer.parseInt(val1) * Integer.parseInt(val2);
            res = Integer.toString(resultInt);
            result.setText("Resultat=" + res);
        });



    }
}