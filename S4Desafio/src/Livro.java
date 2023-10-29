public class Livro {
    //Properties - area
    protected String livro;
    protected String autor;
    protected String categoria;

    //Constructor - area
    public Livro (String livro, String autor, String categoria) {
        this.livro = livro;
        this.autor = autor;
        this.categoria = categoria;
    }

    //Getters and Setters - area
    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //toString - area
    @Override
    public String toString() {
        return "Livro: " + livro + "Autor(a): " + autor + ", Categoria: " + categoria;
    }
}
