
public class Controlle {
	public static void main (String[] args) {
		Migos naely = new Migos ("Naely");
		naely.adicionarBanda("Djavú");
		naely.adicionarBanda("Dj Junio Portugal");
		naely.adicionarBanda("Zé Neto e Cristiano");
		naely.removerBanda(2);
		System.out.println(naely);
		
		Migos carlos = new Migos ("Carlos Eduarda");
		carlos.adicionarBanda("Tuyo");
		carlos.adicionarBanda("Jaloo");
		carlos.adicionarBanda("baco Exu do blue");
		carlos.adicionarBanda("Aviões do Forró");
		carlos.removerBanda(3);
		System.out.println (carlos);
	}

}
