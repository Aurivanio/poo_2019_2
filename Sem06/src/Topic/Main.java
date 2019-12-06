package Topic;
import java.util.InputMismatchException; //importando uma exceção que é necessária
import java.util.Scanner;

public class Main {
    public static void menu() {//menuzinho que vai aparecer 
    		System.out.print("Olá, o que deseja? :D\n"+ 
	    	"1 - Status da topic. \n" +
	        "2 - Inserir passageiro. \n" +
	        "3 - Remover passageiro. \n" +
	        "4 - Sair. \n");
    }
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //instanciando o scanner 
		int capacidade;
		int preferencial;
		System.out.println("Digite a capacidade da topic: ");
		capacidade = scanner.nextInt();
		System.out.println("Digite o número de cadeiras preferenciais: ");
		preferencial = scanner.nextInt();
        Cobrador cobrador = new Cobrador(capacidade, preferencial);
        boolean stop = true;
        String id;
        int idade;

        while(stop) {
            menu(); //quando um case para, ele volta para o menu, a não ser que seja o case 4, sair
            String op = scanner.next();
            switch (op){

            	case "1": //status da topic
            		System.out.println("Vagas restantes na topic: \n");
            		int capacidadePreferencial=preferencial-cobrador.getPreferenciais().size();
            		System.out.println("@"+capacidadePreferencial);
            		int capacidadeComum=capacidade-preferencial-cobrador.getCadeiras().size();
            		System.out.println("="+capacidadeComum);
                	break;
	         
            	case "2": //adicionar passageiro
        			System.out.print("ID: \n");
                    id = scanner.next();//o scanner recebe a informação e coloca na lista :D
                    System.out.print("Idade: \n");
                    idade = scanner.nextInt();
                    if(cobrador.adicionarPassageiro(id, idade)) {
	                	System.out.print("Eba, seja bem-vindx e coloque o cinto.\n"); //!!!!!!	
		                scanner = new Scanner(System.in);
                    }else {
                    	System.out.print("Eita, erro ao entrar na topic. :( \n");
                    }
                    break;

            	case "3": //remover passageiro
            		System.out.print("Digite o id do passageiro: \n");
                    id = scanner.next();
                    cobrador.removerPassageiro(id);
                    System.out.print("Valeu! Até a próxima viagem. :) \n");
                    break;
            		
            	case "4"://sair de tudo
                	stop = false;
                	break;
                	
                default://qualquer opção além dos 4 case
                    System.out.println("Ops! Opção inválida, tente novamente! :P \n");
                    break;   	
            }
        }
    }
}