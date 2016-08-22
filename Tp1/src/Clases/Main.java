package Clases;

import java.util.Scanner;

/**
 * Created by Ferchu on 22/08/2016.
 */
public class Main {

    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);

        Persona P1 = new Persona(sc.next(),sc.nextInt(),sc.next().charAt(0),sc.nextInt(),sc.nextInt());
        System.out.println(P1.toString());
        System.out.println("imc: " + P1.calcularimc());
        if (P1.isAdult()){
            System.out.println("Es adulto");
        }
        else{
            System.out.println("No Es adulto");
        }

         Password Pass1=new Password(sc.nextInt(),sc.next());
           System.out.println(Pass1.isStrong());


    }

}
