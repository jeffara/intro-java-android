package br.com.fiap.aula6app;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rgCores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        rgCores = (RadioGroup) findViewById(R.id.rgCoresID);
        rgCores.setOnCheckedChangeListener(this);
    }

    public void qualCor(View view) {

        //Obtem o ID do RadioGroup Selecionado
        int corID = rgCores.getCheckedRadioButtonId();

        //Referencia a View RadioButton Selecionada
        RadioButton rbCor = (RadioButton) findViewById(corID);

        //Obtem o Label (Cor) do RadioButton Selecionado
        String corSelecionada = rbCor.getText().toString();

        Toast.makeText(this, "Cor Selecionada: " + corSelecionada, Toast.LENGTH_LONG).show();
        Log.i("RadioButtonActivity", "Cor Selecionada: " + corSelecionada);

    }

    public void addCor(View view) {

        RadioButton rdBranco = new RadioButton(this);
        rdBranco.setText(R.string.txtBranco);
        rdBranco.setId(View.generateViewId());

        //Adiciona um novo RadioButton ao RadioGroup existente
        rgCores.addView(rdBranco);

        //Remove um RadioButton de acordo com o indice do mesmo no RadioGroup
        //Metodo getChildCount() do RadioGroup devolve a quantidade de elementos (RadioButton) existentes
        //rgCores.removeViewAt(rgCores.getChildCount()-1);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        //Referencia a View RadioButton Selecionada
        RadioButton rbCor = (RadioButton) findViewById(checkedId);

        //Obtem o Label (Cor) do RadioButton Selecionado
        String corSelecionada = rbCor.getText().toString();

        Toast.makeText(this, "Cor Selecionada: " + corSelecionada, Toast.LENGTH_LONG).show();
        Log.i("RadioButtonActivity", "Cor Selecionada: " + corSelecionada);
    }
}
