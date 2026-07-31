package projetocontroleestoque.loja.dto;

public record DadosAtualizarProduto(
    Long id,
    String nomeProduto,
    String marca,
    String categoria,
    double preco,
    int quantidade

) { 

}
