package br.com.fiap.aula2app2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Activity3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);
    }

    public void fecharERetornar(View v) {
        finish();
    }
}