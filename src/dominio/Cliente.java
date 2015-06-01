package dominio;

public class Cliente {
	private String nome, telefone, endere�o;
	private int codigo;
	private static int proxCodigo = 0;

	public Cliente(String nome, String telefone, String endere�o) {
		proxCodigo ++;
		this.codigo = proxCodigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endere�o = endere�o;
	}

	public int getCodigo() {
		return codigo;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

}
