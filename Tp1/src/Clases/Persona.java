package Clases;


import java.util.Random;

public class Persona {

    String name="";
    int age=0;
    int id=0;
    char gender=' ';
    int weight=0;
    int height=0;

    Random  rnd = new Random();

public Persona(){
    this.name= "";
    this.age=0;
    this.id=rnd.nextInt();
    this.gender=' ';
    this.weight=0;
    this.height=0;
}
    public Persona(String name, int age, char gender){
        this.name= name;
        this.age=age;
        this.id=rnd.nextInt();
        this.gender=gender;
        this.weight=0;
        this.height=0;
    }

    public Persona(String name, int age, char gender, int weight, int height){
        this.name= name;
        this.age=age;
        this.id=rnd.nextInt();
        this.gender=comprobarSexo(gender);
        this.weight=weight;
        this.height=height;
    }

    public int peso(){
        return this.weight;
    }
    public int altura(){
        return this.height;
    }

    public float calcularimc(){
        float imc;
        imc = (float)this.height/((float)this.weight*(float)this.weight);
        return imc;
    }

    public boolean isAdult(){
        if (this.age>17){
            return true;
        }
        else{
            return false;
        }


    }

    private char comprobarSexo(char gender){
        if ((gender=='F') || (gender=='H')){
            return gender;
        }
        else {
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}' + "id: " + id;
    }

}
