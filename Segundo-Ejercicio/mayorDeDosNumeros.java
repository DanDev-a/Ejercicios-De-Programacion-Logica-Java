/*
2) 
Declara 2 variables numéricas (con el valor que desees), 
he indica cual es mayor de los dos. Si son iguales indicarlo 
también. Ves cambiando los valores para comprobar que funciona.
*/ 

public class mayorDeDosNumeros {
    public static void main(String[] args){

        //Declaramos variables
        int num1 = 85;
        int num2 = 81;
        
        if (num1>num2){
            System.out.println("El mayor es: " + num1);
        }
        else{
            System.out.println("El menor es: " + num2);
        }
    }
}
