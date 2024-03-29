
package br.com.SAMIAVET.SAMIAVET_BACK.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.SAMIAVET.SAMIAVET_BACK.domain.Ficha_Clinica;
import br.com.SAMIAVET.SAMIAVET_BACK.dto.Ficha_ClinicaDTO;
import br.com.SAMIAVET.SAMIAVET_BACK.response.Ficha_ClinicaResponse;
import br.com.SAMIAVET.SAMIAVET_BACK.service.Ficha_ClinicaService;

@RestController
@RequestMapping(value="/fichas")
public class Ficha_ClinicaController {
	@Autowired
	private Ficha_ClinicaService ficha_clinica_service;
	
	@Autowired
	public Ficha_ClinicaController(Ficha_ClinicaService ficha_clinica_service) {
		this.ficha_clinica_service = ficha_clinica_service;
	}
	
	@PostMapping("/salvar/{email}")
	public Boolean salvar(@RequestBody Ficha_ClinicaDTO ficha, @PathVariable String email) {
		return this.ficha_clinica_service.salvarFicha(ficha, email);
	}
	
	
	@GetMapping("/listar")
	public  ResponseEntity<Ficha_ClinicaResponse> listarFichas(){
		
		
		List<Ficha_Clinica> listaTodos  = this.ficha_clinica_service.getFicha_clinica_repository().findAll();
        List<Ficha_ClinicaDTO> fichasDTO = new ArrayList<Ficha_ClinicaDTO>();

		for(int cont = 0; cont< listaTodos.size(); cont++ ) {
			Ficha_ClinicaDTO ficha = new Ficha_ClinicaDTO();
			
			ficha.setId(listaTodos.get(cont).getId());
			ficha.setNome_proprietario(listaTodos.get(cont).getNome_proprietario());
			ficha.setTelefone(listaTodos.get(cont).getTelefone());
			ficha.setEmail(listaTodos.get(cont).getEmail());
			ficha.setEndereco(listaTodos.get(cont).getEndereco());
			ficha.setCpf(listaTodos.get(cont).getCpf());
			ficha.setNomeAnimal(listaTodos.get(cont).getNomeAnimal());
			ficha.setEspecie_animal(listaTodos.get(cont).getEspecie_animal());
			ficha.setRaca_animal(listaTodos.get(cont).getRaca_animal());
			ficha.setSexo_animal(listaTodos.get(cont).getSexo_animal());
			ficha.setHistorico_animal(listaTodos.get(cont).getHistorico_animal());
			ficha.setFc_animal(listaTodos.get(cont).getFc_animal());
			ficha.setFr_animal(listaTodos.get(cont).getFr_animal());
			ficha.setP_animal(listaTodos.get(cont).getP_animal());
			ficha.setT_animal(listaTodos.get(cont).getT_animal());
			ficha.setData_nascimento_animal(listaTodos.get(cont).getData_nascimento_animal());
			ficha.setPelugem_animal(listaTodos.get(cont).getPelugem_animal());
			ficha.setPeso_animal(listaTodos.get(cont).getPeso_animal());
			ficha.setData_registro_animal(listaTodos.get(cont).getData_registro_animal());

			fichasDTO.add(ficha);

		}
		
		Ficha_ClinicaResponse fichaResponse = new Ficha_ClinicaResponse();
		fichaResponse.setStatus(HttpStatus.OK);
		fichaResponse.setFicha_clinica(fichasDTO);
        return new  ResponseEntity<Ficha_ClinicaResponse>(fichaResponse, fichaResponse.getStatus());

	}
	
	@GetMapping("/listar/{nomeAnimal}")
	public  ResponseEntity<Ficha_ClinicaResponse> listarFichasPorNomeAnimal(@PathVariable String nomeAnimal){
		
		
		List<Ficha_Clinica> listaTodos  = this.ficha_clinica_service.getFicha_clinica_repository().findByNomeAnimal(nomeAnimal);
        List<Ficha_ClinicaDTO> fichasDTO = new ArrayList<Ficha_ClinicaDTO>();

		for(int cont = 0; cont< listaTodos.size(); cont++ ) {
			Ficha_ClinicaDTO ficha = new Ficha_ClinicaDTO();
			
			ficha.setId(listaTodos.get(cont).getId());
			ficha.setNome_proprietario(listaTodos.get(cont).getNome_proprietario());
			ficha.setTelefone(listaTodos.get(cont).getTelefone());
			ficha.setEmail(listaTodos.get(cont).getEmail());
			ficha.setEndereco(listaTodos.get(cont).getEndereco());
			ficha.setCpf(listaTodos.get(cont).getCpf());
			ficha.setNomeAnimal(listaTodos.get(cont).getNomeAnimal());			
			ficha.setEspecie_animal(listaTodos.get(cont).getEspecie_animal());
			ficha.setRaca_animal(listaTodos.get(cont).getRaca_animal());
			ficha.setSexo_animal(listaTodos.get(cont).getSexo_animal());
			ficha.setHistorico_animal(listaTodos.get(cont).getHistorico_animal());
			ficha.setFc_animal(listaTodos.get(cont).getFc_animal());
			ficha.setFr_animal(listaTodos.get(cont).getFr_animal());
			ficha.setP_animal(listaTodos.get(cont).getP_animal());
			ficha.setT_animal(listaTodos.get(cont).getT_animal());
			ficha.setData_nascimento_animal(listaTodos.get(cont).getData_nascimento_animal());
			ficha.setPelugem_animal(listaTodos.get(cont).getPelugem_animal());
			ficha.setPeso_animal(listaTodos.get(cont).getPeso_animal());
			ficha.setData_registro_animal(listaTodos.get(cont).getData_registro_animal());

			fichasDTO.add(ficha);

		}
		
		Ficha_ClinicaResponse fichaResponse = new Ficha_ClinicaResponse();
		fichaResponse.setStatus(HttpStatus.OK);
		fichaResponse.setFicha_clinica(fichasDTO);
        return new  ResponseEntity<Ficha_ClinicaResponse>(fichaResponse, fichaResponse.getStatus());

	}
	@DeleteMapping("/deletar/{id}")
	public void excluir(@PathVariable Integer id) {
		this.ficha_clinica_service.excluir(id);
	}
	@PostMapping("/editar/{email}")
	public Boolean editar(@RequestBody Ficha_ClinicaDTO ficha, @PathVariable String email) {
		return this.ficha_clinica_service.editarFicha(ficha, email);
	}
}
