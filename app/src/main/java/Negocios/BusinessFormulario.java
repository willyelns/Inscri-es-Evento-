package Negocios;

import java.util.ArrayList;

import dao.FormularioDAO;
import dominio.Formulario;

/**
 * Created by One Does Not Simply on 14/06/2015.
 */
public class BusinessFormulario {

    private static FormularioDAO daoFormulario;
    private static BusinessFormulario unique;

    private BusinessFormulario(){
        daoFormulario = daoFormulario.createDAO();
    }

    public BusinessFormulario criarAcessoDAO(){
        if(unique == null){
            unique= new BusinessFormulario();
        }
        return unique;

    }
    public static void update(Formulario formulario)
    {
        daoFormulario.update(formulario);
    }

    public static void create(Formulario form){
        //DUVIDA SOBRE COMO CRIAR O FORMULARIO. VAI SER AQUELE GERADO DINAMICAMENTE? NAO SEI.
        daoFormulario.create(form);
    }
    public static void delete(int id){
        daoFormulario.delete(id);
    }

    public static Formulario getInscricao(){
        return daoFormulario.getFormulario();
    }
    public static ArrayList<Formulario> getListaInscricao(){
        return daoFormulario.getAllFormulario();
    }
}
