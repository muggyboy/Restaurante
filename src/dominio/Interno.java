package dominio;

public class Interno extends Pedido {
	private Funcionario gar�om;
	private Mesa mesa;

	public Interno(int codigo, Funcionario cozinheiro, Mesa mesa, Funcionario gar�om) {
		super(codigo, cozinheiro);
		this.mesa = mesa;
		this.gar�om = gar�om;
	}

	public void setGar�om(Funcionario gar�om) {
		this.gar�om = gar�om;
	}

	@Override
	public Funcionario getGar�om() {
		return gar�om;
	}

	@Override
	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
}
