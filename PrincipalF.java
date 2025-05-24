public class Principalfunc{
    public static void main(String args[]) {
        Funcionario f = new Funcionario( 1, "Antônio", "102.188.738-91", "Rua Norte Sul, 920", "(11) 9213-9822", 71, 57282.99);
        

    System.out.println("Dados");
    System.out.println(f);
    
    f.setSalario(1500.00);
    System.out.println("\nDados atualizados do funcionário:");
    System.out.println(f);
    System.out.printf("Salário líquido: R$ %.2f\n", f.calculaSalarioLiquido());
    }
}