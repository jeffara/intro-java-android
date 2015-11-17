package br.com.fiap.terceiraaplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtem a referencia do Botao criado na View XML
        btnTeste = (Button) findViewById(R.id.btnTesteID);

        Toast.makeText(this, "Primeira Label Antes: " + btnTeste.getText().toString() + ".", Toast.LENGTH_LONG).show();

        //Altera o label do botao dinamicamente
        btnTeste.setText("BOTAO CUSTOMIZADO");

        //Seta o listener de Click no botao
        btnTeste.setOnClickListener(this);

        //Seta o listener de Click no botao
        ((Button) findViewById(R.id.btnTesteImagemID)).setOnClickListener(this);

        //Seta o listener de Click no botao
        ((ImageButton) findViewById(R.id.btnImageID)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button btn;

        if(view.getId() == R.id.btnTesteID) {

            btn = (Button) view;
            btn.setText("Botao Clicado!");

            Toast.makeText(this, "Primeiro Botao Acionado!", Toast.LENGTH_LONG).show();
        } else if(view.getId() == R.id.btnTesteImagemID) {

            btn = (Button) view;
            btn.setText("Botao Clicado!");

            Toast.makeText(this, "Segundo Botao Acionado!", Toast.LENGTH_LONG).show();
        } else if(view.getId() == R.id.btnImageID) {
            Toast.makeText(this, "Terceiro Botao Acionado!", Toast.LENGTH_LONG).show();
        }
    }
}
