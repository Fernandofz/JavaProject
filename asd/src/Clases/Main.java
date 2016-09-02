package Clases;

/**
 * Created by Fer on 26/08/2016.
 */
public class Main {
    public static void main(String ... args){
        int aux=0,max=0,nose=0;
        int[] arr = new int[255];
        for (int i=0;i<255;i++){
            arr[i]=(int)(Math.random()*100);
        }
        for (int i=0;i<254;i++){
            if (arr[i]<arr[i+1]){
                max++;
            } else{
                    if (max>aux){
                        aux=max;
                    }
                    max=0;
            }

        }
        System.out.println(aux);


    }


}
