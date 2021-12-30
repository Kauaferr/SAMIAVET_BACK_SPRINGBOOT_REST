package br.com.SAMIAVET.SAMIAVET_BACK.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.SAMIAVET.SAMIAVET_BACK.domain.Ficha_Clinica;
import br.com.SAMIAVET.SAMIAVET_BACK.dto.Ficha_ClinicaDTO;
import br.com.SAMIAVET.SAMIAVET_BACK.repository.Ficha_ClinicaRepository;

@Service
public class Ficha_ClinicaService {
	@Autowired
	private Ficha_ClinicaRepository ficha_clinica_repository;

	public Ficha_ClinicaRepository getFicha_clinica_repository() {
		return ficha_clinica_repository;
	}
	
	public Boolean salvarFicha(Ficha_ClinicaDTO ficha, String email) {
		
		String emailEncontrado = buscarEmail(email);
		
		String emailDigitado = ficha.getEmail();
		
		Boolean validacao = false;
		if(emailEncontrado == null ) {
			this.ficha_clinica_repository.save(ficha.transformaParaObjeto());
			validacao = true;
		}else if(emailEncontrado.equals(emailDigitado)) {
			validacao = false;
		}
		return validacao;
	}
	
	public String buscarEmail(String email) {
		List<Ficha_Clinica> listaFichas = this.ficha_clinica_repository.findByEmail(email);
		
		String emailEncontrado = null;
		for(Ficha_Clinica x : listaFichas) {
			emailEncontrado = x.getEmail();
		}
		return emailEncontrado;
	}
	
	public void excluir(Integer id) {
		
		this.ficha_clinica_repository.deleteById(id);
	}
	
	public Boolean editarFicha(Ficha_ClinicaDTO ficha, String email) {
		
			this.ficha_clinica_repository.save(ficha.transformaParaObjeto());
			return true;
	
	}
	
	
}
