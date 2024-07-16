/*
1) 
    Declara dos variables numéricas (con el valor que desees), 
    muestra por consola la suma, resta, multiplicación, división y 
    módulo (resto de la división).
*/

public class operacionesBasicas {
    public static void main(String[] args) throws Exception {
        
        //Declaramos las dos variables que operaremos
        int num1 = 10;
        int num2 = 5;

        //Resolvemos y Mostramos los Resultados de las operaciones
        System.out.println("Resultado de la Suma: " + (num1 + num2));

        System.out.println("Resultado de la Resta: " + (num1 - num2));
 
        System.out.println("Resultado de la Multiplicacion: " + (num1 * num2));

        System.out.println("Resultado de la Division: " + (num1 / num2));

        System.out.println("Resultado de la Division (Modulo): " + (num1 % num2));
    }
}
