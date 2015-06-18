package dominio;

import android.graphics.Paint;

import Negocios.BusinessFormulario;

/**
 * Created by One Does Not Simply on 14/06/2015.
 */
public class Formulario implements FormularioInterface{

    private BusinessFormulario acessoDAO=null;
    private Evento perguntas;
    private int id;

    public Formulario(String nome, String sobrenome, String email, String rg,String cpf, String telefone, Endereco endereco,
                      String numeroCartao, String senha, String certificados, String comprovanteEventoAnterior,
                      String comprovanteCursoAnterior, String diploma){

        perguntas = new Evento(  nome,  sobrenome,  email,  rg, cpf,  telefone,  endereco,  numeroCartao,  senha,  certificados,  comprovanteEventoAnterior,  comprovanteCursoAnterior, diploma);
    }
    public Formulario(Formulario formulario){
    }

    public Evento getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(Evento perguntas) {
        this.perguntas = perguntas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deletarFormulario(Formulario formulario){

        BusinessFormulario.delete(formulario.getId());

    }
    public void editarFormulario(Formulario formulario){
        BusinessFormulario.update(formulario);
    }

    @Override
    public void salvarFormulario(Formulario formulario) {
        BusinessFormulario.create(formulario);
    }

    public void criarFormulario(Formulario formulario){

    }
}
