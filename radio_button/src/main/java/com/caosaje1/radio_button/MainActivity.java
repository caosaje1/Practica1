package com.caosaje1.radio_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText eRadio, eLado, eBase, eAltura, eLado1, eLado2, eLadoc, ePerimetro, eArea, eVolumen;
    RadioGroup RadioButton;
    RadioButton r1, r2, r3, r4;
    Button bCalcular;
    Double area, perimetro, volumen, radio, lado, base, altura, lado1, lado2, ladoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eRadio = (EditText) findViewById(R.id.eRadio);
        eLado = (EditText) findViewById(R.id.eLado);
        eBase = (EditText) findViewById(R.id.eBase);
        eAltura = (EditText) findViewById(R.id.eAltura);
        eLado1 = (EditText) findViewById(R.id.eLado1);
        eLado2 = (EditText) findViewById(R.id.eLado2);
        eLadoc = (EditText) findViewById(R.id.eLadoc);
        ePerimetro = (EditText) findViewById(R.id.ePerimetro);
        eArea = (EditText) findViewById(R.id.eArea);
        eVolumen = (EditText) findViewById(R.id.eVolumen);
        r1 = (RadioButton) findViewById(R.id.rCirculo);
        r2 = (RadioButton) findViewById(R.id.rCuadro);
        r3 = (RadioButton) findViewById(R.id.rTriangulo);
        r4 = (RadioButton) findViewById(R.id.rCubo);
        bCalcular = (Button) findViewById(R.id.bCalcular);
        RadioButton = (RadioGroup) findViewById(R.id.RadioButton);


        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        if (r1.isChecked() == true) {
                            radio = Double.parseDouble(eRadio.getText().toString());
                            perimetro = ((2) * (3.1416) * (radio));
                            area = ((radio) * (radio) * (3.1416));
                        } else if (r2.isChecked() == true) {
                            lado = Double.parseDouble(eLado.getText().toString());
                            perimetro = ((4) * (lado));
                            area = ((lado) * (lado));

                            ePerimetro.setText(String.valueOf(perimetro));
                            eArea.setText(String.valueOf(area));
                        } else if (r3.isChecked() == true) {
                            base = Double.parseDouble(eBase.getText().toString());
                            lado1 = Double.parseDouble(eLado1.getText().toString());
                            lado2 = Double.parseDouble(eLado2.getText().toString());
                            altura = Double.parseDouble(eAltura.getText().toString());
                            perimetro = ((base) + (lado1) + (lado2));
                            area = (((base) * (altura)) / (2));
                        } else if (r4.isChecked() == true)

                        {
                            ladoc = Double.parseDouble(eLadoc.getText().toString());

                            area = ((6) * (ladoc));
                            volumen = ((ladoc) * (ladoc) * (ladoc));
                        }
                ePerimetro.setText(String.valueOf(perimetro));
                eArea.setText(String.valueOf(area));
                eVolumen.setText(String.valueOf(volumen));
                }
        });
    }
}

