package projetocontroleestoque.loja.repository;

    import projetocontroleestoque.loja.model.Papelaria;
    import org.springframework.data.jpa.repository.JpaRepository;
    import java.util.List;


    public interface PapelariaRepository extends JpaRepository<Papelaria, Long> {
        List<Papelaria> findBynomeProduto(String nomeProduto);

        List<Papelaria> findBynomeProdutoAndMarca(String nomeProduto, String marca);

        List<Papelaria> findByMarca(String marca);

        
    }

