package ProjetoImprimir;

public class Principal {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("Tito", 56);
        Carro c = new Carro("Celta", 2003, 122000333);
        Quadrado q = new Quadrado(12);

        Imprimivel i = f;
        i.imprimir();
        i=c;
        i.imprimir();
        i=q;
        i.imprimir();

    }
}
