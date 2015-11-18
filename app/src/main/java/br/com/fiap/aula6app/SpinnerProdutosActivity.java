package br.com.fiap.aula6app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SpinnerProdutosActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spiProdutos;

    private void carregarProdutos() {

        List<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
        ProdutoBean prod1 = new ProdutoBean();

        prod1.setNome("Tomate");
        prod1.setPreco(15.0);

        produtos.add(prod1);

        prod1 = new ProdutoBean();
        prod1.setNome("Alface");
        prod1.setPreco(10.0);

        produtos.add(prod1);

        prod1 = new ProdutoBean();
        prod1.setNome("Beterraba");
        prod1.setPreco(5.50);

        produtos.add(prod1);

        //Cria um ArrayAdapter sobre o objeto criado
        ArrayAdapter<ProdutoBean> adp = new ArrayAdapter<ProdutoBean>(this, android.R.layout.simple_spinner_dropdown_item, produtos);

        spiProdutos.setAdapter(adp);

        prod1 = new ProdutoBean();
        prod1.setNome("Cebola");
        prod1.setPreco(15.70);

        //Novos produtos podem ser adicionados ao Spinner mas via ArrayAdapter
        adp.add(prod1);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_produtos);

        spiProdutos = (Spinner) findViewById(R.id.spiProdutosID);
        spiProdutos.setOnItemSelectedListener(this);

        carregarProdutos();
    }

    public void exibirPreco(View view) {

        ProdutoBean produtoSelecionado = (ProdutoBean) spiProdutos.getSelectedItem();

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        nf.setMaximumFractionDigits(2);

        Toast.makeText(this, "Preço: " + nf.format(produtoSelecionado.getPreco()), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ProdutoBean produtoSelecionado = (ProdutoBean) spiProdutos.getItemAtPosition(position);

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        nf.setMaximumFractionDigits(2);

        Toast.makeText(this, "Nome do Produto: " + produtoSelecionado.getNome() + "\nPreço: " + nf.format(produtoSelecionado.getPreco()), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        
    }
}
