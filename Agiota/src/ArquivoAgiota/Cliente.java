/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArquivoAgiota;
public class Cliente{
    protected String apelido;
    protected String nome;
    protected double valorDivida;
    
    public Cliente(final String apelido, final String nome) {
        this.apelido = apelido;
        this.nome = nome;
        this.valorDivida = 0.0;
    }
    
    public String getApelido() {
        return this.apelido;
    }
    
    public double getValorDivida() {
        return this.valorDivida;
    }
    
    public void setValorDivida(final double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    @Override
    public String toString() {
        return this.apelido + " : " + this.nome + " : " + this.valorDivida;
    }
}