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
public class Exercicio9 {
    
    //Método monta matriz de dias da semana com duas linhas para duas matérias por dia
    public static String [][] montaMatrizDS(){
       String matrizDS [][] = new String [5][2];
       
       return matrizDS;
    }
    
    //Preenche a Matriz com todas as matérias de segunda a sexta
    public static void preencheMatriz(String matriz [][]){
        Scanner leia = new Scanner(System.in);
        
        for(int i = 0; i < matriz.length; i++){
            //Pega as linhas da matriz
            for(int j = 0; j < matriz[0].length; j++){
                if(i == 0){
                    System.out.println("Qual a matéria 1 de Segunda-feira?");
                    matriz[i][j] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Segunda-feira?");
                    matriz[i][j+1] = leia.nextLine(); 
                }else if(i == 1){
                    System.out.println("Qual a matéria 1 de Terça-feira?");
                    matriz[i][+1] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Terça-feira?");
                    matriz[i][j+1] = leia.nextLine(); 
                }else if(i == 2){
                    System.out.println("Qual a matéria 1 de Quarta-feira?");
                    matriz[i][j] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Quarta-feira?");
                    matriz[i][j+1] = leia.nextLine();
                }else if(i == 3){
                    System.out.println("Qual a matéria 1 de Quinta-feira?");
                    matriz[i][j] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Quinta-feira?");
                    matriz[i][j+1] = leia.nextLine();
                }else if(i == 4){
                    System.out.println("Qual a matéria 1 de Sexta-feira?");
                    matriz[i][j] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Sexta-feira?");
                    matriz[i][j+1] = leia.nextLine();
                }
            }
        }
        
        imprimeMatrizInteira(matriz);
    }
    
    public static void imprimeMatrizInteira(String matriz [][]){
        
        System.out.println("Segunda | Terça | Quarta | Quinta | Sexta");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + "  ");
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        preencheMatriz(montaMatrizDS());
        
        
    }
}
