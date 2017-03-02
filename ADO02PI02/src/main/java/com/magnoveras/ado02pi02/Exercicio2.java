/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnoveras.ado02pi02;

import java.util.Scanner;

/**
 *
 * @author Adalberto
 */
public class Exercicio2 {
    
    //Vefifica se é um número par ou ímpar
    public static void verificaParImpar(int numero){
        String verificador = "";
        
        if(numero % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("ÍMPAR");
        }
    }
    
    //Método verifica se foi digitado um número mesmo
    public static boolean verificaNumero(String numero){
        boolean verifica = false;
        
        for(int i = 0; i < numero.length(); i++){
            if(Character.isDigit(numero.charAt(i)) == false){
                System.out.println("Não é um número!");
                break;
            }
        }
       return verifica = true;
    }
    
    //Método pede um número
    public static String numero(){
        String numero;
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = leia.next();
        
        return numero;
    }
    
    public static void numeroPrimo(int numero){
        int contador = 0;
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                System.out.println("Não é primo!");
                contador += 1;
                break;
            }
        }
        if(contador == 0){
            System.out.println("Número Primo!");
        }
        
    }
    
    public static void main(String[] args) {
        
        String numero = numero();
        
         
        //Continua caso seja mesmo um número
        if (verificaNumero(numero)) {
            verificaParImpar(Integer.parseInt(numero));
            numeroPrimo(Integer.parseInt(numero));
        }
        
    }
    
    
    
    
    
}
