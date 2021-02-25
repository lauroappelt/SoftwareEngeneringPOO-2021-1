/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ei1;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author lauro
 */
public class CalcularVolumeCilindro {
    
    public static void main(String[] args) {
        
        double altura = 0;
        double raio = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a altura da lata de azeite em cm:");
        altura = entrada.nextDouble();
        
        System.out.println("Agora Informe o raio da lata de azeita em cm:");
        raio = entrada.nextDouble();
        
        double volume = calculaVolume(raio, altura);
        
        System.out.println("O volume da lata é: " +  new DecimalFormat("0.00").format(volume));
       
    }
    
    public static Double calculaVolume(double raio, double altura){
       
        double volume = 3.14 * (raio * raio) * altura; 
        
        return volume;
    }
    
}
