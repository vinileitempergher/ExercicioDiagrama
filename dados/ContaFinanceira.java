package dados;

public class ContaFinanceira extends Associado {
	private float saldo;

	
	public boolean deposito() {
		return true;
	}
	
	public boolean debitar() {
		return true;
	}
	
	public boolean saque() {
		return true;
	}
	
	public boolean gerirGasto() {
		return true;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}