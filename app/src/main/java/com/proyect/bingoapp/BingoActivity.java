package com.proyect.bingoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BingoActivity extends AppCompatActivity {

    TextView numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bingo);

    }

    private List<Integer> generarTodosNumerosSecuencialmente(){
        final List<Integer> arrayBolas = new ArrayList<>();
        for(int i =0; i<90; i++){
            arrayBolas.add(i+1);
        }
        return arrayBolas;
    }

    public void empezar(View view) {

        numero = (TextView) findViewById(R.id.textBola);
        final List<Integer> arrayBolasInicial = this.sacarBolas();


        numero.post(new Runnable() {
            int i = 0;
            @Override
            public void run() {
                numero.setText((String) String.valueOf((arrayBolasInicial.get(i))+1));
                i++;
                if (i ==90)
                    i = 0;
                numero.postDelayed(this, 500);
                System.out.println(((arrayBolasInicial.get(i))+1));
            }
        });

    }


    public static List<Integer> sacarBolas() {
        int pos;
        int nBolas = 90;
        List< Integer > pCartas = new ArrayList<>();
        for (int i = 0; i < nBolas ; i++) {
            pos = (int) Math.floor(Math.random() * nBolas );
            while (pCartas.contains(pos)) {
                pos = (int) Math.floor(Math.random() * nBolas );
            }
            pCartas.add(pos);
        }
        System.out.println("Bolas. aleatorios sin repetición:");
        System.out.println(pCartas.toString());
        return pCartas;
    }

}