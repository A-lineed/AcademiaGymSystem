package br.gym.system.controller;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.gym.system.domain.TreinoDAO;

import br.gym.system.domain.Aluno;
import br.gym.system.domain.Exercicio;
import br.gym.system.domain.ExercicioDAO;
import br.gym.system.domain.Treino;
@Repository
@Controller
public class AgendaController {

	@Autowired 
	private TreinoDAO treinodao;
	
	@Autowired
	private ExercicioDAO exerciciodao;

	@GetMapping("/agenda")
	public String exibirAgenda(Model model) {
		

		 model.addAttribute("agenda", this.treinodao.findAll(Sort.by("dataTreino")));
		 model.addAttribute("df", DateTimeFormatter.ofPattern("dd/MM HH:mm"));

		return "agenda-treino";
		
	}


	
}
