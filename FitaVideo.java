//cria a classe
public class FitaVideo{
    //atributos
    private String nome;
    private double aluguel;

    //construtor

    public FitaVideo(String nome, double aluguel){
        this.nome = nome;
        this.aluguel = aluguel;
    }

    //método

    public String getNome(){
        return nome;
    }

    public double getAluguel(){
        return aluguel;
    }

    public double getValorAluguel(int numeroDeDiasAlugada){
        return aluguel*numeroDeDiasAlugada;
    }
    
    //toString

   public String toString(){
    return "Nome da fita:" +nome+ ",Preço do aluguel: R$" +aluguel;
   }

}