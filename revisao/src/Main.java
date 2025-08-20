public class Main {
    public static void main(String[] args) {

        Autor lucas = new Autor();
        lucas.setNome("Lucas Cristo");
        lucas.setNacionalidade("Brasileiro");
        lucas.exibirDados();

        Livro eloisa = new Livro();
        eloisa.setAno(2025);
        eloisa.setAutor(lucas);
        eloisa.setTitulo("Livro da Eloisa");

        Livro nino = new Livro();
        nino.setAno(2016);
        nino.setAutor(lucas);
        nino.setTitulo("Livro do nino");

        Livro[] listaLivros = new Livro[2];
        listaLivros[0] = eloisa;
        listaLivros[1] = nino;

        Acervo meuAcervo = new Acervo();
        meuAcervo.setLivros(listaLivros);

        meuAcervo.exibirLivros();


        Produto garfo = new Produto();
        garfo.setNome("Garfo");
        garfo.setPreco(5.00);
        garfo.setQuantidade(15555550);

        Produto chapeu = new Produto();
        chapeu.setNome("Chapéu");
        chapeu.setPreco(10.50);
        chapeu.setQuantidade(10);

        Produto[] listaProduto = new Produto[2];
        listaProduto[0] = garfo;
        listaProduto[1] = chapeu;

    }
}