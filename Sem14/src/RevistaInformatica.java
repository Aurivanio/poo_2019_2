import java.util.Observable;
import java.util.Observer;
 
public class RevistaInformatica extends Observable {
 
    private int edicao;
 
    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;
        notifyObservers();
    }
     
    public int getEdicao() {
        return this.edicao;
    }
         
        setChanged();
     
    public static void main(String[] args) {
        //poderia receber a nova edicao atraves de um recurso externo
        int novaEdicao = 3;
        RevistaInformatica revistaInformatica = new RevistaInformatica();       
        Assinante1 assinante1 = new Assinante1(revistaInformatica);
        Assinante2 assinante2 = new Assinante2(revistaInformatica);
        revistaInformatica.addObserver(new Observer() {
			@Override
			public void update(Observable o, Object arg) {
				System.out.println("estou pendurado");
			}
        });
         
        revistaInformatica.setNovaEdicao(novaEdicao);
        revistaInformatica.setNovaEdicao(4);
        revistaInformatica.setNovaEdicao(5);
        revistaInformatica.setNovaEdicao(6);
    }
}
 
class Assinante1 implements Observer {
    Observable revistaInformatica;
    int edicaoNovaRevista;
    public Assinante1(Observable revistaInformatica) {
        this.revistaInformatica = revistaInformatica;
        revistaInformatica.addObserver(this);
    }
    @Override
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof RevistaInformatica) {
            System.out.println("To te vendo");
        }
    }   
}

class Assinante2 implements Observer {
    public Assinante2(Observable revistaInformatica) {
        revistaInformatica.addObserver(this);
    }
    @Override
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof RevistaInformatica) {
            System.out.println("oi");
        }
    }   
}
