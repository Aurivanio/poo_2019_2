class Passageiro {
	
	public String id;
    public int idade;
    
    public Passageiro (String id, int idade){
        this.id = id;
        this.idade = idade;
    }

	public String toString() {
		return "\nPerfil do passageiro :) \n" + "ID: " + id + "\n" + "Idade: " + idade + "\n"; 
	}

	public String getId() { 
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
    
    
}