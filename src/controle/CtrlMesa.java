package controle;

import dominio.Mesa;

public class CtrlMesa{
	private Mesa[] vetorM;
	
	public CtrlMesa() {
		vetorM = new Mesa[3];
	}
	
	public String inserirMesa() {
		int i;
		for (i = 0; i < vetorM.length; i++) {
			if (vetorM[i] == null)
				break;
		}
		if (i >= vetorM.length)
			return "Vetor de mesas lotado";

		vetorM[i] = new Mesa();
		return "Mesa Inserida";
	}

	public Mesa getMesa(int numero) {
		for (int i = 0; i < vetorM.length; i++) {
			if (vetorM[i] != null) {
				if (vetorM[i].getNumero() == numero)
					return vetorM[i];
			}
		}
		return null;
	}

}
