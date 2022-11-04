package Model;

public class Cliente {

    private static int cont = 1;

    private String name;
    private String UF;
    private String cidade;
    private String sexo;
    private int id;


    public Cliente(String name, String UF, String cidade, String sexo) {
        this.name = name;
        this.UF = UF;
        this.cidade = cidade;
        this.sexo = sexo;
        this.id = cont;
        Cliente.cont += 1;
    }

    public static int getCont() {
        return cont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }


}
