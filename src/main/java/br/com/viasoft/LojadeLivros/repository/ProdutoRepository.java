package br.com.viasoft.LojadeLivros.repository;

import br.com.viasoft.LojadeLivros.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long > {

}
