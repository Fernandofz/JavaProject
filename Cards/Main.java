package Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam = sc.nextInt();
        int sum = 0;
        int[] arr = new int[tam];
        int[] arr2 = new int[tam];
        for (int i = 0; i < tam; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int l=0;
        sum = sum / (tam / 2);
        for (int i = 0; i < tam; i++) {
            for (int k = i + 1; k < tam; k++) {
                if (sum == (arr[i] + arr[k])) {

                    arr[i] = Integer.MAX_VALUE;

                    arr[k] = Integer.MAX_VALUE;

                    arr2[l]=(i+1);
                    arr2[l+1]=(k+1);

                    l+=2;
                }
            }
        }
        for (int i = 0; i < arr2.length; i+=2) {
            System.out.print(arr2[i]);
            System.out.print(" ");
            System.out.println(arr2[i+1]);
        }

    }

}