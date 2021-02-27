/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
   public static void main (String[] args ) {
   Scanner entrada=new Scanner(System.in);
       System.out.println("Por favor digite dos numeros");
       System.out.println("Numero 1: ");
       int num1=entrada.nextInt();
       System.out.println("Numero 2: ");
       int num2=entrada.nextInt();
       
       System.out.printf("num1=%d\n",num1);
       System.out.printf("El valor de %d+%d es %d\n",num1,num1,(num1+num1));
       System.out.printf("num1=%.2f\n",(float)num1);
       System.out.printf("%d-%d\n",(num1+num2),(num2+num1));
   
   
   
   
   
   }
}
