package br.com.fiap.aula2app2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Activity1 extends ActionBarActivity {

    private TextView txtNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        txtNumero = (TextView) findViewById(R.id.txtNumero);

        if(savedInstanceState != null) {
            String val = savedInstanceState.getString("txtNumero");
            txtNumero.setText(val);
        } else {
            txtNumero.setText("0");
        }
    }

    public void chamarActivity2(View v) {
        Intent toActivity2 = new Intent(this, Activity2.class);
        startActivity(toActivity2);
    }

    public void somar(View v) {
        //obtém o texto atual do txtNumero
        Integer val = Integer.parseInt(txtNumero.getText().toString());
        val++;

        // define dinamicamente o valor de txtNumero com o valor atualizado
        txtNumero.setText(val.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);

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
            Intent activity3 = new Intent(this, Activity3.class);
            startActivity(activity3);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("txtNumero", txtNumero.getText().toString());
        super.onSaveInstanceState(outState);
    }
}
