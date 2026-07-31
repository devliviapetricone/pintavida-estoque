package projetocontroleestoque.loja.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetocontroleestoque.loja.model.Papelaria;
import projetocontroleestoque.loja.repository.PapelariaRepository;
import projetocontroleestoque.loja.dto.DadosAtualizarProduto;
import projetocontroleestoque.loja.dto.DadosCadastroProduto;
import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/papelaria")

public class ControllerEstoque {


    @Autowired
    private PapelariaRepository papelariarepository;

    @PostMapping("/cadastrarproduto")
    public void cadastrarProduto(@RequestBody DadosCadastroProduto dados){
        System.out.println(dados);
        papelariarepository.save(new Papelaria(dados));
    }


   @GetMapping
   public List<Papelaria> listarProduto(){
    return papelariarepository.findAll();
   }


   @GetMapping("/tipo/{tipo}")
    public List<Papelaria> listarProdutoPorTipo(@PathVariable String tipo) {
        return papelariarepository.findBynomeProduto(tipo);
    }

    @GetMapping("/marca/{marca}")
    public List<Papelaria> listarProdutoPorMarca(@PathVariable String marca) {
        return papelariarepository.findByMarca(marca);
    }

    @PutMapping
    @Transactional
    public void atualizarPapelaria(@RequestBody DadosAtualizarProduto dadosAtualizados) {
        var produto = papelariarepository.getReferenceById(dadosAtualizados.id());
        produto.atualizarDados(dadosAtualizados);
    }

    @DeleteMapping ("/{id}")
    @Transactional
    public void deletarPapelaria(@PathVariable Long id) {
        papelariarepository.deleteById(id);
    }
//
//    // @GetMapping("/busca")
//    // public List<Papelaria> listarProdutoPorBusca(@RequestParam (required = false) String tipo,
//    //                                         @RequestParam (required = false) String marca) {
//    //     return papelariarepository.findBynomeProdutoAndMarca(tipo, marca);
//    // }
//
//
}
