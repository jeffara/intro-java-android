package br.com.fiap.aula6app;

import java.io.Serializable;

/**
 * Created by jeff on 11/17/15.
 */
public class SetaBean implements Serializable {

    //Metodo Construtor Padrao
    public SetaBean() {}

    //ID da Imagem a ser exibida
    private int idSeta;

    //Texto a ser exibido
    private String texto;

    public int getIdSeta() {
        return idSeta;
    }

    public void setIdSeta(int idSeta) {
        this.idSeta = idSeta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
