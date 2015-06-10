package dominio;

public class Itens {
private int qtd = 1;
private Produto produto;

public Itens(Produto produto){
	this.produto = produto;
}

public float calcularPre�oItem() {
	return produto.getPre�o() * qtd;
}

public String getNome(){
	return qtd + " " + produto.getNome();
}

public int getQtd() {
	return qtd;
}

public void setQtd(int qtd) {
	this.qtd = qtd;
}

}
