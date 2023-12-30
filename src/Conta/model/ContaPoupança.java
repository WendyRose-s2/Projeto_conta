package Conta.model;

public class ContaPoupança extends conta {

	private int aniversario;
	
	public ContaPoupança(int numero2, int agencia2, int tipo2, String titular2, float saldo2) {
		super(numero2, agencia2, tipo2, titular2, saldo2);
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}
	}


