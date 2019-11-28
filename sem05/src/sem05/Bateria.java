package sem05;

public class Bateria {
	private int carga;
	
	public Bateria () {
		this.carga = 50;
	}
	

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	public void carregarBat(int tempo) {
		setCarga(this.carga += tempo * 10);
	}

}
