package br.com.SAMIAVET.SAMIAVET_BACK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.SAMIAVET.SAMIAVET_BACK.domain.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer>  {

	
}
