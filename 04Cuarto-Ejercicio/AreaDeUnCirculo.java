/*
4) Haz una aplicación que calcule el área de un círculo(pi*R2). 
El radio se pedirá por teclado. Usa la constante PI y el método 
pow de Math.
*/

import java.util.Scanner;

public class AreaDeUnCirculo {
    public static void main(String[] args){
        
        //Se declara la clase scanner
        Scanner sc = new Scanner (System.in);

        //Se pide introducir un numero
        System.out.println("Asignale el Radio al circulo");
        double Radio = sc.nextDouble();
        
        //Resuelve y muestra el resultado de la operacion
        System.out.println("El area del circulo es de: " + (Math.PI * Math.pow(Radio , 2)));

        sc.close();
    }
}
