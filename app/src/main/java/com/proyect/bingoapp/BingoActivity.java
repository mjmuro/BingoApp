package com.proyect.bingoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BingoActivity extends AppCompatActivity {

    TextView numero, bola, tiempoRegulable, lineaOBingo;
    Button inicioPausa;
    int tiempo = 1000;
    String estado=null;

    int i = 0;
    List<Integer> arrayBolasInicial = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bingo);
        tiempoRegulable = (TextView) findViewById(R.id.textTiempo);
        inicioPausa = (Button)findViewById(R.id.buttonInicioPausa);
        numero = (TextView) findViewById(R.id.textBola);
        lineaOBingo = (TextView) findViewById(R.id.buttonLinea);
    }


    private void iniciarOPausar(){
       if (null == estado){
           inicioPausa.setText("Pausar");
           estado="I"; //INICIADO
       }else if (estado.equalsIgnoreCase("I")){
           inicioPausa.setText("Reanudar");
           estado="P"; //PAUSADO
       }else{
           inicioPausa.setText("Pausar");
           estado="I"; //INICIADO
       }
    }
    public void empezar(View view) {
      numero = (TextView) findViewById(R.id.textBola);
        iniciarOPausar();
        arrayBolasInicial = this.sacarBolas();
        lineaOBingo.setVisibility(View.VISIBLE);

        numero.post(new Runnable() {

            @Override
            public void run() {

            if (null != estado && estado.equalsIgnoreCase("I")){
                if (i < 90){
                    numero.setText((String) String.valueOf((arrayBolasInicial.get(i))+1));
                    rellenarBolas((arrayBolasInicial.get(i))+1, R.drawable.circulo_rojo);
                    numero.postDelayed(this, tiempo);
                    System.out.println(((arrayBolasInicial.get(i))+1));
                    i++;
                }else{
                    numero.removeCallbacks(this);
                }


                }

            }
        });

    }

    public void reiniciar(View view) {

        arrayBolasInicial = this.sacarBolas();
        inicioPausa.setText("Comenzar");
        estado="P"; //PAUSADO
        numero.setText("");
        lineaOBingo.setVisibility(View.GONE);
        i=0;
        numero.post(new Runnable() {
            int z = 0;

            @Override
            public void run() {


                if (z < 90){

                    rellenarBolas(z+1, R.drawable.circulo);
                    numero.postDelayed(this, 5);

                    z++;
                }else{
                    numero.removeCallbacks(this);
                }


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

    private void rellenarBolas(int bolaSacada, int colorBola){
        if (bolaSacada==1){
            bola = (TextView) findViewById(R.id.Numero1);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==2){
            bola = (TextView) findViewById(R.id.Numero2);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==3){
            bola = (TextView) findViewById(R.id.Numero3);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==4){
            bola = (TextView) findViewById(R.id.Numero4);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==5){
            bola = (TextView) findViewById(R.id.Numero5);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==6){
            bola = (TextView) findViewById(R.id.Numero6);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==7){
            bola = (TextView) findViewById(R.id.Numero7);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==8){
            bola = (TextView) findViewById(R.id.Numero8);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==9){
            bola = (TextView) findViewById(R.id.Numero9);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==10){
            bola = (TextView) findViewById(R.id.Numero10);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==11){
            bola = (TextView) findViewById(R.id.Numero11);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==12){
            bola = (TextView) findViewById(R.id.Numero12);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==13){
            bola = (TextView) findViewById(R.id.Numero13);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==14){
            bola = (TextView) findViewById(R.id.Numero14);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==15){
            bola = (TextView) findViewById(R.id.Numero15);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==16){
            bola = (TextView) findViewById(R.id.Numero16);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==17){
            bola = (TextView) findViewById(R.id.Numero17);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==18){
            bola = (TextView) findViewById(R.id.Numero18);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==19){
            bola = (TextView) findViewById(R.id.Numero19);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==20){
            bola = (TextView) findViewById(R.id.Numero20);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==21){
            bola = (TextView) findViewById(R.id.Numero21);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==22){
            bola = (TextView) findViewById(R.id.Numero22);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==23){
            bola = (TextView) findViewById(R.id.Numero23);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==24){
            bola = (TextView) findViewById(R.id.Numero24);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==25){
            bola = (TextView) findViewById(R.id.Numero25);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==26){
            bola = (TextView) findViewById(R.id.Numero26);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==27){
            bola = (TextView) findViewById(R.id.Numero27);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==28){
            bola = (TextView) findViewById(R.id.Numero28);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==29){
            bola = (TextView) findViewById(R.id.Numero29);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==30){
            bola = (TextView) findViewById(R.id.Numero30);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==31){
            bola = (TextView) findViewById(R.id.Numero31);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==32){
            bola = (TextView) findViewById(R.id.Numero32);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==33){
            bola = (TextView) findViewById(R.id.Numero33);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==34){
            bola = (TextView) findViewById(R.id.Numero34);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==35){
            bola = (TextView) findViewById(R.id.Numero35);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==36){
            bola = (TextView) findViewById(R.id.Numero36);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==37){
            bola = (TextView) findViewById(R.id.Numero37);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==38){
            bola = (TextView) findViewById(R.id.Numero38);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==39){
            bola = (TextView) findViewById(R.id.Numero39);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==40){
            bola = (TextView) findViewById(R.id.Numero40);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==41){
            bola = (TextView) findViewById(R.id.Numero41);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==42){
            bola = (TextView) findViewById(R.id.Numero42);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==43){
            bola = (TextView) findViewById(R.id.Numero43);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==44){
            bola = (TextView) findViewById(R.id.Numero44);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==45){
            bola = (TextView) findViewById(R.id.Numero45);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==46){
            bola = (TextView) findViewById(R.id.Numero46);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==47){
            bola = (TextView) findViewById(R.id.Numero47);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==48){
            bola = (TextView) findViewById(R.id.Numero48);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==49){
            bola = (TextView) findViewById(R.id.Numero49);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==50){
            bola = (TextView) findViewById(R.id.Numero50);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==51){
            bola = (TextView) findViewById(R.id.Numero51);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==52){
            bola = (TextView) findViewById(R.id.Numero52);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==53){
            bola = (TextView) findViewById(R.id.Numero53);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==54){
            bola = (TextView) findViewById(R.id.Numero54);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==55){
            bola = (TextView) findViewById(R.id.Numero55);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==56){
            bola = (TextView) findViewById(R.id.Numero56);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==57){
            bola = (TextView) findViewById(R.id.Numero57);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==58){
            bola = (TextView) findViewById(R.id.Numero58);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==59){
            bola = (TextView) findViewById(R.id.Numero59);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==60){
            bola = (TextView) findViewById(R.id.Numero60);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==61){
            bola = (TextView) findViewById(R.id.Numero61);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==62){
            bola = (TextView) findViewById(R.id.Numero62);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==63){
            bola = (TextView) findViewById(R.id.Numero63);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==64){
            bola = (TextView) findViewById(R.id.Numero64);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==65){
            bola = (TextView) findViewById(R.id.Numero65);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==66){
            bola = (TextView) findViewById(R.id.Numero66);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==67){
            bola = (TextView) findViewById(R.id.Numero67);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==68){
            bola = (TextView) findViewById(R.id.Numero68);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==69){
            bola = (TextView) findViewById(R.id.Numero69);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==70){
            bola = (TextView) findViewById(R.id.Numero70);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==71){
            bola = (TextView) findViewById(R.id.Numero71);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==72){
            bola = (TextView) findViewById(R.id.Numero72);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==73){
            bola = (TextView) findViewById(R.id.Numero73);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==74){
            bola = (TextView) findViewById(R.id.Numero74);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==75){
            bola = (TextView) findViewById(R.id.Numero75);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==76){
            bola = (TextView) findViewById(R.id.Numero76);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==77){
            bola = (TextView) findViewById(R.id.Numero77);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==78){
            bola = (TextView) findViewById(R.id.Numero78);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==79){
            bola = (TextView) findViewById(R.id.Numero79);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==80){
            bola = (TextView) findViewById(R.id.Numero80);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==81){
            bola = (TextView) findViewById(R.id.Numero81);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==82){
            bola = (TextView) findViewById(R.id.Numero82);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==83){
            bola = (TextView) findViewById(R.id.Numero83);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==84){
            bola = (TextView) findViewById(R.id.Numero84);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==85){
            bola = (TextView) findViewById(R.id.Numero85);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==86){
            bola = (TextView) findViewById(R.id.Numero86);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==87){
            bola = (TextView) findViewById(R.id.Numero87);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==88){
            bola = (TextView) findViewById(R.id.Numero88);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==89){
            bola = (TextView) findViewById(R.id.Numero89);
            bola.setBackgroundResource(colorBola);
        }
        if (bolaSacada==90){
            bola = (TextView) findViewById(R.id.Numero90);
            bola.setBackgroundResource(colorBola);
        }
    }


    public void menosTiempo(View view) {
        if (tiempo != 1000){
            tiempo = tiempo -1000;
            tiempoRegulable.setText(String.valueOf(tiempo).substring(0,1));
        }else{
            Toast.makeText(getApplicationContext(), "No se puede bajar de un segundo" , Toast.LENGTH_LONG).show();
        }

    }

    public void masTiempo(View view) {
        tiempo = tiempo + 1000;
        tiempoRegulable.setText(String.valueOf(tiempo).substring(0,1));
    }

    public void lineaOBingo(View view) {
        inicioPausa.setText("Reanudar");
        estado="P"; //PAUSADO
        lineaOBingo.setText("Bingo");
    }
}