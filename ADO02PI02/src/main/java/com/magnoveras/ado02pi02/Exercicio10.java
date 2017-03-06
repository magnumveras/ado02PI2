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
public class Exercicio10 {
    
    //Método cria uma matriz e retorna 
    public static int [][] criaMatriz(int linha, int coluna){
        int matriz [][] = new int [linha][coluna];
        
        return matriz;
    }
    
    //Método soma todos os valores da Matriz
    public static int somaMatriz(int matriz [][]){
        int soma = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
               soma = soma + matriz[i][j]; 
            }
            
        }
        
        return soma;
    }
    
    public static void preencheMatriz(int matriz [][]){
        Scanner leia = new Scanner(System.in);
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Linha " + (i+1) + " Coluna " + (j+1));
                matriz[i][j] = leia.nextInt();
            }
            
        }
        
    }
    
    public static void imprimeMatriz(int matriz [][]){
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int linhas, colunas;
        int soma1, soma2, somaTotal;
        int matriz1 [][];
        int matriz2 [][];
        
        System.out.println("Quantas linhas?");
        linhas = leia. nextInt();
        
        System.out.println("Quantas Colunas?");
        colunas = leia.nextInt();
        
        matriz1 = criaMatriz(linhas, colunas);
        matriz2 = criaMatriz(linhas, colunas);
        
        preencheMatriz(matriz1);
        preencheMatriz(matriz2);
        
        imprimeMatriz(matriz1);
        System.out.println("**************************************************");
        System.out.println("");
        imprimeMatriz(matriz2);
        
        soma1 = somaMatriz(matriz1);
        soma2 = somaMatriz(matriz2);
        somaTotal = soma1 + soma2;
        
        System.out.println("Soma das Matrizes = " + somaTotal);
        
        
    }
}
