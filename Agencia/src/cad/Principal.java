/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
       
        Agencia agencia = new Agencia();
        Scanner leitor = new Scanner(System.in);
         System.out.println("MENU");
        System.out.println("addCliente para adicionar cliente");
        System.out.println("depositar para depositar um valor");
        System.out.println("saque para sacar um valor");
        System.out.println("transf para transferir valores");
        System.out.println("atualizar para atualização mensal");
        System.out.println("show para mostrar resultados");
        
        
        
        while (true) {
            String lista = leitor.nextLine();
            String vetor[] = lista.split(" ");
            switch (vetor[0]) {
                case "addCliente":
                    agencia.addCliente(vetor[1]);
                    
                    break;
                case "depositar":
                    agencia.deposito(Integer.parseInt(vetor[1]), Double.parseDouble(vetor[2]));
                    break;
                case "saque":
                    agencia.saque(Integer.parseInt(vetor[1]), Double.parseDouble(vetor[2]));
                    break;
                case "show":
                    agencia.show();
                    break;
                case "transf":
                    agencia.transf(Integer.parseInt(vetor[1]), Integer.parseInt(vetor[2]), Double.parseDouble(vetor[3]));
                    break;
                case "atualizar":
                    agencia.atualizar();
                    break;
                case "end":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Comando invÃ¡lido!");
                    break;
            }
        }
    }
    }

