/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabagiota;

/**
 *
 * @author USER
 */
public class Transacao{
    protected String clienteId;
    protected double valor;
    protected int nextId;
    
    public Transacao(int nextId,String clienteId,double valor) {
        this.clienteId = clienteId;
        this.valor = valor;
        this.nextId = nextId;
    }
    
    public String getClienteId() {
        return this.clienteId;
    }
    
    @Override
    public String toString() {
        return "id:" + this.nextId + " [" + this.clienteId + " " + this.valor + " ]";
    }
}

