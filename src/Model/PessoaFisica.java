package Model;


public class PessoaFisica extends Cliente{



    private double CPF;
    private String estadoCivil;
    private String escolaridade;

    private int idade;

    public PessoaFisica(String name, String UF, String cidade, String sexo, double CPF, String estadoCivil, String escolaridade, int idade) {
        super(name, UF, cidade, sexo);
        this.CPF = CPF;
        this.estadoCivil = estadoCivil;
        this.escolaridade = escolaridade;
        this.idade = idade;
    }


    public double getCPF() {
        return CPF;
    }

    public void setCPF(double CPF) {
        this.CPF = CPF;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void visualizar() {
        System.out.println("\n_________________________________________");
        System.out.println("\n                                         ");
        System.out.println("            CADASTRO                       ");
        System.out.println("\n    NOME: "+ getName()                    );
        System.out.println("\n    IDADE: "+getIdade()                   );
        System.out.println("\n    UF: "+getUF()                         );
        System.out.println("\n    SEXO: "+getSexo()                     );
        System.out.println("\n    CIDADE:  "+getCidade()                );
        System.out.println("\n    ID:  "+getId()                        );
        System.out.println("\n    Estado Civil: "+getEstadoCivil()      );
        System.out.println("\n    CPF: "+getCPF()                       );
        System.out.println("\n    Escolaridade: "+getEscolaridade()     );
        System.out.println("\n                                         ");
        System.out.println("\n                                         ");
        System.out.println("\n_________________________________________");

    }
}
