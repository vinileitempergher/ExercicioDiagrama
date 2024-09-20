package dados;

public class Pessoa {
	
	
	protected String cpf;
	protected String nome;
	protected String rg;
	protected String telefone;
	protected String endereco;
	
	
	public boolean validarNome() {
		return true;
	}	
	
	public boolean validarRG() {
		return true;
	}
	
	public boolean validarTelefone() {
		return true;
	}
	
	public boolean validarCpf() {
		return true;
	}
	
	public boolean validarEndereco() {
		return true;
	}
	
		
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telfone) {
		this.telefone = telfone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
