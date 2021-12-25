package br.com.SAMIAVET.SAMIAVET_BACK.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.SAMIAVET.SAMIAVET_BACK.dto.Ficha_ClinicaDTO;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ficha_ClinicaResponse {
	 private HttpStatus status;
	 private List<Ficha_ClinicaDTO> ficha_clinica;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public List<Ficha_ClinicaDTO> getFicha_clinica() {
		return ficha_clinica;
	}
	public void setFicha_clinica(List<Ficha_ClinicaDTO> ficha_clinica) {
		this.ficha_clinica = ficha_clinica;
	}
	    
	public Ficha_ClinicaResponse() {
		
	}
}