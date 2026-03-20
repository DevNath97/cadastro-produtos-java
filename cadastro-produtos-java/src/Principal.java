public class Principal {

    public static void main(String[] args) {

        // Criando um produto usando o construtor padrão
        Produto p1 = new Produto();

        // Atribuindo valores manualmente
        p1.nome = "Caderno";
        p1.preco = 15.50;

        // Criando produtos usando o construtor com parâmetros
        Produto p2 = new Produto("Caneta", 2.50);
        Produto p3 = new Produto("Mochila", 120.00);

        // Exibindo os dados de cada produto
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        // Exibindo a quantidade total de produtos cadastrados
        // Método chamado diretamente pela classe (por ser estático)
        Produto.exibirQuantidadeTotal();
    }
}