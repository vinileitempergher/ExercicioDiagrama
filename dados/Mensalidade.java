package dados;

public class Mensalidade {
	private float valorMensalidade;
	private String dataVencimento;


	public boolean gerarMensalidade() {
		return true;
	}
	
	public float getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(float valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}
