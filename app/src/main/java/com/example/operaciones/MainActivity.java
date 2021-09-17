package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    EditText n1,n2,n3;
    Button btnSumar;
    Button btnRestar;
    Button btnMultiplicar;
    Button btnDivir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.resultado);
        btnSumar = findViewById(R.id.suma);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(n1.getEditableText().toString()) ;
                int numero2 = Integer.parseInt(n2.getEditableText().toString()) ;
                int resultado;
                resultado= numero1+numero2;
                n3.setText("La suma es: "+resultado);
            }
        });
        btnRestar = findViewById(R.id.resta);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(n1.getEditableText().toString()) ;
                int numero2 = Integer.parseInt(n2.getEditableText().toString()) ;
                int resultado;
                resultado= numero1-numero2;
                n3.setText("La resta es: "+resultado);
            }
        });
        btnMultiplicar= findViewById(R.id.multiplicacion);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(n1.getEditableText().toString()) ;
                int numero2 = Integer.parseInt(n2.getEditableText().toString()) ;
                int resultado;
                resultado= numero1*numero2;
                n3.setText("La multiplicación es: "+resultado);
            }
        });
        btnDivir = findViewById(R.id.division);
        btnDivir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(n1.getEditableText().toString()) ;
                int numero2 = Integer.parseInt(n2.getEditableText().toString()) ;
                int resultado;
                resultado= numero1/numero2;
                n3.setText("La Division es: "+resultado);
            }
        });

    }


}