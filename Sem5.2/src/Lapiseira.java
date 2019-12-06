import java.text.DecimalFormat;

public class Lapiseira {
	private boolean temGrafite;
	private Grafite grafite;

	DecimalFormat df = new DecimalFormat();
	public Lapiseira(boolean temGrafite) {
		
		this.temGrafite = temGrafite;
	}

	public Lapiseira() {}
	public boolean getTemGrafite() {
		return temGrafite;
	}

	public void setTemGrafite(boolean temGrafite) {
		this.temGrafite = temGrafite;
	}
	
	public Grafite getGrafite() {
		return grafite;
	}

	public void setGrafite(Grafite grafite) {
		this.grafite = grafite;
		this.temGrafite = true;
		System.out.println("Foi colocado uma ponta nova, " + this.grafite.getEspessura());
	}
	
	public void escrever() {
		System.out.println("Escrevendo...");
		grafite.setEspessura(grafite.getEspessura() - 0.2);
		if (grafite.getEspessura() < 0) {
			System.out.println("Acabou grafite...");
		}else {
			System.out.println("Após o desgaste, a nova ponta é : " + df.format((grafite.getEspessura())));
		}
		
		
	}

	@Override
	public String toString() {
		return "Lapiseira [temGrafite=" + this.temGrafite + ", grafite=" + this.grafite + "]";
	}
	
	

}
