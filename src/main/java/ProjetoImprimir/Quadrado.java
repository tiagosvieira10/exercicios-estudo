package ProjetoImprimir;

public class Quadrado implements Imprimivel{
    int medidaLados;

    public Quadrado(int medidaLados) {
        this.medidaLados = medidaLados;
    }

    @Override
    public void imprimir() {
        System.out.println("Lados do Quadrado");
        System.out.println("São: " + medidaLados);

    }
}
