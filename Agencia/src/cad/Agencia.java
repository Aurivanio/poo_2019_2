/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import java.util.ArrayList;

public class Agencia {
     private ArrayList<Cliente> clientes;
    private ArrayList<Conta> contas;

    Agencia() {
        clientes = new ArrayList<Cliente>();
        contas = new ArrayList<Conta>();

    }

    public void addCliente(String nome) {
        for (Cliente c1 : clientes) {
            if (c1.getNome().equals(nome)) {
                System.out.println("Cliente já existente");
                return;
            }
        }
        Cliente c1 = new Cliente(nome);
        Conta corrente = new ContaCorrente(nome);
        Conta poupanca = new ContaPoupanca(nome);
        this.clientes.add(c1);
        c1.addConta(corrente);
        c1.addConta(poupanca);
        this.contas.add(corrente);
        this.contas.add(poupanca);
    }
    
     public boolean saque(int indice, double valor){
        for (Conta c : contas){
            if(valor <= c.getSaldo() && indice == c.getId()){
                c.setSaldo(c.getSaldo()-valor);
                return true;
            }
            else if(valor > c.getSaldo() && indice == c.getId()){
                System.out.println("O valor digitado é maior que o saldo");
                return false;
            }
        }
        System.out.println("Conta inexistente");
        return false;
    }
    public void deposito(int indice, double valor){
        for (Conta c : contas){
            if(indice == c.getId()){
                c.setSaldo(c.getSaldo()+valor);
                return;
            }
        }
        System.out.println("Conta inexistente");
    }
    public void show() {
        for (Conta c : contas) {
            System.out.println("Id: "+c.getId() + " Nome: " + c.getNome() + " Saldo: " + c.getSaldo() + " Tipo: " + c.getTipo());
        }
    }
  
    public void transf(int indice1, int indice2, double valor){
        if(this.saque(indice1, valor)){
            this.deposito(indice2, valor);
        }
    }
    public void atualizar(){
        for (Conta c : contas){
            if(c.getTipo().equals("CC")){
                c.setSaldo(c.getSaldo()-20);
            }
            else{
                c.setSaldo(c.getSaldo()+(c.getSaldo()*0.01));
            }
        }
    }
}
