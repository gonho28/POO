package Calendario;
public class PrincipalCal {
    public static void main(String[] args) {
       
        Calendario d1 = new Calendario(25, 4, 2008);
        Calendario d2 = new Calendario(19, 5 2024);

        d1.mostrarData();
        d1.anoBissexto();

        d2.mostrarData();
        d2.anoBissexto();
    }
}