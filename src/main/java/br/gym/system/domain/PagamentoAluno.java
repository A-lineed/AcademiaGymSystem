package br.gym.system.domain;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PagamentoAluno {

 	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	
 	@OneToOne
 	private Aluno aluno;
	
 	private Date dataPaga = new java.sql.Date(System.currentTimeMillis());
	
 	private double valor;
	
 	

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getDataPaga() {
		return dataPaga;
	}
	public void setDataPaga(Date dataPaga) {
		this.dataPaga = dataPaga;
	}
	
	
}
