package Favio;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {


    public static void main (String[] args) {
        int opcion;
        Scanner sc = new Scanner (System.in);

        System.out.println("Elija que ejercicio desea ver: ");
        for (int i = 1;i<=31;i++){
            System.out.println("Opcion "+i+": Ejercicio "+i);
        }

        while(true){
            try {
                opcion = sc.nextInt();
                break;
            }catch(java.util.InputMismatchException e) {
                System.out.println("Ingrese un numero.");
                sc.nextLine();
            }
        }

        switch (opcion){
            case 1: System.out.println("Fer es un droide");break;
            default:System.out.println("gil");break;
        }



    }


    static void ejercicio1(){
        for(int i=0;i<=100;i++){
            System.out.println("Numero del 1 al 100: ");
            System.out.print(i+" ");
        }
    }


    static void ejercicio2(){
        for(int i=100;i>=0;i--){
            System.out.println("Numero del 100 al 1: ");
            System.out.print(i+" ");
        }
    }


    static void ejercicio3(){
        int suma=0;
        for(int i=0;i<=100;i++){
            suma=+ i;
        }
        System.out.println("La suma de los numeros del 1 al 100 es: "+suma);
    }

    static void ejercicio4(){
        System.out.println("Los numeros pares existentes entre 1 y 100: ");
        for(int i=0;i<=100;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    static void ejercicio5(){
        int cantImpares=0;
        for(int i=0;i<=100;i++){
            if (i%2!=0){
                System.out.print(i+" ");
                cantImpares=+1;
            }
        }
        System.out.println("Entre 1 y 100 hay : " +  cantImpares+" numeros impares");
    }


    static void ejercicio6(){
        int sumaImpares=0;
        for(int i=100;i>0;i--){
            if (i%2!=0){
                System.out.print(i+" ");
                sumaImpares+=i;
            }
        }
        System.out.println("La sumatoria de los numeros impares existentes entre 1 y 100 es : " +sumaImpares);
    }


    static void ejercicio7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero mayor que cero: ");
        int num = sc.nextInt();
        while(num >= 0){
            System.out.print("Numero no valido. Introduce un numero mayor que cero: ");
            num = sc.nextInt();
        }

        System.out.print("\nNumeros naturales desde el cero hasta el numero introducido: ");
        for(int i=0;i<=num;i++){
            System.out.print(i+" ");
        }
    }


    static void ejercicio8(){
        int cant=0;
        System.out.print("Multiplos de 3 existentes entre 1 y 100");
        for(int i=1;i<=100;i++){
            if (i%3==0){
                System.out.println(i+" ");
                cant= cant+1;
            }
        }
        System.out.println("Cantidad de multiplos de 3: " +  cant);
    }


    static void ejercicio9(){
        int sumaImpares=0;
        for(int i=0;i<100;i++){
            if (i%2!=0){
                sumaImpares+= i;
            }
        }
        System.out.print("La suma de los numeros impares: "+sumaImpares);
    }

    static void ejercicio10(){
        int cant=0;
        for(int i=0;i<=500;i++){
            if (i%5==0){
                System.out.print(i+" ");
                cant= cant+1;
            }
        }
        System.out.println("El total de multiplos de 5: " +  cant);
    }


    static void ejercicio11(){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        int suma=0,cant=0;
        System.out.println("Multiplos de 2 existentes entre 0 y 100 ");
        for(int i=0;i<=num;i++){
            if (i%2==0){
                System.out.print(i+" ");
                cant+=1;
                suma+=i;
            }

        }
        System.out.println("El total de multiplos de 2: "+ cant);
        System.out.println("\nSuma total de los multiplos de 10: "+suma);
    }


    static void ejercicio12(){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        int suma=0,cant=0;
        System.out.println("Multiplos de 3 existentes entre 0 y 100 ");
        for(int i=0;i<=num;i++){
            if (i%10==0){
                System.out.print(i+" ");
                cant+=1;
                suma+=i;
            }

        }
        System.out.println("El total de multiplos de 10: "+ cant);
        System.out.println("\nSuma total de los multiplos de 10: "+suma);
    }

    static void ejercicio13(){
        int num,suma=0,cant=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero menor que 500: ");
        num = sc.nextInt();
        while (num >= 500){
            System.out.println("Numero no valido. ntroduce un numero menor que 500: ");
            num = sc.nextInt();
        }

        for(int i=num;i<=500;i=i+8){
            System.out.print(i+" ");
            cant=cant+1;
            suma=suma+i;
        }

        System.out.println("Cantidad total: "+ cant);
        System.out.println("Suma total de numeros: "+suma);
    }


    static void ejercicio14(){
        int suma=0;
        for(int i=0;i<=100;i++){
            if (i%2==0){
                suma+=(i*i);
            }
        }
        System.out.print("La suma de los cuadrados de los numeros pares es: "+suma);
    }


    static void ejercicio15(){
        int num,sumatoria=0;
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero positivo y menor que 100");
        num = sc.nextInt();
        while(num >= 100 || num <= 0){
            System.out.println("El numero ingresado no es valido. Por favor ingrese nuevamente: ");
            num = sc.nextInt();
        }
        for (int i=1;i<=num;i+=4){
            sumatoria+=Math.pow(i, 2);
        }
        System.out.println("La sumatoria de los cuadrados es: "+Math.pow(num, 2));
    }


    static void ejercicio16(){
        int num;
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero distinto de cero: ");
        num = sc.nextInt();
        while(num == 0){
            System.out.println("El numero ingresado no es valido. Por favor ingrese nuevamente: ");
            num = sc.nextInt();
        }
        if (num > 0){
            System.out.println("Ha ingresado un numero positivo: ");
        } else{
            System.out.println("Ha ingresado un numero negativo");
        }

    }

    static void ejercicio17(){
        int num;
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero distinto de cero: ");
        num = sc.nextInt();
        while(num == 0){
            System.out.println("El numero ingresado no es valido. Por favor ingrese nuevamente: ");
            num = sc.nextInt();
        }
        if (num %2 == 0){
            System.out.println("El numero ingresado es par: ");
        } else {
            System.out.println("El numero ingresado es impar");
        }

    }

    static void ejercicio18(){
        int num,cantidadMultiplos=0;
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero positivo");
        num = sc.nextInt();
        while(num <= 0){
            System.out.println("El numero ingresado no es valido. Por favor ingrese nuevamente: ");
            num = sc.nextInt();
        }
        System.out.println("\nLos numeros multiplos de 3 son: ");
        for (int i=1;i<=num;i++){
            if (i % 3==0){
                System.out.println(i+" ");
                cantidadMultiplos += 1;
            }

        }
        System.out.println("En total hay "+cantidadMultiplos+" de multiplos de 3");

    }

    static void ejercicio19(){
        int sumatoriaPares=0,sumatoriaImpares=0;

        for (int i=1;i<=100;i++){
            if (i%2==0){
                sumatoriaPares += i;
            }else {
                sumatoriaImpares+=i;
            }
        }
        System.out.println("La sumatoria de los pares es:  "+sumatoriaPares);
        System.out.println("La sumatoria de los impares es:  "+sumatoriaImpares);
    }

    static void ejercicio20(){
        int cantMultiplos=0;
        int sumatoriaMultiplos=0;


        for (int i=1;i<=100;i++){
            if (i%2==0 || i%3==0 ){
                sumatoriaMultiplos+=i;
                cantMultiplos+= 1;
            }
        }
        System.out.println("Entre 1 y 100 hay en total "+cantMultiplos+" multiplos de 2 o 3 , y su sumatoria es :"+sumatoriaMultiplos);

    }

    static void ejercicio21(){
        int cantMultiplos=0;
        int sumatoriaMultiplos=0;

        for (int i=1;i<=100;i++){
            if (i%2==0 && i%3==0 ){
                sumatoriaMultiplos=i;
                cantMultiplos= 1;
            }
        }
        System.out.println("Entre 1 y 100 hay en total "+cantMultiplos+" multiplos de 2 y 3 , y su sumatoria es :"+sumatoriaMultiplos);
    }

    static void ejercicio22(){
        int num,max,min;
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca numero: ");
        num = max = min = sc.nextInt();

        for (int i=0;i < 4;i++){
            System.out.println("Introduzca siguiente numero: ");
            num = sc.nextInt();
            if (num > max){
                max = num;
            }else if (num < min){
                min=num;
            }
        }

        System.out.println("El maximo de los numeros inrgesados es: "+max+" y el minimo es: "+min);

    }

    static void ejercicio23(){
        int num1,num2,max,min,cantTotal=0,cantPares=0,sumatoriaImpares=0;
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca segundo numero, distinto al primer numero: ");
        num2 = sc.nextInt();
        while (num1==num2){
            System.out.println("Error. El numero debe ser distinto del primero. Introduzcalo nuevamente");
            num2 = sc.nextInt();

        }

        if (num1>num2){
            max=num1;
            min=num2;
        }else {
            max=num2;
            min=num1;
        }

        System.out.println("Los numeros narturales comprendidos entre dichos numeros son");
        for (int i=min+1;i < max;i++) {
            System.out.println(i+" ");
            cantTotal+=1;
            if (i%2!=0){
                sumatoriaImpares+=i;
            }
        }

        System.out.println("Entre los numeros ingresados hay en total: "+cantTotal+" numeros");
        System.out.println("La sumatoria de los numeros impares es: "+sumatoriaImpares);

    }

    static void ejercicio24(){
        int cantidad,num;
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca la cantidad de numeros a ingresar: ");
        cantidad = sc.nextInt();
        for (int i=0;i < cantidad;i++) {
            System.out.println("Introduzca un numero: ");
            num = sc.nextInt();
            if (num < 10){
                System.out.println("Es menor que 10");
            } else if (num > 10){
                System.out.println("Es mayor que 10");
            }

        }
    }

    static void ejercicio25(){
        System.out.println("Numeros entre 1y100 que no son multiplos de cien:");
        for (int i=0;i<=100;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

    static void ejercicio26(){
        int num,suma=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero mayor que cero: ");
        num = sc.nextInt();
        while(num <=0){
            System.out.println("Numero no valido. Introduzca un numero mayor que cero: ");
            num = sc.nextInt();
        }

        System.out.println("Numeros entre 1y100 que no son multiplos de 5:");
        for (int i=0;i<=num;i++){
            if (i%5==0){
                suma+=i;
            } else {
                System.out.print(i+" ");
            }
        }
        System.out.println("\nLa suma de los numeros no multiplos de 5 es: "+suma);

    }

    static void ejercicio27(){
        int num,suma=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero mayor que cero: ");
        num = sc.nextInt();
        while(num <=0){
            System.out.println("Numero no valido. Introduzca un numero mayor que cero: ");
            num = sc.nextInt();
        }

        System.out.println("Numeros entre 1y100 que son multiplos de 2 y de 3 a la vez:\n");
        for (int i=1;i<=num;i++){
            if (i%2==0 && i%3==0){
                System.out.print(i+" ");
                suma+=i;
            } else {

            }
        }
        System.out.println("\nLa suma de los numeros que son multiplos de 2 y de 3 a la vez es: "+suma);

    }

    static void ejercicio28(){
        int num=0,total=0,suma=0,max;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una serie de numeros. Si desea terminar ingrese una -999");

        num = sc.nextInt();
        max=num;
        if (num!=-999){
            total+=1;
        }


        while(num!=-999){
            num = sc.nextInt();
            if (num!=-999){
                total+=1;
                if (num%5==0){
                    suma+=num;
                }
                if (num > max){
                    max = num;
                }
            }
        }

        System.out.print(" En total se han introducido "+total+" numeros. La suma de los multiplos de 5 es: "+suma);

    }

    static void ejercicio29(){
        int num,max,min,total=0,cantPares=0,sumaImpares=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num=sc.nextInt();
        min=num;

        System.out.print("Ingrese un mayor que el primero: ");
        num=sc.nextInt();
        while(num<=min){
            System.out.print("Numero no valido. Debe ser mayor que el primero. Ingreselo de nuevo por favor: ");
            num=sc.nextInt();
        }
        max=num;

        for (int i=min;i<=max;i+=7){
            System.out.print(i+" ");
            total+=1;
            if (i%2==0){
                cantPares+=1;
            }else {
                sumaImpares+=i;
            }
        }
        System.out.println("\nTotal de numeros separados 7 unidades: "+total);
        System.out.println("\nCantidad de numeros pares: "+cantPares);
        System.out.println("\nSuma total de los numeros impares "+sumaImpares);

    }


}
