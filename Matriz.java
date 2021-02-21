/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ei1;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author lauro
 */
public class Matriz {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random ramdom = new Random();
        int[][] matriz = new int [4][5];
        int userInput = 0;
        int soma = 0;
        double media = 0;
        //populando matriz
        for(int i = 0; i < matriz.length; i++){
            
            for(int y = 0; y < matriz[i].length; y ++){
                
                matriz[i][y] = ramdom.nextInt(30) + 1;
                
            }
           
        }
        
        //entrada do usuario
        System.out.println("Digite o número de uma linha entre 1 e 4:");
        userInput = input.nextInt();
        userInput = userInput - 1;
        
        for(int y = 0; y < matriz[userInput].length; y ++){
            
            soma = soma + matriz[userInput][y];
            
        }
        
        System.out.println("A soma é: " + soma);
        
        System.out.println("Digite o número de uma coluna entre 1 e 5:");
        userInput = input.nextInt();
        userInput = userInput - 1;
        
        for(int i = 0; i < matriz.length; i ++){
            
            soma = soma + matriz[i][userInput];
        }
        
        media = soma/5;
        
        System.out.println("A média é: " + media);
    }
    
}
