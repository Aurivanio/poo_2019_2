import java.util.ArrayList;

public class Cobrador {
    private ArrayList<Passageiro> cadeiras; 
    private ArrayList<Passageiro> preferenciais; 
    private Cobrador cobrador; 
    private int capacidade;
    private int comum;
    private int preferencial;
    public Cobrador(int capacidade, int preferencial) {
        this.cadeiras = new ArrayList<Passageiro>(); 
        this.preferenciais = new ArrayList<Passageiro>(); 
        this.capacidade = capacidade;
        this.comum = capacidade-preferencial;
        this.preferencial = preferencial;
        Passageiro passageiro1 = new Passageiro ("Beatriz", 18);
        cadeiras.add(passageiro1);
        Passageiro passageiro2 = new Passageiro ("Naily", 62);
        preferenciais.add(passageiro2);
        
        
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

	public boolean adicionarPassageiro (String id, int idade){ 
        if(buscarPassageiro(id) == null){
        	Passageiro passageiro = new Passageiro (id, idade);
        	if (cadeiras.size()+preferenciais.size()<=(comum + preferencial)) { 
        		if(idade >= 60 && preferencial>0) {
        			preferenciais.add(passageiro);            		
            		return true; 
            	}else if (idade>=60 && preferencial==0){
            		cadeiras.add(passageiro);
            		return true; 
            	}else if (idade <60 && capacidade>0) {
            		cadeiras.add(passageiro);
            		return true; 
            	}else if (idade <60 && comum==0 && preferencial>0){
            		preferenciais.add(passageiro);
            		return true; 
            	}	
        	}     	
      }
        return false;
    }

    public Passageiro buscarPassageiro(String id) { 
        for(int i = 0; i < cadeiras.size(); i++) { 
            if(cadeiras.get(i).getId().equals(id)) {
                return cadeiras.get(i); 
            }
        }
        return null;
    }
    
    public int buscarIndicePassageiro (String id) { 
    	for(int i = 0; i < cadeiras.size(); i++) { 
    		if(cadeiras.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean removerPassageiro (String id) {
        int posicao = buscarIndicePassageiro (id);
        if (posicao == -1) {
            return false;
        }
        cadeiras.remove(posicao);
        return true;
    }
}

