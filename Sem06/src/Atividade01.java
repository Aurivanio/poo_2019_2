import java.util.ArrayList;
public class Atividade01 {
	public static void main (String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Artic");
		lista.add(0,"Y");
		lista.add("Monkeys");
		lista.add(1,"Love");
		for (String elemento : lista)
			System.out.print(elemento + " ");
		System.out.print("\n");
		
		
		
	}

}
//adicionar um ArrayList é com o Arrays.asList(1,2,3)
/*Remove um valor - While (lista.contains(2))
 * lista.remove(Integer.valueOf(2)
 * 
 */

