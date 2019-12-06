
public class Principal {

	public static void main(String[] args) {
	
		Lapiseira bic = new Lapiseira();
		
		Grafite batatinha = new Grafite(0.9);
		
		Grafite pretinha = new Grafite(0.5);
		
		bic.setGrafite(batatinha);
		bic.escrever();
		bic.escrever();
		bic.escrever();
		bic.escrever();
		bic.escrever();
		
		bic.setGrafite(pretinha);
		
		bic.escrever();
		bic.escrever();
		bic.escrever();
		
		

	}

}
