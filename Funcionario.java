//Classe
public class Funcionario{

    private int codigo;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private int idade;
    private double salario;

    //Construtor

    public Funcionario(int codigo, String nome, String CPF, String endereco, String telefone, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    //Método

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //CPF
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
  
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

  
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", CPF=" + CPF + ", endereco=" + endereco
                + ", telefone=" + telefone + ", idade=" + idade + ", salario=" + salario + "]";
    }

    
    public double calculaSalarioLiquido() {
        double descontoINSS = salario * 0.11;
        return salario - descontoINSS;
    }

}
