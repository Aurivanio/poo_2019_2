/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

/**
 *
 * @author USER
 */
public class ContaCorrente extends Conta {
        public ContaCorrente(String nome) {
        this.setId(auxId);
        this.setNome(nome);
        this.setSaldo(getSaldo());
        this.setTipo("CC");
        auxId++;
    }
}
