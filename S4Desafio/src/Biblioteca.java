import java.util.*;
public class Biblioteca {
    //Properties - area
    public List<Livro> acervo = new ArrayList<Livro>();
    public Set<String> categorias = new HashSet<>();

    //toString - area
    @Override
    public String toString() {
        return "--- Biblioteca ---\n" + acervo + "\nCategorias: " + categorias;
    }

    //Methods - area
    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
        categorias.add(livro.categoria);
    }
    public void removerLivro(Livro livro) {
        acervo.remove(livro);
    }
    public void listarLivros(Livro livro) {
        System.out.println(acervo);
    }

    public void listarCategorias() {
        System.out.println(categorias);
    }
    public void buscarPorCategoria(String categoria) {
        System.out.println(categoria + ":");
        for (Livro livro : acervo) {
            if (livro.getCategoria().equals(categoria)) {
                System.out.println(livro);
            }
        }
    }
}