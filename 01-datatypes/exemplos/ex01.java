public class ex01 {

    public static void main(String[] args) {

        // Cadastro de produto

        String nomeProduto = "Computador";
        int id = 1421321;
        short qtdEstoque = 64;
        float preco = 2499.99f;
        float peso = 5.4f;
        char categoria = 'A';
        boolean disponivel = true;
        int totalVendas = 16;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("ID: " + id);
        System.out.println("Quantidade no Estoque: " + qtdEstoque);
        System.out.println("Preço: R$" + preco);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Categoria: " + categoria);
        System.out.println("Disponível: " + disponivel);
        System.out.println("Total de Vendas: " + totalVendas);


    }

}
