public class conta {

   private int numero;
   private String nome;
   private double saldo;
   private boolean ativa;

   public conta(int numero, String nome, double saldo, boolean ativa){
    this.numero = numero;
    this.nome = nome;
    this.saldo = saldo;
    this.ativa = ativa;
   }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){ 
        this.numero = numero;
    }

    public String getNome(){
       return nome;
    }

    public void setNome(String nome){ 
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getAtiva(){
       return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void depositar(double deposito){ 
        if(deposito > 0 && ativa == true){
            saldo = saldo + deposito;
        }
    }

    public void sacar(double saque){
        if(saque <= saldo && ativa == true){
            saldo = saldo - saque;
        }
    }

    public void desativar(){
        if(ativa == true){
            ativa = false;
        }
    }

    public void ativar(){
        if(ativa == false){
            ativa = true;
        }
    }

    public void exibirConta(){
        System.out.println("A conta: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Ativa: " + ativa);
    }

    public String toString(){
         return String.format("A conta:" + numero +
                "\nNome: " + nome +
                "\nSaldo:" + saldo +
                "\nAtiva:" + ativa +
                "\n");
    }
   }
