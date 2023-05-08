import java.util.ArrayList;

public class Cliente {
    private int numero;
    private String titular;
    private double saldo;

    public Cliente(String string, String string2) {
	}

	public void Conta(int numero, String titular, double saldo) {
        this.setNumero(numero);
        this.setTitular(titular);
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void adicionarConta(Conta conta1) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Conta> listarContas() {
		// TODO Auto-generated method stub
		return null;
	}
}
