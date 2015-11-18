package br.com.fiap.aula6app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jeff on 11/17/15.
 */
public class SetaAdapter extends BaseAdapter {


    private Context contexto;
    private List<SetaBean> itens;

    public SetaAdapter(Context contexto, List<SetaBean> itens) {

        this.contexto = contexto;
        this.itens = itens;
    }

    private class ViewsInternas {
        ImageView imgIcon;
        TextView txtTitle;
    }

    @Override
    //Retorna o numero de elementos na lista
    public int getCount() {
        return itens.size();
    }

    @Override
    //Retorna um item (indice i) especifico da lista
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    //Retorna o id de um item na posicao i
    public long getItemId(int position) {
        return itens.get(position).getIdSeta();
    }

    @Override
    //Desenha cada um dos itens da lista, onde:
    // → P1 = posicao do item na lista
    // → P2 = representa uma linha da list view
    // → P3 = a propria ListView
    public View getView(int pos, View view, ViewGroup vg) {

        //Sera uma nova linha ou uma ja existente
        ViewsInternas v;

        //Verifica se eh um novo item na ListView
        if (view == null) {
            view = LayoutInflater.from(contexto).inflate(R.layout.seta_adapter, null);
            v = new ViewsInternas();
            v.txtTitle = ((TextView) view.findViewById(R.id.txtValorID));
            v.imgIcon = ((ImageView) view.findViewById(R.id.imgSetaID));
            view.setTag(v);
        } else {
            //Obtem o item atual
            v = (ViewsInternas) view.getTag();
        }

        SetaBean item = itens.get(pos);

        v.txtTitle.setText(item.getTexto());

        v.imgIcon.setImageResource(item.getIdSeta());

        return view;

    }
}
