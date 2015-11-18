package br.com.fiap.aula6app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {

    private CheckBox chkOpcao1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
    }

    public void check(View v) {
        boolean value = ((CheckBox) v).isChecked();

        int checkID = v.getId();

        switch (checkID) {

            case R.id.chkOpcao1ID:
                Toast.makeText(this, "Valor da Opção 1: " + value, Toast.LENGTH_LONG).show();
                Log.i("CheckboxActivity", "Valor da Opção 1: " + value);
                break;
            case R.id.chkOpcao2ID:
                Toast.makeText(this, "Valor da Opção 2: " + value, Toast.LENGTH_LONG).show();
                Log.i("CheckboxActivity", "Valor da Opção 2: " + value);
                break;
        }
    }
}
