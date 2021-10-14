package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Refactorizcion de código ejemplo.
        suma();
        resta();
        multiplicacion();
        division();

    }

        public static void suma(){
            Scanner console = new Scanner( System.in);
            System.out.print("Enter addition number 1  ");
            int numero1 = console.nextInt();
            System.out.print("Enter addition number 2  ");
            int numero2 = console.nextInt();
            int addition = numero1 + numero2;
            System.out.println( numero1+" + "+numero2+" = "+ addition);


        }
        public static void resta(){
            Scanner console = new Scanner( System.in);
            System.out.print("Enter subtraction number 1  ");
            int numero1 = console.nextInt();
            System.out.print("Enter subtraction number 2  ");
            int numero2 = console.nextInt();
            int subtraction = numero1 - numero2;
            System.out.println( numero1+" - "+numero2+" = "+ subtraction);

        }
        public static void multiplicacion(){
            Scanner console = new Scanner( System.in);
            System.out.print("Enter multiplication number 1  ");
            int numero1 = console.nextInt();
            System.out.print("Enter multiplication number 2  ");
            int numero2 = console.nextInt();
            int multiplication = numero1 * numero2;
            System.out.println( numero1+" * "+numero2+" = "+ multiplication);

        }
        public static void division(){
            Scanner console = new Scanner( System.in);
            System.out.print("Enter division number 1  ");
            int numero1 = console.nextInt();
            System.out.print("Enter division number 2  ");
            int numero2 = console.nextInt();
            int division = numero1 / numero2;
            System.out.println( numero1+" / "+numero2+" = "+ division);
            console.close();
        }


}
