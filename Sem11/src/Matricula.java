import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matricula {
	
	public List<String>alunos = new ArrayList<String>();
	public List<String>matriculas = new ArrayList<String>();
	public String nome;
	public String matricula;
	
	Scanner in = new Scanner(System.in);
	
	public boolean existeounao(String n) {
		
		for (String a: matriculas) {
			
			 if (a.equals(n)) {
				 
				 
				 return true;
			 }
			
		}
		return false;
	}
	
	public void cadastro() {
		
		System.out.println("Digite seu nome: ");
		this.nome = in.nextLine();
		System.out.println("Digite sua matricula: ");
		this.matricula = in.nextLine();
		
		while(this.existeounao(this.matricula)==true) {
			
			System.out.println("matricula ja existe, digite outro:");
			this.matricula = in.nextLine();
			
		}
		
		this.alunos.add(this.nome);
		this.matriculas.add(this.matricula);
		
		System.out.println("Usuario cadastrado com sucesso");
		
	}
	public void status() {
		
		System.out.println("Status:");
		
		for (int i = 0; i < this.alunos.size(); i ++) {
			
			
			System.out.println("Nome:" + this.alunos.get(i) + "     Matricula: " + this.matriculas.get(i));
			
			
		}
		
		
	}
	public void remover() {
		
		System.out.println("Digite a matricula do aluno que vai ser retirado: ");
		String a = in.nextLine();
		int d = 0;
		for (int i = 0; i < this.alunos.size();i++) {
			
			if (this.matriculas.get(i).equals(a)) {
				
				d = i;
				
			}
			
		}
		
		this.alunos.remove(d);
		this.matriculas.remove(d);
		
	}
	
	
}
