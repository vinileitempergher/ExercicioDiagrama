package dados;

public class Vendas extends ContaFinanceira {
    private int id;
    private float total;
 
    public boolean validaSaldo() {
		return true;
	}
    
    public boolean cadsatrarLimiteGastos() {
		return true;
	}
    
    public boolean limiteExcedido() {
		return true;
	}
    
    
    public boolean saldo() {
        return true;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
    
}