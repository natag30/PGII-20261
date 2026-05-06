package co.uniquindio.edu;

public class Multiplo {

    public String determinarMultiplo(int num1, int num2){

        String respuesta = "";

        if(num1%num2 == 0||num2%num1 == 0){
            respuesta = "Los números son múltiplos";
        } else{
            respuesta="Los números no son múltiplos";
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Multiplo multiplo = new Multiplo();
        System.out.println(multiplo.determinarMultiplo(30,15));
    }

}
