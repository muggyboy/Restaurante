package dominio;

public class Produto {
	private int codigo;
	private static int proxcodigo = 0;

	private String nome;
	private float pre�o;
	Fornecedor fornecedor;

	public Produto(String nome, float pre�o, Fornecedor fornecedor) {
		proxcodigo ++;
		this.codigo = proxcodigo;
		this.nome = nome;
		this.pre�o = pre�o;
		this.fornecedor = fornecedor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPre�o() {
		return pre�o;
	}

	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}

}
