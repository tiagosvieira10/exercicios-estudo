package ProjetoImprimir;

public class Carro implements Imprimivel {
    String nomeDoCarro;
    int anoDoCarro;
    double placa;

    public Carro(String nomeDoCarro, int anoDoCarro, double placa) {
        this.nomeDoCarro = nomeDoCarro;
        this.anoDoCarro = anoDoCarro;
        this.placa = placa;
    }

    @Override
    public void imprimir() {
        System.out.println("Carro");
        System.out.println("Qual o carro? " + nomeDoCarro);
        System.out.println("Ano do carro? " + anoDoCarro);
        System.out.println("Qual a placa? " + placa);
        System.out.println("________________");

    }
}
