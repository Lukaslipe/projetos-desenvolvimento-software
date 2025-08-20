public class Acervo {
    private Livro[] livros;

    public Acervo(){
        this.livros = new Livro[2];
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void exibirLivros() {
        System.out.println("Lista de livros dentro do acervo:");
        for(int i = 0; i < this.livros.length; i++){
            livros[i].exibirDados();
            System.out.println();
        }
    }
}