//Importar Scanner 
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
        //Declarar variables 
        int cantidad_n;
        float promedio=0;

        //Instanciar la clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitar la cantidad de notas 
        System.out.println("¿Cuantas notas desea ingresar?");
        //Captutamos la cantidad de notas
        cantidad_n=leer.nextInt();

        //Array 
        int [] materia = new int [cantidad_n];

        System.out.println("Digite las notas");
        //llenar array 
        for(int i=0; i<materia.length; i++){
            System.out.println("Nota " +(i+1));
            materia[i]=leer.nextInt();

            //Calcular el promedio de las notas
            promedio = (promedio + materia[i]/cantidad_n);
        }

        System.out.println("El promedio de sus notas es: "+promedio);

        if(promedio<3.0){
            System.out.println("Reprobaste");
        }else if(promedio >=3.0 && promedio <=4.0){
            System.out.println("Pasaste raspando");
        }else {
            System.out.println("Aprobaste con buenos resultados");
        }
    }
}
