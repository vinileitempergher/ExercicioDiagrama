package dados;

class PessoaJuridica extends Pessoa {
    private int cnpj;
 
    public boolean validarCnpj() {
        return true;
    }

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	
    
}
 

