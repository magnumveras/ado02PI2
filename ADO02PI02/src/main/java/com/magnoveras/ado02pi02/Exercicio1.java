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
public class Exercicio1 {
    
    public static String verifica50(float numero){
        String resultado = "";
        
        if (numero >= 50.0){
            resultado = "SUCESSO";
        }else{
            resultado = "ERRO";
        }
        
        return resultado;
    }
    
    
    public static void main(String[] args) {
        float numero;
        String resultado;
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.println("Digite um número: ");
        numero = leia.nextFloat();
        
        resultado = verifica50(numero);
        System.out.println(resultado);
        System.out.println("FIM DO PROGRAMA");
    }
}
