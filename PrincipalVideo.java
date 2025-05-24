public class PrincipalVideo {
    public static void main(String[] args) {
        FitaVideo fita1 = new FitaVideo("De Volta Pro Futuro ", 12.0);
        FitaVideo fita2 = new FitaVideo("Breaking Bad, Temporada 3 ", 30.0);
        FitaVideo fita3 = new FitaVideo("O Homem Que Copiava ", 5.0);

        System.out.println("Fitas disponíveis:");
        System.out.println(fita1);
        System.out.println(fita2);
        System.out.println(fita3);

        System.out.println("\nAluguel");
        System.out.println(fita1.getNome() + "Valor do aluguel por 5 dias: R$ " + fita1.getValorAluguel(5));
        System.out.println(fita2.getNome() + "Valor do aluguel por 1 semana: R$ " + fita2.getValorAluguel(7));
        System.out.println(fita3.getNome() + "Valor do aluguel por 2 semanas: R$" + fita3.getValorAluguel(14));
    }