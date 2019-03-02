package com.example.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText edit_numero1;
   EditText edit_numero2;
   TextView edit_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_numero1=(EditText) findViewById(R.id.edit_numero1);
        edit_numero2=(EditText) findViewById(R.id.edit_numero2);
        edit_resultado=(EditText) findViewById(R.id.edit_resultado);
    }

    public void Sumar(View v) {
        float numero1= Float.parseFloat(edit_numero1.getText().toString());
        float numero2= Float.parseFloat(edit_numero1.getText().toString());
        float resultado= numero1 + numero2;
        edit_resultado.setText(String.valueOf(""+resultado));
    }
    public void Restar(View v)
    {
        float numero1= Float.parseFloat(edit_numero1.getText().toString());
        float numero2= Float.parseFloat(edit_numero1.getText().toString());
        float resultado= numero1 - numero2;
        edit_resultado.setText(String.valueOf(""+resultado));
    }
    public void Multiplicar(View v)
    {
        float numero1= Float.parseFloat(edit_numero1.getText().toString());
        float numero2= Float.parseFloat(edit_numero1.getText().toString());
        float resultado= numero1 * numero2;
        edit_resultado.setText(String.valueOf(""+resultado));
    }
    public void Dividir(View v)
    {
        float numero1= Float.parseFloat(edit_numero1.getText().toString());
        float numero2= Float.parseFloat(edit_numero1.getText().toString());
        float resultado= numero1 / numero2;
        edit_resultado.setText(String.valueOf(""+resultado));
    }

    public void Modu1o(View v)
    {
        float numero1= Float.parseFloat(edit_numero1.getText().toString());
        float numero2= Float.parseFloat(edit_numero1.getText().toString());
        float resultado= numero1 % numero2;
        edit_resultado.setText(String.valueOf(""+resultado));
    }




    private void mostrar(double res) {
    }


}

