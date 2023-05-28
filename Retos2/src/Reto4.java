//Importar Sacnner 
import java.util.Scanner;


public class Reto4 {
    
    public static void main(String[] args) {
        
        //Declarar matriz 
        String maquina [][] = new String [4][4];

        //Instanciar clase Scanner
        Scanner leer=new Scanner(System.in);

        //Llenar matriz 
        for(int f=0; f<4; f++){
            for(int c=0; c<4; c++){
                System.out.println("Ingrese el nombre y precio del producto en la posición "+f+c);
                maquina [f][c] = leer.next();
            }
        }

        //Mostrar catálogo 
        System.out.println("El catálogo de los productos es:");
        for(int f=0; f<4; f++){
            System.out.println(" ");
            for(int c=0; c<4; c++){
                System.out.print(f + "" + c + " " + maquina[f][c] + " ");
                
                
            }
        }

    }
}
