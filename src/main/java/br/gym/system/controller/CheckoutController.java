package br.gym.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.gym.system.domain.PagamentoAlunoDAO;
import br.gym.system.domain.Aluno;
import br.gym.system.domain.PagamentoAluno;
@Repository
@Controller
public class CheckoutController {


	
	@Autowired
	private PagamentoAlunoDAO pagamentodao;
	
	@GetMapping("/checkout")
	public String exibirTeste(Model model, Aluno aluno) {
		model.addAttribute("aluno", aluno);
		return "checkout";
		
	}
	
	
	

	
}
