package dominio;

public class Prato extends Produto{
	private boolean eSobremesa;
	
	public Prato(String nome,float pre�o,boolean �Sobremesa,Fornecedor fornecedor){
		super(nome,pre�o,fornecedor);
		this.eSobremesa = �Sobremesa;
	}

	public boolean �Sobremesa() {
		return eSobremesa;
	}

	public void setESobremesa(boolean eSobremesa) {
		this.eSobremesa = eSobremesa;
	}

	
}
