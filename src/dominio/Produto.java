package dominio;

public class Produto {
	private int codigo;
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	private String nome;
	private float pre�o;
	Fornecedor fornecedor;

	public Produto(int codigo,String nome, float pre�o, Fornecedor fornecedor) {
		this.codigo = codigo;
		this.nome = nome;
		this.pre�o = pre�o;
		this.fornecedor = fornecedor;
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
