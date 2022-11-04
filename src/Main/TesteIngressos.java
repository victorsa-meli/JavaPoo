package Main;

import Model.IngressosVip;
import Model.MeiaEntrada;

public class TesteIngressos {
    public static void main(String[] args) {


        IngressosVip vip1 = new IngressosVip("PORTARIA-A","Ana", 34, true);


        IngressosVip vip2 = new IngressosVip("PORTARIA-A","Julia", 24, true);

        MeiaEntrada mei1 = new MeiaEntrada("PORTARIA-B", "Pedro", 22, true);



        MeiaEntrada mei2 = new MeiaEntrada("PORTARIA-B", "Amanda", 25, true);




        vip1.visualizar();
        vip2.visualizar();
        mei1.visualizar();
        mei2.visualizar();





    }
}
