package br.gym.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gerente {

	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer codigo;

private String chaveAcesso;

@Column(length=50)
private String email;

@Column(length=11)
private String telefone;



public Integer getCodigo() {
	return codigo;
}
public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}
public String getChaveAcesso() {
	return chaveAcesso;
}
public void setChaveAcesso(String chaveAcesso) {
	this.chaveAcesso = chaveAcesso;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}

}
