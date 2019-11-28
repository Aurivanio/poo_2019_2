
public class Banda {
	String nomeBanda;

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
	public Banda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
	@Override
	public String toString() {
		return "" + this.nomeBanda;
	}

}
