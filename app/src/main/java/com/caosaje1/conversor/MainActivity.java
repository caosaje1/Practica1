package com.caosaje1.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePesos, eDolares;
    Button bConvertir;
    Double pesos,dolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePesos = (EditText) findViewById(R.id.ePesos);
        eDolares = (EditText) findViewById(R.id.eDolares);
        bConvertir = (Button) findViewById(R.id.bDolares);

        bConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!ePesos.getText().toString().equals("") && eDolares.getText().toString().equals("")){
                    pesos = Double.parseDouble(ePesos.getText().toString());
                    dolares = pesos / 3000;
                    eDolares.setText(String.valueOf(dolares));
                } else {
                    if (ePesos.getText().toString().equals("") && !eDolares.getText().toString().equals("")) {
                        dolares = Double.parseDouble(eDolares.getText().toString());
                        pesos = dolares * 3000;
                        ePesos.setText(String.valueOf(pesos));
                    } else {
                        if (ePesos.getText().toString().equals("") && eDolares.getText().toString().equals("")) {
                            Toast.makeText(getApplicationContext(), "Debe digitar un valor", Toast.LENGTH_SHORT).show();
                        } else {
                            if (!ePesos.getText().toString().equals("") && !eDolares.getText().toString().equals("")) {
                                Toast.makeText(getApplicationContext(), "ERROR: Solo debe digitar un valor", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }
        });

    }
}
