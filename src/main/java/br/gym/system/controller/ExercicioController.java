package br.gym.system.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import br.gym.system.domain.Exercicio;
import br.gym.system.domain.ExercicioDAO;
import br.gym.system.domain.Treino;

@Controller
public class ExercicioController {
	@Autowired
	private ExercicioDAO exercicioDao;

@GetMapping("/modalidade")
public String exibirCadastroModalidade(Model model) {
	
	model.addAttribute("exercicio", new Exercicio());
	
	return "modalidade-form";
	
}

@PostMapping("/cadastraModalidade") 
public String cadastraExercicio(Exercicio exercicio, Integer codigo, @RequestParam("fileExercicio") MultipartFile file) {

	try {
		exercicio.setImagem(file.getBytes());	
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	this.exercicioDao.save(exercicio);
	
	return "redirect:/modalidade" ;
	
}

@GetMapping("/imagem/{idexercicio}")
@ResponseBody
public byte[] exibirImagem(@PathVariable("idexercicio") Integer idexercicio) {
	Exercicio exercicio = this.exercicioDao.getById(idexercicio);
	return exercicio.getImagem();
}

}
