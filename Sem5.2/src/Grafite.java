
public class Grafite {
	private double espessura;
	

	public Grafite() {}
	
	public Grafite (double espessura) {
		this.espessura = espessura;
	}

	public double getEspessura() {
		return espessura;
	}

	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}

	@Override
	public String toString() {
		return "Grafite [Espessura=" + espessura + "]";
	}
	

	
}
