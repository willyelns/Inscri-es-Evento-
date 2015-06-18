package Negocios;

import dominio.Inscricao;

/**
 * Created by One Does Not Simply on 14/06/2015.
 */
public class ValidadorEvento implements StrategyValidator{

    public boolean validarDados(Inscricao inscricao){

        boolean validado = false;

        if(inscricao.getId() > 0){
            if(inscricao.getResposta().getPerguntas().getNumeroCartao() != null && inscricao.getResposta().getPerguntas().getNumeroCartao() != ""){
                if(inscricao.getResposta().getPerguntas().getCpf()!=null && inscricao.getResposta().getPerguntas().getCpf() !=""){
                    if(inscricao.getResposta().getPerguntas().getEmail()!= null && inscricao.getResposta().getPerguntas().getEmail()!= ""){
                        if(validarEmail(inscricao.getResposta().getPerguntas().getEmail())) {
                            if(validarEventoAnterior(inscricao.getResposta().getPerguntas().getComprovanteEventoAnterior()))
                            {
                                validado = true;
                            }
                        }
                    }
                }
            }

        }
        return validado;
    }

    public boolean validarInscricao(Inscricao inscricao){
        return validarDados(inscricao);
    }

    public boolean validarEmail(String email){
        boolean validador= false;
        if(email.contains("@")){
            validador = true;
        }
        return validador;
    }
    public boolean validarEventoAnterior(String evento){
        boolean validador = false;
        if (evento.contains("2014")){
            validador = true;
        }
        return validador;
    }
}
