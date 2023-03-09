import java.util.Arrays;
import java.util.Scanner;

public class Encuesta {
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        int arrayEncuesta[]=new int[20];
        int contTotal = 0;
        int contK = 0;
        int contP=0;

        for (int i = 0; contTotal< 10; i++) {

            System.out.println("A que  candidato votarias estas elecciones "+" \n "+ "Para Kristina presione: (1)"+" \n "+ "Para Milei presione: (2)"+ " \n "+ "Para Larreta ingrese: (3)");
            String eleccion = leer.nextLine();
            while (!eleccion.matches("[0-9]*")) {
                System.out.println("Error, ingreso una opcion incorrecta: ");
                System.out.println("Por favor ingrese una opcion valida");
                eleccion= leer.nextLine();
            }
            if (eleccion.equals("1")){
                contTotal++;
                arrayEncuesta[i]= Integer.parseInt(eleccion);
                contK++;
            }
           else if (eleccion.equals("3")){
                contTotal++;
                arrayEncuesta[i]= Integer.parseInt(eleccion);
                contP++;
            }

        }
        System.out.println("A los negros de mierda los votan: "+ contK+ " Personas encuestadas");
        System.out.println("A los globitos amarillos genosidas los votan: " + contP+ " Personas encuestadas");




    }
}
