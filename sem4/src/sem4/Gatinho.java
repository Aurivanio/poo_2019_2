package sem4;
import java.util.Scanner;

public class Gatinho {
	
	Scanner input = new Scanner(System.in);
	
	int barriga = 0;
	int maxBarriga = 5;
	boolean vida = true;
	void alimentar(int qtd){
		if (vida) {
			barriga += qtd;
			System.out.println("Nhami, Nhami, que gostoso!");
			if (barriga > maxBarriga) {
				System.out.println("Seu gatinho fez cocô!");
				barriga -= 5;
				System.out.println("Deseja limpar?S/N");
				String limpo = input.nextLine(); 
				vida = false;
				if (limpo == "S") {
					System.out.println("Banhando...");
					System.out.println("Limpo!");
				}else
					System.out.println("Não limpo: -Aff");
				}		
	}
	
		}

	void esperar() {
		if(vida) {
			barriga -= 1;
			System.out.println("Poxa queria comida!");
			if(barriga < 0) {
				System.out.println("Seu gatinho fugiu!!");
				vida = false;
			}
		}
}
	void status() {
		if (vida)
			System.out.print("Esta tudo bem");
		else
			System.out.println("Seu gatinho fugiu");
		System.out.println("com a barriga" + barriga);
	}
		
	}
		
public class Controller {
	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		Gatinho botas = new Gatinho();
		botas.maxBarriga=10;
		System.out.println("Alimentar, Esperar, Ver");
		while(true) {
			String line =  scanner.nextLine();
			String[] vetor = line.split(" ");
			
			if(vetor[0].contentEquals("Alimentar"))
				botas.alimentar(Integer.parseInt(vetor[1]));
			else if(vetor[0].equals("Esperar"))
				botas.esperar();
			else if(vetor[0].contentEquals("Ver"))
				botas.status();
			else if(vetor[0].contentEquals("Parar"))
				break;
			else
				System.out.println("Fail: comando invalido");
		}
		
	}
}
