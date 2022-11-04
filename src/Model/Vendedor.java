package Model;

public class Vendedor extends Funcionario {


    private String setor;
    private String cargo;


    public Vendedor(String nome, int idade, String sexo, double salario, String setor, String cargo) {
        super(nome, idade, sexo, salario);
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void visualizar() {
        System.out.println("\n_________________________________________");
        System.out.println("\n                                         ");
        System.out.println("            VENDEDOR                       ");
        System.out.println("\n    NOME: "+ getNome()                    );
        System.out.println("\n    IDADE: "+getIdade()                   );
        System.out.println("\n    SEXO: "+getSexo()                     );
        System.out.println("\n    Salario: "+getSalario()               );
        System.out.println("\n    Setor: "+getSetor()                   );
        System.out.println("\n    Cargo: "+getCargo()                   );
        System.out.println("\n                                         ");
        System.out.println("\n_________________________________________");

    }
}
