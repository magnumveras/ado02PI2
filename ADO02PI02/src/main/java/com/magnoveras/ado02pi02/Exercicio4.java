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
public class Exercicio4 {
    //Método que verifica a média aritmética de 5 números
    public static float media(float n1, float n2, float n3, float n4, float n5){
        float media = 0;
        
        return media = ((n1+n2+n3+n4+n5)/5);
        
    }
    //Método mostra mensagens para cada devida média
    public static void mensagens(float media){
        if(media < 5){
            System.out.println("REPROVADO");
        }else if((media >= 5)&&(media < 9)){
            System.out.println("APROVADO");
        }else if(media == 9){
            System.out.println("PARABÉNS");
        }else if (media == 10){
            System.out.println("MASTER OF THE UNIVERSE");
        }
        
    }
    
    //Método que pede 5 números ao usuário e retorna a média aritmética dos mesmos
    public static void cincoNumeros(){
        float n1, n2, n3, n4, n5;
        float media = 0;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        n1 = leia.nextFloat();
        
        System.out.println("Digite o número 2: ");
        n2 = leia.nextFloat();
        
        System.out.println("Digite o número 3: ");
        n3 = leia.nextFloat();
        
        System.out.println("Digite o número 4: ");
        n4 = leia.nextFloat();
        
        System.out.println("Digite o número 5: ");
        n5 = leia.nextFloat();
        
        media = media(n1, n2, n3, n4, n5);
        
        System.out.println("Média = " + media);
        mensagens(media);
    }
    public static void main(String[] args) {
        cincoNumeros();
    }
}
