package dominio;

public class Fornecedor {
	
	private String nome;
	private String telefone;
	private String endere�o;
	private int codigo;
	
	public Fornecedor(int codigo,String nome, String telefone, String endere�o){
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endere�o = endere�o;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
