/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

public class Conta {
    static int auxId = 0; 
    private int id = 0;
    private String nome;
    private double saldo;
    private String tipo;

    Conta(String nome, double saldo, String tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    Conta() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAuxId() {
        return auxId;
    }

    public static void setAuxId(int auxId) {
        Conta.auxId = auxId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

 
