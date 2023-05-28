//Importar clase Scanner 
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        
        //Declarar variables 
        int nadador;

        //instanciar la clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitar cantidad de nadadores 
        System.out.println("¿Cuantos nadadores estuvieron en compentencia?");
        //Capturamos cantidad de nadadores
        nadador=leer.nextInt();

        //Crear array
        String [] nombre_n = new String [nadador];
        int [] tiempo = new int [nadador];
        
        //llenar array 
        for(int i=0; i<nadador; i++){
            System.out.println("Ingrese el nombre del nadador "+(i+1));
            nombre_n[i]=leer.next();

            System.out.println("Ingrese el tiempo del nadador "+(i+1));
            tiempo[i]=leer.nextInt();
        }

        //Mostramos el nombre y tiempo de los nadadores 
        System.out.println("Nombre y tiempo de los nadadores");
        for(int i=0; i<nadador; i++){
            System.out.print(nombre_n[i] + " ");
            System.out.println(tiempo[i] + " minutos");
        }
        
        //Recorrer array
        for(int i = 0; i < nadador - 1; i++){
            for(int e = 0; e < nadador - i - 1; e++){
                //Comparar los tiempos de los nadadores
                if(tiempo[e] < tiempo[e+1]){
                    //Asignarle a la variable num el valor de array tiempo en la posición e
                    int num = tiempo[e];
                    //El array tiempo en la posición e va ser igual a al array tiempo en la posición e+1
                    tiempo[e] = tiempo[e + 1];
                    //El array tiempo en la posición e+1 va ser igual a la variable num
                    tiempo[e + 1] = num;
                }
            }
        }
        
        //Mostramos el tiempo del ganador 
        System.out.println("El tiempo del ganador es" + tiempo[0]);

        }
        
    }



