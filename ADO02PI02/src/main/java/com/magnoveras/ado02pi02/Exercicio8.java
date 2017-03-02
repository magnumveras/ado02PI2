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
public class Exercicio8 {
    //Método entrega um array com a números aleatorios entre 0 e 1000 segundo ao parâmetro quantidade
    public static int [] solicitaNumeros(int quantidade){
        int numeros [] = new int[quantidade];
        
        Random r = new Random();
        
        for(int i = 0; i < quantidade; i++){
            numeros[i] = r.nextInt(1000);
        }
        
        return numeros;
    }
    //Método entrega o maior elemento do vetor
    public static int maiordoVetor(int vetor []){
        int maior = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(i == 0){
                maior = vetor[i];
            }else if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }
    //Método entrega a posição do maior elemento no vetor
    public static int posicaodoMaior(int vetor []){
        int posicao = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(i == 0){
                posicao = i;
            }else if(vetor[i] > vetor[posicao]){
                posicao = i;
            }
        }
        
        return posicao;
    }
    
    public static int quantidadedeNumeros(){
        int qtd = 0;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a quantidade de números que você quer? ");
        return qtd = leia.nextInt();
        
    }
    
    public static void imprimeVetor(int vetor []){
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Rodada " + (i+1) + " = " + vetor[i]);
        }
    }
    
    public static void main(String[] args) {
        int maior, posicaoM;
        //Solicita ao usuário uma determinada quantidade de números aleatórios
        int quantidade = quantidadedeNumeros();
        
        //Cria um vetor do tamanho da quantidade informada
        int vetorNumeros [] = new int [quantidade];
        
        //Preenche o vetor com os números selecionados
        vetorNumeros = solicitaNumeros(quantidade);
        
        //Imprime vetor
        imprimeVetor(vetorNumeros);
        
        //Imprime maior
        maior = maiordoVetor(vetorNumeros);
        System.out.println("maior = " + maior);
        
        //Imprime posição do maior
        posicaoM = posicaodoMaior(vetorNumeros);
        System.out.println("Maior estava na rodada " + (posicaoM+1));
        
        
    }
}
