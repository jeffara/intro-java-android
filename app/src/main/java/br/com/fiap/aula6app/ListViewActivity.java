package br.com.fiap.aula6app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listViewID);

        List<SetaBean> itens = new ArrayList<SetaBean>();

        SetaBean valor1 = new SetaBean();
        valor1.setTexto("Valor 1");
        valor1.setIdSeta(R.mipmap.arrow_up);

        SetaBean valor2 = new SetaBean();
        valor2.setTexto("Valor 2");
        valor2.setIdSeta(R.mipmap.arrow_up);

        SetaBean valor3 = new SetaBean();
        valor3.setTexto("Valor 3");
        valor3.setIdSeta(R.mipmap.arrow_down);

        SetaBean valor4 = new SetaBean();
        valor4.setTexto("Valor 4");
        valor4.setIdSeta(R.mipmap.arrow_down);

        itens.add(valor1);
        itens.add(valor2);
        itens.add(valor3);
        itens.add(valor4);

        SetaAdapter adapter = new SetaAdapter(this, itens);
        listView.setAdapter(adapter);

    }
}
