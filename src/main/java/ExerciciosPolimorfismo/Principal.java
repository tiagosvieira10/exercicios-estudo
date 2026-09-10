package ExerciciosPolimorfismo;

public class Principal {

    public static void main(String[] args) {
        Desktop compA = new Desktop(8, 4, 600);
        Notebook compB = new Notebook(8, 4,15);

        System.out.println("Valor do Desktop: " + compA.calcularValor());
        System.out.println("Valor do Notebook: " + compB.calcularValor());
    }

}
