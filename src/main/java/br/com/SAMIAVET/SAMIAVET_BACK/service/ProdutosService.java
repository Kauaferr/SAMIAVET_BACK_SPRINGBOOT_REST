package br.com.SAMIAVET.SAMIAVET_BACK.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.SAMIAVET.SAMIAVET_BACK.dto.ProdutosDto;
import br.com.SAMIAVET.SAMIAVET_BACK.repository.ProdutosRepository;

@Service
public class ProdutosService {
	@Autowired
	private ProdutosRepository produtosRepository;

	public ProdutosRepository getProdutosRepository() {
		return produtosRepository;
	}
	
	public void salvar(ProdutosDto produtos) {
		
	}
}
