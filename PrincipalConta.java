public class PrincipalConta{
    public static void main(String [] args){
        conta c1 = new conta(90, "Daniel", 12000.00, true);
        conta c2 = new conta(12, "Iago", 10000000.00, true);
        conta c3 = new conta(13, "Mauro",1290.00, true);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.depositar(10000.92);
        c2.depositar(6000.00);
        c3.depositar(1200000.90);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.setNome("Daniel Pedro");
        c2.setNome("Iago Iara");
        c3.setNome("Mauro Gabriel");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.sacar(9000.00);
        c2.sacar(10000000.00);
        c3.sacar(700.00);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.desativar();
        c2.desativar();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
