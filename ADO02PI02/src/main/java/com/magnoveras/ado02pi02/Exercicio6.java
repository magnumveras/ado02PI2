/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnoveras.ado02pi02;

/**
 *
 * @author Magno
 */
public class Exercicio6 {
    
    //Método monta matriz de nove linhas e 9 colunas e as preenche conforme a tabuada do 9
    public static int [][] montaMatrizNove(){
        int [][] matrizNove = new int[9][9];
        
        for(int i = 1; i <=9; i++){
            for(int j = 1; j<=9; j++){
                matrizNove[i-1][j-1] = i*j;
            }
        }
        
        return matrizNove;
    }
    
    //Método para imprimir tabuada da forma correta
    public static void imprimeMatriz(){
        int [][] tabNove = montaMatrizNove();
        
        System.out.println("* | 1  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------");
        for(int i = 0; i < tabNove.length; i++){
            System.out.print((i+1) + " | ");
            for(int j = 0; j < tabNove.length; j++){
                if(tabNove[i][j] > 9){
                   System.out.print(tabNove[i][j] + " "); 
                }else{
                   System.out.print(tabNove[i][j] + "  "); 
                }
                
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        imprimeMatriz();
    }
}
