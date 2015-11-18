package br.com.fiap.aula6app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spiFormaPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spiFormaPagamento = (Spinner) findViewById(R.id.spiFormaPagamentoID);
    }

    public void formaPagamento(View view) {

        //Obtem o item selecionado no Spinner
        Object itemSelecionado = spiFormaPagamento.getSelectedItem();
        String msg = "Forma de Pagamento Escolhida: " + itemSelecionado.toString();

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    }
}
