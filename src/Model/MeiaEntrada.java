package Model;

public class MeiaEntrada extends Ingressos {


    private boolean meiaEntrada;

    public MeiaEntrada(String acesso, String nome, int cadeira, boolean meiaEntrada) {
        super(acesso, nome, cadeira);
        this.meiaEntrada = meiaEntrada;
    }

    public boolean isMeiaEntrada() {
        return meiaEntrada;
    }

    public void setMeiaEntrada(boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }

    public void visualizar() {
        System.out.println("\n_________________________________________");
        System.out.println("\n                                         ");
        System.out.println("            INGRESSO                       ");
        System.out.println("\n    NOME: "+ getNome()                    );
        System.out.println("\n    ACESSO: "+getAcesso()                 );
        System.out.println("\n    CADEIRA: "+getCadeira()               );
        System.out.println("\n    ENTRADA: "+isMeiaEntrada()            );
        System.out.println("\n                                         ");
        System.out.println("\n_________________________________________");

    }
}
