package semana5;

import java.util.Scanner;

public class Madrid_Fernando_Exam1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        boolean salir = false;
        int opcion = 0;

        while (!salir) {

            System.out.println("\n====================================");
            System.out.println("  Examen Laboratorio Programacion");
            System.out.println("====================================\n");
            System.out.println("1. Piramide");
            System.out.println("2. Clave");
            System.out.println("3. Juego de Pieda, Papel y Tijeras");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir del Programa\n");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    int filas = 0, numero = 1, sumaImpares = 0;

                    System.out.println("\n===================================");
                    System.out.println("            Piramide");
                    System.out.println("===================================\n");
                    System.out.print("Cantidad de fila de la piramide: ");
                    filas = entrada.nextInt();

                    System.out.println("\nPiramide: \n");
                    for (int i = 1; i <= filas; i++) {
                        sumaImpares = 0;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(numero + " ");
                            sumaImpares += numero;
                            numero += 2;
                        }
                        System.out.println(" = " + sumaImpares);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("\nQue tenga lindo dia!\n");
                    salir = true;
                    break;
                default:
                    break;
            }

        }

    }

}
