/*
5)
Escribe un programa que muestre por consola (con un print) los
números de 1 a 100 (ambos incluidos y con un salto de línea entre
cada impresión), sustituyendo los siguientes:
- Múltiplos de 3 por la palabra "fizz".
- Múltiplos de 5 por la palabra "buzz".
- Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        
        for (int i = 1; i <= num1; i++) {
            if( i % 3 ==0 && i % 5 == 0 ){
                System.out.println("Fizz Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 ==0){
                System.out.println("Buzz");
            }else{
                System.out.println("cont: " + i);
            }
        }

        sc.close();
    }
}
