/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnoveras.ado02pi02;

import java.util.Scanner;

/**
 *
 * @author Magno
 */
public class Exercicio3 {
    //Método escreve número por extenso
    public static void numeroExtenso(int numero){
        
        if(numero == 0){
            System.out.println("ZERO");
        }else if (numero == 1){
            System.out.println("HUM");
        }else if(numero == 2){
            System.out.println("DOIS");
        }else if(numero == 3){
            System.out.println("TRÊS");
        }else if(numero == 4){
            System.out.println("QUATRO");
        }else if(numero == 5){
            System.out.println("CINCO");
        }else if(numero == 6){
            System.out.println("SEIS");
        }else if(numero == 7){
            System.out.println("SETE");
        }else if(numero == 8){
            System.out.println("OITO");
        }else if(numero == 9){
            System.out.println("NOVE");
        }else if((numero < 0)||(numero > 9)){
            System.out.println("erro");
        }
    }
    
    //Método verifica se foi digitado um número mesmo
    public static boolean verificaNumero(String numero){
        boolean verifica = false;
        
        for(int i = 0; i < numero.length(); i++){
            if(Character.isDigit(numero.charAt(i)) == false){
                System.out.println("Não é um número válido!");
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
    public static void main(String[] args) {
        String numero = numero();
        verificaNumero(numero);
        numeroExtenso(Integer.parseInt(numero));
    }
}
