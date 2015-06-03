package dominio;

public class Interno extends Pedido {
	private Gar�om Gar�om;
	private Mesa mesa;

	public Interno(Cozinheiro cozinheiro, Mesa mesa, Gar�om Gar�om) {
		super(cozinheiro);
		this.mesa = mesa;
		this.Gar�om = Gar�om;
	}

	public void setGar�om(Gar�om Gar�om) {
		this.Gar�om = Gar�om;
	}

	@Override
	public Gar�om getGar�om() {
		return Gar�om;
	}

	@Override
	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
}
