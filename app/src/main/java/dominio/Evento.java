package dominio;

/**
 * Created by One Does Not Simply on 14/06/2015.
 */
public class Evento extends DadosBasicos{

    private String numeroCartao;
    private String senha;
    private String certificados;
    private String comprovanteEventoAnterior;
    private String comprovanteCursoAnterior;
    private String diploma;

    public Evento(String nome, String sobrenome, String email, String rg,String cpf, String telefone, Endereco endereco, String numeroCartao, String senha, String certificados, String comprovanteEventoAnterior, String comprovanteCursoAnterior, String diploma) {

        super(nome, sobrenome, email, rg,cpf, telefone, endereco);
        this.numeroCartao = numeroCartao;
        this.senha = senha;
        this.certificados = certificados;
        this.comprovanteEventoAnterior = comprovanteEventoAnterior;
        this.comprovanteCursoAnterior = comprovanteCursoAnterior;
        this.diploma = diploma;
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCertificados() {
        return certificados;
    }

    public void setCertificados(String certificados) {
        this.certificados = certificados;
    }

    public String getComprovanteEventoAnterior() {
        return comprovanteEventoAnterior;
    }

    public void setComprovanteEventoAnterior(String comprovanteEventoAnterior) {
        this.comprovanteEventoAnterior = comprovanteEventoAnterior;
    }

    public String getComprovanteCursoAnterior() {
        return comprovanteCursoAnterior;
    }

    public void setComprovanteCursoAnterior(String comprovanteCursoAnterior) {
        this.comprovanteCursoAnterior = comprovanteCursoAnterior;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
}
