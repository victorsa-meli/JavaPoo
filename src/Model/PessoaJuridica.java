package Model;

public class PessoaJuridica extends Cliente{

    private double cnpj;
    private String razaoSocial;
    private String nomeFantasia;


    public PessoaJuridica(String name, String UF, String cidade, String sexo, double cnpj, String razaoSocial, String nomeFantasia) {
        super(name, UF, cidade, sexo);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }


    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void visualizar() {
        System.out.println("\n_________________________________________");
        System.out.println("\n                                         ");
        System.out.println("            CADASTRO                       ");
        System.out.println("\n    NOME: "+ getName()                    );
        System.out.println("\n    UF: "+getUF()                         );
        System.out.println("\n    SEXO: "+getSexo()                     );
        System.out.println("\n    CIDADE:  "+getCidade()                );
        System.out.println("\n    ID:  "+getId()                        );
        System.out.println("\n    Nome Fantasia: "+getNomeFantasia()    );
        System.out.println("\n    CNPJ: "+getCnpj()                     );
        System.out.println("\n    Razao Social: "+getRazaoSocial()      );
        System.out.println("\n                                         ");
        System.out.println("\n                                         ");
        System.out.println("\n_________________________________________");



    }
}
