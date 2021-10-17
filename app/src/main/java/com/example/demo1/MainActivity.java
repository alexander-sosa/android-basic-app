package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // aqui hay que crear todos los elementos creados en el xml
    EditText etNumero;
    Button btPrimo, btNuevo;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // relacionar objetos con xml
        etNumero = findViewById(R.id.etNumero);
        btPrimo = findViewById(R.id.btPrimo);
        btNuevo = findViewById(R.id.btNuevo);
        tvResultado = findViewById(R.id.tvResultado);

        // asociar eventos
        btPrimo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int n = Integer.parseInt(etNumero.getText().toString());
                Primo obj = new Primo(n);
                if(obj.isPrime()){
                    tvResultado.setText(n + " es primo");
                }
                else
                    tvResultado.setText(n + " no es primo");
            }
        });

        btNuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                etNumero.setText(null);
                tvResultado.setText(null);
                etNumero.requestFocus();
            }
        });
    }
}