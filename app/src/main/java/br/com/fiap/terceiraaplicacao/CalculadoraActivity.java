package br.com.fiap.terceiraaplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText num1, num2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        num1 = (EditText) findViewById(R.id.num1ContentID);
        num2 = (EditText) findViewById(R.id.num2ContentID);
        result = (TextView) findViewById(R.id.resultID);

        ((Button) findViewById(R.id.btnSomaID)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnSubtracaoID)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnDivisaoID)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnMultiplicacaoID)).setOnClickListener(this);
    }



    private void soma() {
        double soma = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());
        result.setText(String.valueOf(soma));
    }

    private void subtracao() {
        double subtracao = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());
        result.setText(String.valueOf(subtracao));
    }

    private void divisao() {
        double divisao = Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString());
        result.setText(String.valueOf(divisao));
    }

    private void multiplicacao() {
        double multiplicacao = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
        result.setText(String.valueOf(multiplicacao));
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnSomaID:
                soma();
                break;

            case R.id.btnSubtracaoID:
                subtracao();
                break;

            case R.id.btnDivisaoID:
                divisao();
                break;

            case R.id.btnMultiplicacaoID:
                multiplicacao();
                break;
        }
    }
}