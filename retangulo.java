public class retangulo {
    private int comprimento;
    private int largura;

    //construtor
    public retangulo (int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        return comprimento * largura;
    }

    public int calcularPerimetro(){
        return 2*(comprimento + largura);
    }

    public void imprimir(){
        System.out.printf("comprimento: %d, largura: %d, area: %d, perimetro: %d%n", comprimento, largura, calcularArea(), calcularPerimetro());
    }
}
