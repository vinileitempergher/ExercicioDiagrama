package dados;

public class ControleDeEntrada {
	private String dataEntrada;
	private String dataSaida;

	
	
	public boolean validarCadastro() {
		return true;
	}
	
	public boolean pendenciasMensalidades() {
		return true;
	}
	
	public boolean verificarPresenca() {
		return true;
	}
	
	public boolean pendenciaClube() {
		return true;
	}
	
	public boolean gerarHistoricoDeAtividade() {
		return true;
	}
	
	
	
	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
}