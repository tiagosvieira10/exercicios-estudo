package ProjetoLivro;

public class Principal {

    public static void main(String[] args) {

        LivroDigital ld = new LivroDigital("Harry Potter",
                new Autor("Tolkien", "Britanico", "tolkien@email.com"), "Aventura", 5, 1000, 3500);

            ld.info();

    }
}
