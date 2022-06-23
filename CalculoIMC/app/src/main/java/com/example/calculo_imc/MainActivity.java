package com.example.calculo_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.numPeso);
        altura = findViewById(R.id.numAlt);
        resultado = findViewById(R.id.result);
        rbMasc = findViewById(R.id.rbMasc);
        rbFem = findViewById(R.id.rbFem);

    }
    EditText peso, altura;
    TextView resultado;
    RadioButton rbMasc, rbFem;

    public void Calcular(View view){

        double numPeso, numAltura,result;
        boolean rbM, rbF;

        numPeso = Double.parseDouble(peso.getText().toString());
        numAltura = Double.parseDouble(altura.getText().toString());
        result = Double.parseDouble(resultado.getText().toString());
        rbM = Boolean.parseBoolean(rbMasc.getText().toString());
        rbF = Boolean.parseBoolean(rbFem.getText().toString());
        double valor;



        if(rbM = true){
             valor = numPeso/(numAltura * numAltura);

                     resultado.setText("Seu IMC é de: ");
        }



        resultado.setText(Double.valueOf(result).toString());



    }
}