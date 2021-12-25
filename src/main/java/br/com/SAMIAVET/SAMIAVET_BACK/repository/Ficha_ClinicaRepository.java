package br.com.SAMIAVET.SAMIAVET_BACK.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.SAMIAVET.SAMIAVET_BACK.domain.Ficha_Clinica;


@Repository
public interface Ficha_ClinicaRepository extends JpaRepository<Ficha_Clinica, Integer>  {

	List<Ficha_Clinica> findByEmail(String email);

}
