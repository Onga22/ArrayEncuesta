import java.util.Scanner;

public class Encuesta {
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        int[] arrayEncuesta =new int[10];
        int contTotal = 0;
        int contK = 0;
        int contP=0;

        for (int i = 0; contTotal< 10; i++) {

            System.out.println("A que  candidato votarias estas elecciones: "+" \n "+ "Para Kristina presione: (1)"+" \n "+ "Para Milei presione: (2)"+ " \n "+ "Para Larreta ingrese: (3)");
            String eleccion = leer.nextLine();

             while (!eleccion.matches("[123]{1}")) {
                System.out.println("Error, ingreso una opcion incorrecta: ");
                System.out.println("Por favor ingrese una opcion valida");
                 System.out.println(" ");
                eleccion= leer.nextLine();
            }  while (eleccion.matches("[2]"))  {
                System.out.println("Usted voto la dolarizacion. Gracias");
                System.out.println(" ");
                 System.out.println("A que  candidato votarias estas elecciones "+" \n "+ "Para Kristina presione: (1)"+" \n "+ "Para Milei presione: (2)"+ " \n "+ "Para Larreta ingrese: (3)");
                eleccion= leer.nextLine();
            }

            if (eleccion.equals("1")){
                contTotal++;
                arrayEncuesta[i]= Integer.parseInt(eleccion);
                contK++;
                System.out.println("Usted voto cagar en un balde. Gracias");
                System.out.println(" ");
            }

            if (eleccion.equals("3")){
                contTotal++;
                arrayEncuesta[i]= Integer.parseInt(eleccion);
                contP++;
                System.out.println("Usted voto suba indiscriminada de impuestos. Gracias");
                System.out.println(" ");
            }

        }
        System.out.println("El array se completo de la siguiente manera: ");
        for (int i = 0; i < arrayEncuesta.length; i++) {
            System.out.print(arrayEncuesta[i] + "-" );
        }
        System.out.println(" ");
        System.out.println("Resultado de la ultima encuesta: ");
        System.out.println("A los negros de mierda los votan: "+ contK+ " Personas ");
        System.out.println("A los globitos amarillos genocidas los votan: " + contP+ " Personas ");




    }
}
