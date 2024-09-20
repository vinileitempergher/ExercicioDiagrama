package dados;


class ControleDeEstoque {
	private int idproduto;

	public boolean isIdproduto() {
		return true;
	}

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}

	public boolean cadastroDeProdutos() {
		return true;
	}

	public boolean relatorioDePosicao() {
		return true;
	}

	public boolean movimentacaoMercadoria() {
		return true;
	}

	public boolean emitirNotaFiscal() {
		return true;
	}

	public boolean atualizacaoDeEstoque() {
		return true;
	}

	public boolean debitaFuncionario() {
		return true;
	}

	public boolean gravacaoDeNotaFiscal() {
		return true;
	}
}
