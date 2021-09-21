package br.gym.system.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gym.system.domain.TreinoDAO;

import br.gym.system.domain.Professor;


@Service
public class TreinoService {
	
	@Autowired
	private TreinoDAO treinoDAO;
	
	
	@SuppressWarnings("deprecation")
	public Treino obterPorId(Integer codigo) {
		return this.treinoDAO.getOne(codigo);
	}

	
}
