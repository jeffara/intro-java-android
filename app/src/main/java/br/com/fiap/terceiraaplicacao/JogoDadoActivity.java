package br.com.fiap.terceiraaplicacao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class JogoDadoActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgDadoComputador, imgDadoJogador;
    private int[] dados = {R.mipmap.dado1_web,
            R.mipmap.dado2_web,
            R.mipmap.dado3_web,
            R.mipmap.dado4_web,
            R.mipmap.dado5_web,
            R.mipmap.dado6_web};

    private int dadoComputador, dadoJogador, n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_dado);

        imgDadoComputador = (ImageView) findViewById(R.id.dadoComputadorID);
        imgDadoJogador = (ImageView) findViewById(R.id.dadoJogadorID);

        ((Button) findViewById(R.id.btnJogadaComputador)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnJogadaJogador)).setOnClickListener(this);

        dadoJogador = 6;
        dadoComputador = 6;
    }

    @Override
    public void onClick(View v) {

        Random r = new Random();
        n = r.nextInt(6);

        if (v.getId() == R.id.btnJogadaComputador) {
            dadoComputador = n;
            imgDadoComputador.setImageResource(dados[dadoComputador]);
        } else if (v.getId() == R.id.btnJogadaJogador) {
            dadoJogador = n;
            imgDadoJogador.setImageResource(dados[dadoJogador]);
        }

        validaJogadas();
    }

    private void validaJogadas() {

        if (dadoComputador != 6 && dadoJogador != 6) {
            if (dadoComputador > dadoJogador) {
                Toast.makeText(this, "Computador Ganhou!", Toast.LENGTH_LONG).show();
            } else if (dadoJogador > dadoComputador) {
                Toast.makeText(this, "Jogador Ganhou!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Houve Empate!", Toast.LENGTH_LONG).show();
            }

            dadoComputador = 6;
            dadoJogador = 6;
        }
    }
}