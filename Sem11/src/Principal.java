
import java.util.Scanner;
public class Principal {

	public  static void main(String args[]) {
		
		Matricula a = new Matricula();
		 int i = 0;
		Scanner in = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("O que deseja fazer?\n 1 - cadastrar aluno\n2 - ver os alunos cadastrados\n3- remover aluno cadastrado");
			i = Integer.parseInt(in.nextLine());
			
			if(i == 1) {
				
				a.cadastro();
				
			}else if (i == 2) {
				
				a.status();
				
			}else {
				
				a.remover();
				
			}
			
		}
		
		
	}
}
