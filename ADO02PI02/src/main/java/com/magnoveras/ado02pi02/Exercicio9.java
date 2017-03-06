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
       String matrizDS [][] = new String [2][5];
       
       return matrizDS;
    }
    
    //Preenche a Matriz com todas as matérias de segunda a sexta
    public static void preencheMatriz(String matriz [][]){
        Scanner leia = new Scanner(System.in);
        
        //Pega as Colunas da Matriz
        for(int i = 0; i < 5; i++){
            //Pega as Linhas da matriz
            for(int j = 0; j < 1; j++){
                if(i == 0){
                    System.out.println("Qual a matéria 1 de Segunda-feira?");
                    matriz[j][i] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Segunda-feira?");
                    matriz[j+1][i] = leia.nextLine(); 
                }else if(i == 1){
                    System.out.println("Qual a matéria 1 de Terça-feira?");
                    matriz[j][i] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Terça-feira?");
                    matriz[j+1][i] = leia.nextLine(); 
                }else if(i == 2){
                    System.out.println("Qual a matéria 1 de Quarta-feira?");
                    matriz[j][i] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Quarta-feira?");
                    matriz[j+1][i] = leia.nextLine();
                }else if(i == 3){
                    System.out.println("Qual a matéria 1 de Quinta-feira?");
                    matriz[j][i] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Quinta-feira?");
                    matriz[j+1][i] = leia.nextLine();
                }else if(i == 4){
                    System.out.println("Qual a matéria 1 de Sexta-feira?");
                    matriz[j][i] = leia.nextLine();
                    System.out.println("Qual a matéria 2 de Sexta-feira?");
                    matriz[j+1][i] = leia.nextLine();
                }
            }
        }
        
        System.out.println("");
    }
    
    //Imprime todas as aulas de todos os dias 
    public static void imprimeMatrizInteira(String matriz [][]){
      //Número de colunas
      for(int i = 0; i < matriz[0].length; i++){
          //Número de linhas
          for(int j = 0; j < matriz.length; j++){
              //Identifica primeiras linhas e colunas para gravar dia especifico
              if((i == 0)&&(j == 0)){
                  System.out.println("Segunda-feira");
              }else if((i == 1)&&(j == 0)){
                  System.out.println("Terça-feira");
              }else if((i == 2)&&(j == 0)){
                  System.out.println("Quarta-feira");
              }else if((i == 3)&&(j == 0)){
                  System.out.println("Quinta-feira");
              }else if((i == 4)&&(j == 0)){
                  System.out.println("Sexta-Feira");
              }
              
              System.out.println("Aula " + (j+1) + " = " + matriz[j][i]);
          }
          System.out.println("");
      }
    }
    
    //Imprime aulas por dia
    public static void imprimeAulaporDia(String matriz [][], int dia){
        if(dia == 1){
           System.out.println("Segunda-feira");
           System.out.println("Aula 1: " + matriz[0][0]);
           System.out.println("Aula 2: " + matriz[1][0]);
        }else if(dia == 2){
           System.out.println("Terça-feira");
           System.out.println("Aula 1: " + matriz[0][1]);
           System.out.println("Aula 2: " + matriz[1][1]);
        }else if(dia == 3){
           System.out.println("Quarta-feira");
           System.out.println("Aula 1: " + matriz[0][2]);
           System.out.println("Aula 2: " + matriz[1][2]); 
        }else if(dia == 4){
           System.out.println("Quinta-feira");
           System.out.println("Aula 1: " + matriz[0][3]);
           System.out.println("Aula 2: " + matriz[1][3]);  
        }else if(dia == 5){
           System.out.println("Sexta-feira");
           System.out.println("Aula 1: " + matriz[0][4]);
           System.out.println("Aula 2: " + matriz[1][4]); 
        }
    }
    
    //Método cria menu de interface com o usuário
    public static void menu(String matriz [][]){
        boolean verifica = true;
        String opcao;
        int dia;
        Scanner leia = new Scanner(System.in);
        do{
            System.out.println("***********MENU**************");
            System.out.println("1 - Imprime todas as aulas");
            System.out.println("2 - Imprime por dia");
            System.out.println("Escreva 'Sair'");
            opcao = leia.nextLine();
            
            if(opcao.equalsIgnoreCase("1")){
                imprimeMatrizInteira(matriz);
            }else if(opcao.equalsIgnoreCase("2")){
                System.out.println("Qual dia quer imprimir?");
                System.out.println("1 - Segunda-Feira");
                System.out.println("2 - Terça-Feira");
                System.out.println("3 - Quarta-Feira");
                System.out.println("4 - Quinta-Feira");
                System.out.println("5 - Sexta-Feira");
                dia = leia.nextInt();
                
                imprimeAulaporDia(matriz, dia);
            }else if(opcao.equalsIgnoreCase("Sair")){
                verifica = false;
                
            }
            
        }while(verifica == true);
    }
    
    public static void main(String[] args) {
        
        String matriz [][] = montaMatrizDS();
        preencheMatriz(matriz);
        
        menu(matriz);
        
        
    }
}
