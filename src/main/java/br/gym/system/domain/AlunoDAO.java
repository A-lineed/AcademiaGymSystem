package br.gym.system.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDAO extends JpaRepository<Aluno, Integer>{

	Aluno findByEmailAndSenha(String email, String senha);

	 
} 
