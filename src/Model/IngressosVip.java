package Model;

public class IngressosVip extends Ingressos{

    private boolean vip;

    public IngressosVip(String acesso, String nome, int cadeira, boolean vip) {
        super(acesso, nome, cadeira);
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void visualizar() {
        System.out.println("\n_________________________________________");
        System.out.println("\n                                         ");
        System.out.println("            INGRESSO                       ");
        System.out.println("\n    NOME: "+ getNome()                    );
        System.out.println("\n    ACESSO: "+getAcesso()                 );
        System.out.println("\n    CADEIRA: "+getCadeira()               );
        System.out.println("\n    ENTRADA: "+isVip()                    );
        System.out.println("\n                                         ");
        System.out.println("\n_________________________________________");

    }
}
