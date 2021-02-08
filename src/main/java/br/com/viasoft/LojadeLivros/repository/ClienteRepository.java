package br.com.viasoft.LojadeLivros.repository;

import br.com.viasoft.LojadeLivros.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
