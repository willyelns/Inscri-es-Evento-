package Negocios;

import dominio.Inscricao;

/**
 * Created by One Does Not Simply on 15/06/2015.
 */
public interface StrategyValidator {
    public boolean validarDados(Inscricao inscricao);
    public boolean validarInscricao(Inscricao inscricao);
}
