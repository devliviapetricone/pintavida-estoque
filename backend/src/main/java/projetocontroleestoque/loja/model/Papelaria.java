    package projetocontroleestoque.loja.model;


import projetocontroleestoque.loja.dto.DadosAtualizarProduto;
import projetocontroleestoque.loja.dto.DadosCadastroProduto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Table(name = "produto")
@Entity(name = "produto")

public class Papelaria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nomeProduto")
    private String nomeProduto;

    private String marca;
    private String categoria;
    private double preco;
    private int quantidade;



public Papelaria(DadosCadastroProduto dados){
    this.nomeProduto = dados.nomeProduto();
    this.marca = dados.marca();
    this.categoria = dados.categoria();
    this.preco = dados.preco();
    this.quantidade = dados.quantidade();
}

public void atualizarDados(DadosAtualizarProduto dadosAtualizados){
    this.nomeProduto = dadosAtualizados.nomeProduto();
    this.marca = dadosAtualizados.marca();
    this.categoria = dadosAtualizados.categoria();
    this.preco = dadosAtualizados.preco();
    this.quantidade = dadosAtualizados.quantidade();
}
}
