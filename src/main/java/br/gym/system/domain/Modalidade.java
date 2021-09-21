package br.gym.system.domain;

public enum Modalidade {

	RITMOS("Ritmos"), FUNCIONAL("Funcional"), AEROBICO("Aerobico"), JUMP("Jump"), STEP("Step"), CROSSFIT("CrossFit");

	private String nome;
	private Modalidade(String nome) {
		this.nome=nome;
	}
public String getNome() {
	return nome;
}
	
}