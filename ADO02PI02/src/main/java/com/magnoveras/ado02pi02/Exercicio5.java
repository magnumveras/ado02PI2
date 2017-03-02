/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnoveras.ado02pi02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Magno
 */
public class Exercicio5 {
    //Método gera número automático para o usuário
    public static int geraNumero(){
        int numero;
        
        Random r = new Random();
        return numero = r.nextInt(100);  
    }
    //Método que implementa o menu a ser jogado
    public static void jogoAdivinhacao(String numero){
        String numeroU;
        boolean sair = false;
        Scanner leia = new Scanner(System.in);
        
        do{
            
            System.out.println("Digite um número: ");
            numeroU = leia.nextLine();
            System.out.println(numero);
          
            if(numeroU.equalsIgnoreCase(numero)){
                System.out.println("Sucesso você acertou o número");
                System.out.println("Número = " + numero);
                sair = true;
            }
            
            
            if(numeroU.equalsIgnoreCase("desistir")){
                sair = true;
            }
        }while(sair == false);
        
        
    }
    
    public static void main(String[] args) {
        int numero = geraNumero();
        
        jogoAdivinhacao(String.valueOf(numero));
    }
}
