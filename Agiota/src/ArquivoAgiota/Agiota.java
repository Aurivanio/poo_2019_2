/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArquivoAgiota;
import java.util.Iterator;
import java.util.ArrayList;

public class Agiota{
    protected double saldo;
    protected ArrayList<Cliente> clientes;
    protected ArrayList<Transacao> transacoes;
    protected static int nextId;
    
    public Agiota(double saldo) {
        this.clientes = new ArrayList<Cliente>();
        this.transacoes = new ArrayList<Transacao>();
        this.saldo = saldo;
        Agiota.nextId = 0;
        System.out.println("Agiota iniciado");
    }
    
    public boolean addCliente(String nome,String nomeC) {
        for (final Cliente i : this.clientes) {
            if (i.getApelido().equals(nome)) {
                System.out.println("Cliente já existe");
                return false;
            }
        }
        Cliente cliente = new Cliente(nome, nomeC);
        this.clientes.add(cliente);
        System.out.println("Cliente adicionado");
        return true;
    }
    
    public boolean emprestar( String apelido,double valor) {
        if (this.saldo > valor) {
            for (Cliente i : this.clientes) {
                if (i.getApelido().equals(apelido)) {
                    i.setValorDivida(i.getValorDivida() + valor);
                    this.saldo -= valor;
                    final Transacao transacao = new Transacao(Agiota.nextId, apelido, valor * -1.0);
                    this.transacoes.add(transacao);
                    ++Agiota.nextId;
                    return true;
                }
            }
            System.out.println("Cliente não encontrado");
            return false;
        }
        System.out.println("Saldo menor do que o valor");
        return false;
    }
    
    public void historico() {
        for ( Transacao t : this.transacoes) {
            System.out.println(t);
        }
    }
    
    public void resumo() {
        for (Cliente c : this.clientes) {
            System.out.println(c);
        }
        System.out.println("Saldo restante: "+this.saldo);
    }
    
    public void filtrar(final String apelido) {
        for (Transacao t : this.transacoes) {
            if (t.getClienteId() == apelido) {
                System.out.println(t);
            }
        }
    }
    
    public void receber(String apelido,double valor) {
        for (Cliente c : this.clientes) {
            if (c.getApelido() == apelido) {u8n
                c.setValorDivida(c.getValorDivida() - valor);
                this.saldo += valor;
                Transacao transacao = new Transacao(Agiota.nextId, apelido, valor);
                this.transacoes.add(transacao);
                ++Agiota.nextId;
            }
        }
        System.out.println("fail: cliente n\u00e3o encontrado ");
    }
    public void matar(String apelido) {
       
        for (Transacao c : this.transacoes) {
            if (c.getClienteId().equals(apelido)) {
                this.transacoes.remove(c);
               this.clientes.remove(c);
                System.out.println(apelido + " morto");   
            }}
        System.out.println("fail: cliente não encontrado");
        }
        
       
    }
 
 
