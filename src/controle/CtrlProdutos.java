package controle;

import dominio.Bebida;
import dominio.Fornecedor;
import dominio.Prato;
import dominio.Produto;
import face.JanelaProduto;

public class CtrlProdutos {
	private Produto[] vetorP;
	private Programa parente;

	public CtrlProdutos(Programa parente) {
		vetorP = new Produto[3];
		this.parente = parente;
	}

	public String inserirPrato(String nome, float pre�o, boolean �Sobremesa,
			Fornecedor fornecedor) {
		int i;
		for (i = 0; i < vetorP.length; i++) {
			if (vetorP[i] == null)
				break;
		}
		if (i >= vetorP.length)
			return "Vetor de Produtos lotado";

		vetorP[i] = new Prato(nome, pre�o, �Sobremesa, fornecedor);
		return "Prato Inserido";
	}

	public String inserirBebida(String nome, float preco, String ano,
			Fornecedor fornecedor) {
		int i;
		for (i = 0; i < vetorP.length; i++) {
			if (vetorP[i] == null)
				break;
		}
		if (i >= vetorP.length)
			return "Vetor de Produtos lotado";

		vetorP[i] = new Bebida(nome, preco, ano, fornecedor);
		return "Bebida Inserida";
	}

	public Produto getProduto(int codigo) {
		for (int i = 0; i < vetorP.length; i++) {
			if (vetorP[i] != null) {
				if (vetorP[i].getCodigo() == codigo)
					return vetorP[i];
			}
		}
		return null;
	}

	public void AbrirJanela() {
		JanelaProduto janela = new JanelaProduto(this);
		janela.setVisible(true);
	}

	public void Voltar() {
		parente.Voltar();
	}

	public CtrlFornecedores getCtrlFornecedores() {
		return parente.getCtrlFornecedores();
	}
}
