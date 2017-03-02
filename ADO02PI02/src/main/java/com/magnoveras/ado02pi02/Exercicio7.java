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
public class Exercicio7 {
    
    //Monta array com número de alunos fornecido pelo usuário
    public static int [] alunos(){
       int nAlunos = 0;
       int alunos [];
       
       Scanner leia = new Scanner(System.in);
       System.out.println("Digite o número de Alunos: ");
       nAlunos = leia.nextInt();
       
       alunos = new int[nAlunos];
       
       return alunos;
    }
    
    //Método calcula média da sala segundo número de alunos e nota de cada um.
    public static float mediaAlunos(int [] alunos){
        float media = 0;
        
        Scanner leia = new Scanner(System.in);
        
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite a nota do aluno " + (i+1) + ": ");
            media += leia.nextFloat();
        }
        
        return media = media / alunos.length;
    }
    
    
    public static void main(String[] args) {
        float media;
        
        media = mediaAlunos(alunos());
        
        System.out.println("Média da sala = " + media);
    }
}
