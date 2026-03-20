public class Produto {

    // Atributos da classe
    String nome;           // Nome do produto
    double preco;          // Preço do produto

    // Atributo estático (compartilhado por todos os objetos)
    static int quantidadeTotal = 0;

    // Construtor padrão (sem parâmetros)
    public Produto() {
        // Incrementa a quantidade total sempre que um produto é criado
        quantidadeTotal++;
    }

    // Construtor com parâmetros (sobrecarga)
    public Produto(String nome, double preco) {
        // A palavra "this" referencia o atributo da classe
        this.nome = nome;
        this.preco = preco;

        // Incrementa o contador total
        quantidadeTotal++;
    }

    // Método para exibir os dados do produto
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("----------------------");
    }

    // Método estático para exibir a quantidade total de produtos
    public static void exibirQuantidadeTotal() {
        System.out.println("Total de produtos cadastrados: " + quantidadeTotal);
    }
}