package Topic;
import java.util.ArrayList;//importando o ArrayList para essa classe

public class Cobrador {// nome da classe
    private ArrayList<Passageiro> cadeiras; //dando nome para o Arraylist
    private ArrayList<Passageiro> preferenciais; //dando nome para a outra Arraylist
    private Cobrador cobrador; 
    private int capacidade;
    private int comum;
    private int preferencial;
    public Cobrador(int capacidade, int preferencial) {
        this.cadeiras = new ArrayList<Passageiro>(); //instanciando a Arraylist
        this.preferenciais = new ArrayList<Passageiro>(); //instanciando a outra Arraylist
        this.capacidade = capacidade;
        this.comum = capacidade-preferencial;
        this.preferencial = preferencial;
        Passageiro passageiro1 = new Passageiro ("Beatriz", 18);
        cadeiras.add(passageiro1);
        Passageiro passageiro2 = new Passageiro ("Naily", 62);
        preferenciais.add(passageiro2);
        
        //sempre que você rodar, o que cadastrou vai ser esquecido, fica apenas os que já estão aqui, só por teste mesmo
    }
    
    
	public ArrayList<Passageiro> getPreferenciais() {
		return preferenciais;
	}

	public void setPreferenciais(ArrayList<Passageiro> preferenciais) {
		this.preferenciais = preferenciais;
	}

	public int getComum() {
		return comum;
	}

	public void setComum(int comum) {
		this.comum = comum;
	}

	public ArrayList<Passageiro> getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(ArrayList<Passageiro> cadeiras) {
		this.cadeiras = cadeiras;
	}

	public Cobrador getCobrador() {
		return cobrador;
	}

	public void setCobrador(Cobrador cobrador) {
		this.cobrador = cobrador;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPreferencial() {
		return preferencial;
	}

	public void setPreferencial(int preferencial) {
		this.preferencial = preferencial;
	}

	public boolean adicionarPassageiro (String id, int idade){ //primeiro método, adicionar passageiro
        if(buscarPassageiro(id) == null){//ele vai buscar o id, e se não tiver na lista (null), vai adicionar
        	Passageiro passageiro = new Passageiro (id, idade); //instanciando o novo passageiro
        	if (cadeiras.size()+preferenciais.size()<=(comum + preferencial)) { //se a quantidade de cadeiras ocupadas for menor que as capacidade total
        		if(idade >= 60 && preferencial>0) {//se a idade for maior ou igual a 60 e a preferencial for maior que zero
        			preferenciais.add(passageiro);            		
            		return true; 
            	}else if (idade>=60 && preferencial==0){//se a idade for maior ou igual a 60 e a preferencial é igual a zero
            		cadeiras.add(passageiro);
            		return true; 
            	}else if (idade <60 && capacidade>0) {//se a idade for menor que 60 e a capacidade é maior que zero
            		cadeiras.add(passageiro);
            		return true; 
            	}else if (idade <60 && comum==0 && preferencial>0){//se a idade for menor que 60, a comum é igual a zero e a preferencial está vaga
            		preferenciais.add(passageiro);
            		return true; 
            	}	
        	}     	
      }
        return false;
    }

    public Passageiro buscarPassageiro(String id) {//segundo método, buscar 
        for(int i = 0; i < cadeiras.size(); i++) { //achando a posição i do passageiro
            if(cadeiras.get(i).getId().equals(id)) {//procurando o i, o id
                return cadeiras.get(i); //retornando o passageiro encontrado
            }
        }
        return null; //se não achar, retorna nulo
    }
    
    public int buscarIndicePassageiro (String id) { //terceiro método, buscando o i do passageiro
    	for(int i = 0; i < cadeiras.size(); i++) { //achando a posição i do passageiro na lista
    		if(cadeiras.get(i).getId().equals(id)) {//procurando o i, o id
                return i;//retorna o i
            }
        }
        return -1;
    }
    
    public boolean removerPassageiro (String id) {//quarto método, removendo um passageiro
        int posicao = buscarIndicePassageiro (id);//busca o indice do passageiro
        if (posicao == -1) {//se não achar
            return false;//retorna falso
        }
        cadeiras.remove(posicao);//se ele achar
        return true;//vai remover da lista 
    }
}
