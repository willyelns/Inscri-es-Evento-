package Negocios;

import java.util.Random;

import dominio.Formulario;
import dominio.Inscricao;

/**
 * Created by One Does Not Simply on 15/06/2015.
 */
public class ComprovanteEvento implements Comprovante {
    public String gerarComprovante(Inscricao inscricao){

        String comprovante = new Random().nextInt() + inscricao.getResposta().getId()+ "";
        return comprovante;

    }
    public  String gerarComprovante(Formulario inscricao){

        int num = new Random(10000).nextInt(Integer.MAX_VALUE) + 1;
        String comprovante = "O comprovante da sua inscri\u00e7\u00e3o \u00e9: " + num + " " + new Random(10000).nextInt(Integer.MAX_VALUE);
        return comprovante;
    }
}
