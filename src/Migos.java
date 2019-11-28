import java.util.ArrayList;

public class Migos {
String nome;
ArrayList<Banda> bandas;
public Migos(String nome) {
	super();
	this.nome = nome;
	this.bandas = new ArrayList<Banda>();
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public ArrayList<Banda> getBandas() {
	return bandas;
}

public void adicionarBanda (String nomeBanda) {
	this.bandas.add(new Banda(nomeBanda));
}
public void removerBanda (int index) {
	this.bandas.remove(index);
}
@Override
public String toString() {
	return "Migos:" +this.nome + "\nBandas:" + this.getBandas();
}




}
