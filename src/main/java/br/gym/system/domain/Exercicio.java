package br.gym.system.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Exercicio {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	
	
	@Enumerated(EnumType.STRING)
    private Modalidade modalidade;
	@Lob
	private byte[] imagem;


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	


	public byte[] getImagem() {
		return imagem;
	}


	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}


	public Modalidade getModalidade() {
		return modalidade;
	}


	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
}
