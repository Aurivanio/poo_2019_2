package Topic;
class Passageiro {
	
	public String id; //atributos
    public int idade;
    
    public Passageiro (String id, int idade){ //método construtor
        this.id = id;
        this.idade = idade;
    }

	public String toString() { //método toString
		return "\nPerfil do passageiro :) \n" + "ID: " + id + "\n" + "Idade: " + idade + "\n"; //o \n serve para quebrar a linha no print
	}

	public String getId() { //get e set a partir daqui
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
