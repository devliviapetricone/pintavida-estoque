package projetocontroleestoque.loja.dto;

public record DadosCadastroProduto(
    String nomeProduto,
    String marca,
    String categoria,
    double preco,
    int quantidade

) { 
}

