import java.util.ArrayList;

public class Amigo {
	String nomeAmigo;
	ArrayList<Banda> bandas;
	
	public String getNomeAmigo() {
		return nomeAmigo;
	}
	public void setNomeAmigo(String nomeAmigo) {
		this.nomeAmigo = nomeAmigo;
	}
	
	public ArrayList<Banda> getBandas(){
		return this.bandas;
	}
	public Amigo(String nomeAmigo) {
		super();
		this.nomeAmigo = nomeAmigo;
		this.bandas = new ArrayList<Banda>();
	}
	public void adicionarBanda(String nomeBanda) {
		this.bandas.add(new Banda(nomeBanda));
	}
	public void removerBanda(int index) {
		this.bandas.remove(index);
	}
	@Override
		public String toString() {
		return "Nome: " + this.nomeAmigo + "\nLista de Bandas :) " + this.getBandas();
	}
}
