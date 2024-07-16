/*
3)
Introduce tu nombre por teclado que contenga tu nombre, después muestra un 
mensaje de bienvenida por consola. Por ejemplo: 
si introduzco «Fernando», me aparezca «Bienvenido Fernando».
*/

import java.util.Scanner;

public class saludoPersonalizado {
    public static void main(String[] args){
         
        //Declaramaos la Clase Scanner 
        Scanner sc = new Scanner(System.in);

        //Introducimos un nombre
        System.out.println("¿Cual es tu nombre?");
        String nombre = sc.nextLine();

        //Damos la bienvenida 
        System.out.println("¡Bienvenido! " + nombre);

        sc.close();
    }
}
