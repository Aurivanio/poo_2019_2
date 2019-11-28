package sem05;

import java.util.Scanner;

public class Controller {
	public static void main (String[] args) {
		Bateria bateria1 = new Bateria();
		Caixa caixaV= new Caixa("Vermelho", bateria1);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("O que você quer fazer? \n-Tocar \n-CarregarBat \n-StatusBat");
			
			String line = scanner.nextLine();
			String[] vetor = line.split(" ");
				if (vetor[0].equals("Tocar")) {
					caixaV.tocarMusica(vetor[1]);
				}
				else if(vetor[0].equals("carregarBat")){
					bateria1.carregarBat(vet[1]);
				}
				else if (vetor[0].equals("StatusBat")) {
					System.out.println(bateria1);
				}
		}
	}

}
