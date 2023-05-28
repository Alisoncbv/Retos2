//Importar clase Scanner
import java.util.Scanner;

public class Reto3 {
    
    public static void main(String[] args) {
        
        //Declarar varaibles 
        int p;
        int intentos = 0;
        String letra;
        String respuesta;
        //Asignamos a la variable adivino el valor "no" 
        String adivino = "no";


        //Instanciar clase Scanner 
        Scanner leer = new Scanner(System.in);

        //Solicitar la cantidad de letras que tiene la palabra
        System.out.println("¿Cuantas letras tiene tu palabra?");
        //Capturar la cantidad de letras 
        p = leer.nextInt();
        
        //Array 
        String[] palabra = new String[p];

        //llenar array 
        for(int i = 0; i < palabra.length; i++) {
            System.out.println("Escribe la letra " + (i+1) + " de tu palabra");
            palabra[i] = leer.next();
        }

        //Solicitar intentos para adivinar la palabra 
        System.out.println("¿Cuántos intentos tiene?");
        //Capturamos la cantidad de intentos
        intentos = leer.nextInt();

        System.out.println("¡Empecemos!");

        //Ciclo do-while 
        do {
            //Solicitamos la letra
            System.out.println("Escribe una letra");
            //Capturamos la letra 
            letra = leer.next();

            
            //Recorremos el array palabra 
            for(int i = 0; i < palabra.length; i++) {
                //Comparamos que letra este dentro del array 
                if(palabra[i].equals(letra)) {
                    //Asignamos a la variable adivino el valor "si"
                    adivino = "si";
                    break;
                }
            }

            //Comparamos si adivino es igual a "si" 
            if(adivino=="si") {
                System.out.println("La letra está en la palabra");
            } else {
                System.out.println("La letra no está en la palabra");
            }
 
            //Decrementamos intentos 
            intentos--;
          
        //Comparamos que intentos sea mayor a 0   
        } while(intentos > 0);

        //Mostramos los valores de array
        System.out.print("La palabra era: ");
        for(int i=0; i<palabra.length; i++){
            System.out.print("" + palabra[i]); 
        }

        System.out.println(" ¿La adivinaste?");
        //Capturamos respuesta
        respuesta=leer.next();

        //Comparamos que respuesta sea igual a "si"
        if(respuesta=="si"){
            System.out.println("¡Felicidades, ganaste!");
        }else{
            System.out.println("Perdiste");
        }

        System.out.println("Ya no tienes más intentos");
        System.out.println("Gracias por jugar");
    }
}


