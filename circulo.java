public class circulo {
    private double raio;

    //construtor
    public circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return 3.141516*raio*raio;
    }

        public double calcularPerimetro(){
            return 2*raio*3.141516;
        }

    public void imprimir(){
        System.out.printf("raio: %.2f, area: %.2f, perimetro: %.2f\n", raio, calcularArea(), calcularPerimetro());
    }
}