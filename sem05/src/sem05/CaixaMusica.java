package sem05;

public class CaixaMusica {
	private String cor;
	Bateria bateria;
	private boolean ligado;
	private boolean tocando;
	
	public void tocarMusica(String nomeMusica) {
		if (ligado = true) {
			System.out.println("Tocando a musica: " + nomeMusica);
			this.tocando = true;
			bateria.setCarga(-10);
		}
		else {
			System.out.println ("Bateria Descarregada");
				
		}
	public CaixaMusica(String cor, Bateria bateria) {
		this.cor = cor;
		this.bateria = bateria;
		this.ligado = true;
		this.tocando = false;
	}
			
		
	}
	

}
