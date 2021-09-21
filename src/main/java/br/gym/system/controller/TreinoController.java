package br.gym.system.controller;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.gym.system.domain.ExercicioDAO;
import br.gym.system.domain.Treino;
import br.gym.system.domain.TreinoDAO;
import br.gym.system.domain.TreinoService;

@Controller
public class TreinoController {

	@Autowired 
	private TreinoDAO treinodao;
	
	@Autowired
	private ExercicioDAO exeDAO;
	@Autowired
	private TreinoService treinoService;

	
	
	@GetMapping("/treino")
	public String exibirCadastroTreino(Model model) {
		
		 model.addAttribute("treino", new Treino());
		model.addAttribute("listaExercicio", this.exeDAO.findAll());
		return "cadastrar_treino";
		
	}
	
	

	@PostMapping("/cadastraTreino") 
	public String cadastraTreino(@Validated Treino treino, BindingResult br, Model model) {
		if (br.hasErrors()) {
			return exibirCadastroTreino(model);
		}
		
		
		this.treinodao.save(treino);
		
		return "redirect:/treino" ;
		
	}
	
	
	
	@GetMapping("/listarTreinos")
	public String exibirListaTreino(Model model) {
		model.addAttribute("listaTreino", this.treinodao.findAll());
		 model.addAttribute("df", DateTimeFormatter.ofPattern("dd/MM HH:mm"));
		return"lista-treinos";
	}

		@GetMapping("/editarTreinos")
		public String editarTreino(Integer codigo, Model model) {
			model.addAttribute("treino", this.treinodao.getById(codigo));
			model.addAttribute("listaExercicio", this.exeDAO.findAll());
			return "cadastrar_treino";
		}
		
		@GetMapping("/excluirTreino")
		public String excluirTreino(Integer codigo) {
		this.treinodao.deleteById(codigo);
		return "redirect:/listarTreinos";
		}
	
	
	
}
