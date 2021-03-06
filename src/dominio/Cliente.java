package dominio;

public class Cliente {
	private String nome, telefone, enderešo;
	private int codigo;
	private static int proxCodigo = 0;

	public Cliente(String nome, String telefone, String enderešo) {
		proxCodigo ++;
		this.codigo = proxCodigo;
		this.nome = nome;
		this.telefone = telefone;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

}
