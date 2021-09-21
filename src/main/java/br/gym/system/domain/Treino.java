package br.gym.system.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;


@Entity

public class Treino {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	
	@ManyToOne
	private Exercicio exercicio;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime dataTreino;
	
	private int qntAluno;
	
	@ManyToOne
	private Aluno aluno;
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	

	public Exercicio getExercicio() {
		return exercicio;
	}
	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}
	public LocalDateTime getDataTreino() {
		return dataTreino;
	}
	public void setDataTreino(LocalDateTime dataTreino) {
		this.dataTreino = dataTreino;
	}
	public int getQntAluno() {
		return qntAluno;
	}
	public void setQntAluno(int qntAluno) {
		this.qntAluno = qntAluno;
	}
	
	

}
