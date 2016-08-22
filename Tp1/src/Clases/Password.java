package Clases;

public class Password {
    int longitud=8;
    String contraseña;

public Password(){
    this.longitud=8;
    this.contraseña="12345678";

}
    public Password( int longitud, String contraseña){
        this.longitud=longitud;
        this.contraseña=contraseña;

    }
public boolean isStrong(){
    int May=0, Min=0, digi=0;

    for(int x=0;x<longitud;x++){
        if (Character.isUpperCase(contraseña.charAt(x))){
        May++;

        }
    }
    if (May>2){
        return true;

    }
    else
        return false;

}
}
