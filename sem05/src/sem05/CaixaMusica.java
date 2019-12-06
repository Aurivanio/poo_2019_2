package sem05;

public class CaixaMusica {
	private String cor;
	int bateria;
	private boolean ligado;
	
	
	public void tocarMusica(String nomeMusica) {
		if (this.ligado == true) {
			
			if(this.bateria >= 1) {
			System.out.println("Tocando a musica");
			this.bateria = this.bateria - 10;
			}else {
				
				System.out.println("Bateria descarregada");
			}
		}
		else {
			System.out.println ("Aparelho desligado, por favor ligue-o");
				
			}
		}
	
	public void ligarAparelho() {
		this.ligado = true;
		System.out.println("Aparelho ligado");
		
	}
	
	public void status () {
		System.out.println("Status da Bateria:" + this.bateria);
		System.out.println("Aparelho esta ligado? "+ this.ligado);
		
	}
	public CaixaMusica(String cor) {
		this.cor = cor;
		this.bateria = 100;
	}
	public void carregarBateria () {
		int i = 0;
		while (true) {
			
			System.out.println("Carregando: " + i);
			i = i + 1;
			if (i > 100) {
				
				break;
				
			}
			
		}
		System.out.println("Bateria carregada com sucesso!");
	}		
		
	}	


