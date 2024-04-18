package br.com.brunostaine.padroesprojetospring.repository;

import br.com.brunostaine.padroesprojetospring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
