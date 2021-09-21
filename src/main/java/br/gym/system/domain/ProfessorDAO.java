package br.gym.system.domain;



import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfessorDAO extends JpaRepository<Professor, Integer>{
	Professor findByCodigo(Integer codigo);
}
