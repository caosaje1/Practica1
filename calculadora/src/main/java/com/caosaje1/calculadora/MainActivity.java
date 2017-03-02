package com.caosaje1.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2, b3, b4, b5, b6, b7, b8, b9, bDiv, bPor, bMas, bMenos, bPunto, bC, bIgual;
    EditText eNumero, eConcatenar;
    double numero1, numero2, resultado;
    String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bPunto = (Button) findViewById(R.id.bPunto);
        bIgual = (Button) findViewById(R.id.bIgual);
        bMas = (Button) findViewById(R.id.bMas);
        bMenos = (Button) findViewById(R.id.bMenos);
        bDiv = (Button) findViewById(R.id.bDiv);
        bPor = (Button) findViewById(R.id.bPor);
        bC = (Button) findViewById(R.id.bC);
        eNumero = (EditText)findViewById(R.id.eNumero);

        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "0");

            }

        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "1");

            }

        });


        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "2");

            }

        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "3");

            }

        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "4");

            }

        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "5");

            }

        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "6");

            }

        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "7");

            }

        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "8");

            }

        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + "9");

            }

        });


        bPunto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(eConcatenar.getText().toString() + ".");

            }

        });
        bIgual.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          eConcatenar = (EditText) findViewById(R.id.eNumero);
                                          numero2 = Double.parseDouble(eConcatenar.getText().toString());
                                          if (operador.equals("+")) {
                                              eNumero.setText("");
                                              resultado = numero1 + numero2;
                                          }
                                          if (operador.equals("-")) {
                                              eNumero.setText("");
                                              resultado = numero1 - numero2;
                                          }
                                          if (operador.equals("*")) {
                                              eNumero.setText("");
                                              resultado = numero1 * numero2;
                                          }
                                          if (operador.equals("/")) {
                                              eNumero.setText("");
                                              if (numero2 != 0) {
                                                  resultado = numero1 / numero2;
                                              } else {
                                                  eNumero.setText("Infinito");
                                              }
                                          }
                                          eNumero.setText(String.valueOf(resultado));
                                      }
                                  });

        bMas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                operador = "+";

                eConcatenar = (EditText) findViewById(R.id.eNumero);
                numero1 = Double.parseDouble(eConcatenar.getText().toString());
                eNumero.setText("");

            }



        });


        bMenos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operador = "-";
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                numero1 = Double.parseDouble(eConcatenar.getText().toString());
                eNumero.setText("");
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operador = "/";
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                numero1 = Double.parseDouble(eConcatenar.getText().toString());
                eNumero.setText("");
            }
        });

        bPor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operador = "*";
                eConcatenar = (EditText)findViewById(R.id.eNumero);
                numero1 = Double.parseDouble(eConcatenar.getText().toString());
                eNumero.setText("");
            }
        });




        bC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                eNumero.setText("");

            }
        });
    }
}
