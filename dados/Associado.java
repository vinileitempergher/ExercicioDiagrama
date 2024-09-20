package dados;

public class Associado extends PessoaFisica {
    private int id;
    private String senha;
 
    
    
    public boolean validarTipoAssociado() {
		return true;
	}
    
    public boolean cadastrar() {
		return true;
	}
    
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getSenha() {
        return senha;
    }
 
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
