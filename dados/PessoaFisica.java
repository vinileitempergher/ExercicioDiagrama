package dados;

public class PessoaFisica extends Pessoa {
	
	private String banco;
	private String agencia;
	private String tipoAssociado;

	
	public boolean validarBanco() {
		return true;
	}
	
	public boolean validarAgencia() {
		return true;
	}
	
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTipoAssociado() {
		return tipoAssociado;
	}

	public void setTipoAssociado(String tipoAssociado) {
		this.tipoAssociado = tipoAssociado;
	}
}