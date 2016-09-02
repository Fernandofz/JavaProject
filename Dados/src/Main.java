/**
 * Created by Fer on 31/08/2016.
 */
public class Main {
    public static void main(String ... args){

        int[] dados = new int[2];
        int lados=6;
        for (int i=0;i<dados.length;i++){
            dados[i]=1;
        }
        int mostrador=dados.length;
        int posibilidades=1;
        int cont=0;
        int sum7=0;
        while (Math.pow(lados,dados.length)>=mostrador){
            int sum=0;
            cont++;
            for (int i=0;i<dados.length;i++){
                sum+=dados[i];
                //Mostrar cada combinacion de dados
            }
            //Aca trabajar las posibilidades
            if (sum==7){
                sum7++;
            }
            System.out.println("Posibilidad "+posibilidades+" Resultado: "+ sum7+ " / "+cont);
            dados[0]++;
            for (int i=0;i<dados.length-1;i++){
                if (dados[i] == lados+1){
                            dados[i+1]++;
                            dados[i]=1;

                }else{ break;}
            }


            posibilidades++;
            mostrador++;
            sum=0;
        }


    }
}
