import java.util.ArrayList;

public class Cliente1 {
    private String nome;
    private String cpf;
    private ArrayList<Conta> contas;

    public void Cliente(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        contas = new ArrayList<Conta>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public ArrayList<Conta> listarContas() {
        return contas;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}