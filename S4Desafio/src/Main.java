public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("O Príncipe", "Maquiavel", "Não ficção");
        Livro livro2 = new Livro("Harry Potter", "J.K.Rowling", "Fantasia");

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);

        System.out.println("---listarLivros---");
        biblioteca.listarLivros(livro);

        System.out.println("---listarCategorias---");
        biblioteca.listarCategorias();

        System.out.println("---buscarPorCategoria---");
        biblioteca.buscarPorCategoria("Fantasia");
        biblioteca.buscarPorCategoria("Não ficção");

    }
}