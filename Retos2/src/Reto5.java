//Importar clase Scanner
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) { 

        //Declarar variables 
        int posicion_f1;
        int posicion_c1;
        int posicion_f2;
        int posicion_c2;
        String respuesta;

        //Instanciar clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Declaramos la matriz conce
        int conce [][] = new int [4][4];

        //Llenar array 
        for(int f=0; f<4; f++){
            for(int c=0; c<4; c++){
                System.out.println("Figura");
                conce[f][c]=leer.nextInt();
            }
        }

        //Mostrar array
        System.out.println("¡Jugaremos concentrate!");
        System.out.println("Observa detenidamente las figuras y memoriza las que puedas");
        for(int f=0; f<4; f++){
            System.out.println(" ");
            for(int c=0; c<4; c++){
                System.out.print(conce[f][c] + " ");
                
            }
        }

        System.out.println(" ");

        do{
            //Solicitamos y capturamos las posiciones 
            System.out.println("¿En que posición cree que esta la primera figura?");
            posicion_f1=leer.nextInt();

            System.out.println("¿En que posición cree que esta la primera figura?");
            posicion_c1=leer.nextInt();

            System.out.println("¿En que posición cree que esta la segunda figura?");
            posicion_f2=leer.nextInt();

            System.out.println("¿En que posición cree que esta la segunda figura?");
            posicion_c2=leer.nextInt();
            
            //Comparamos si las pocisiones coinciden 
            if(conce[posicion_f1][posicion_c1] == conce[posicion_f2][posicion_c2]){
                System.out.println("Las posiciones coniciden, ¡Ganó!");

                }else{
                    System.out.println("Las posiciones no coinciden, ¡Perdió!");
                }
            
        

            //Preguntamos si quiere seguir jugando 
            System.out.println("¿Quieres seguir jugando?");
            respuesta=leer.next();

    //Comparamos si la respuesta es "si"
    }while(respuesta.equals("si"));

    System.out.println("Gracias por jugar");
 }
}


