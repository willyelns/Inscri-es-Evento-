package dao;

import java.util.ArrayList;

import dominio.Formulario;

/**
 * Created by One Does Not Simply on 13/06/2015.
 */
public class FormularioDAO implements daoFormulario {

    private static ArrayList<Formulario> formularios;

    private FormularioDAO(){
        formularios = new ArrayList<Formulario>();
    }
    public FormularioDAO createDAO(){
        return new FormularioDAO();
    }
    public void create(Formulario formulario){
    Formulario forms = new Formulario(formulario);
        forms.setId(generateID());

        add(forms);

    }

    private void add(Formulario forms) {
        formularios.add(forms);
    }

    private int generateID() {
        int i = formularios.size();
        int id = formularios.get(i).getId() + 1;

        return id;
    }

    public void update(Formulario formulario){

        formularios.set(formulario.getId(),formulario);

    }
    public void delete(int id){

        for(int i=0; i<formularios.size(); i++){
            if(formularios.get(i).getId() == id){
                formularios.remove(i);
                break;
            }
        }

    }
    public Formulario getFormulario(){
        return formularios.get(formularios.size());
    }
    public Formulario getFormulario(int id){

        Formulario formulario = null;
        for(int i=0; i<formularios.size(); i++){
            if(formularios.get(i).equals(id)){
                formulario = formularios.get(i);
            }
        }
        return formulario;
    }
    public ArrayList<Formulario> getAllFormulario(){
        return formularios;
    }
}
