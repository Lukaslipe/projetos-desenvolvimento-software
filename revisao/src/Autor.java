public class Autor {
    private String nome;
    private String nacionalidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void exibirDados(){
        System.out.println("Autor: " + nome + " Nacionalidade: " + nacionalidade);
    }
}
