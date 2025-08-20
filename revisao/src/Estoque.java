public class Estoque {
    private Produto[] produtos;

    public Estoque(){
        this.produtos  = new Produto[2];
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void exibirProdutos() {
        for(int i = 0; i < this.produtos.length; i++){
            produtos[i].exibirDados();
            System.out.println();
        }
    }
}
