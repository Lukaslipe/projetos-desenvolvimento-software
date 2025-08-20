public class Livro {
    private String titulo;
    private int ano;
    private Autor autor;

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public Autor getAutor() {
        return autor;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo + " Ano: " + ano + " Autor: " + autor.getNome());
    }
}
