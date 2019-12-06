package sem05;

//import java.util.Scanner;

public class Controller {
	public static void main (String[] args) {
		
		CaixaMusica a = new CaixaMusica("Azul");
		a.tocarMusica("caide boca");
		a.status();
		a.ligarAparelho();
		
		a.tocarMusica("quero passar em poo");
		a.tocarMusica("quero passar em poo");
		a.tocarMusica("quero passar em poo");
		a.tocarMusica("quero passar em poo");
		a.tocarMusica("quero passar em poo");
		a.tocarMusica("quero passar em poo");
		a.tocarMusica("quero passar em poo");
		a.tocarMusica("quero passar em poo");
		a.tocarMusica("quero passar em poo");
		
		a.status();
		a.carregarBateria();
		a.status();
		
		
	
}
	
}
