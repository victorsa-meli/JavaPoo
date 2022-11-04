package Model;

public class Ingressos {


    private String acesso;
    private String nome;
    private int cadeira;


    public Ingressos(String acesso, String nome, int cadeira) {
        this.acesso = acesso;
        this.nome = nome;
        this.cadeira = cadeira;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCadeira() {
        return cadeira;
    }

    public void setCadeira(int cadeira) {
        this.cadeira = cadeira;
    }



}
