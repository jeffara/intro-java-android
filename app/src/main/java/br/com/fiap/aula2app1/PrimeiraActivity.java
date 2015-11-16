package br.com.fiap.aula2app1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class PrimeiraActivity extends ActionBarActivity {

    private TextView txtNumero;

    public void mais(View v) {
        //obtém o texto atual do txtNumero
        Integer val = Integer.parseInt(txtNumero.getText().toString());
        val++;

        // define dinamicamente o valor de txtNumero com o valor atualizado
        txtNumero.setText(val.toString());
    }

    public void menos(View v) {
        Integer val = Integer.parseInt(txtNumero.getText().toString());
        val--;
        txtNumero.setText(val.toString());
    }

    public void zerar(View v) {
        txtNumero.setText("0");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // chama onCreate da super classe
        super.onCreate(savedInstanceState);

        // cria a interface de usuário com base no arquivo xml criado em layout
        setContentView(R.layout.activity_primeira);

        //Realize um cast de View para um tipo de dado especifico.
        txtNumero = (TextView) findViewById(R.id.txtNumero);
        txtNumero.setText(R.string.txtZero);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_primeira, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Menu de Configurações Acionado!", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.action_menuOp1) {
            Toast.makeText(this, "Menu de Configurações 1 Acionado!", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.action_menuOp2) {
            Toast.makeText(this, "Menu de Configurações 2 Acionado!", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);

    }
}
