package semana5;

import java.util.Scanner;
import java.util.Random;

public class Madrid_Fernando_Exam1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

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

                    int filas = 0,
                     numero = 1,
                     sumaImpares = 0;

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

                    String frase = "",
                     cifrada = "",
                     descifrada = "";
                    char letra = ' ';

                    System.out.println("\n================================");
                    System.out.println("             Clave");
                    System.out.println("================================\n");
                    System.out.print("Ingrese una frase o palabra: ");
                    frase = entrada.next();

                    for (int i = 0; i < frase.length(); i++) {
                        letra = frase.charAt(i);

                        if (letra >= 'a' && letra <= 'z') {
                            cifrada += (char) ('z' - (letra - 'a'));
                        } else if (letra >= 'A' && letra <= 'Z') {
                            cifrada += (char) ('Z' - (letra - 'A'));
                        } else {
                            cifrada += letra;
                        }

                    }

                    for (int j = 0; j < cifrada.length(); j++) {
                        letra = cifrada.charAt(j);

                        if (letra >= 'a' && letra <= 'z') {
                            descifrada += (char) ('z' - (letra - 'a'));
                        } else if (letra >= 'A' && letra <= 'Z') {
                            descifrada += (char) ('Z' - (letra - 'A'));
                        } else {
                            descifrada += letra;
                        }

                    }

                    System.out.println("\nFrase Cifrada: " + cifrada);
                    System.out.println("Frase Descifrada: " + descifrada);
                    break;
                case 3:

                    int objetoConsola = 0;
                    boolean salirJuego = false;
                    String objeto = "",
                     respuesta = "";

                    System.out.println("\n===================================");
                    System.out.println("  Juego de Pieda, Papel y Tijeras");
                    System.out.println("===================================\n");
                    System.out.println("Bienvenido al juego!");

                    while (!salirJuego) {
                        while (true) {
                            System.out.println("\n| Piedra");
                            System.out.println("| Papel");
                            System.out.println("| Tijeras\n");
                            System.out.print("Elige un objeto: ");
                            objeto = entrada.next();

                            objetoConsola = random.nextInt(1, 4);

                            if (objeto.equalsIgnoreCase("Piedra") || objeto.equalsIgnoreCase("Papel") || objeto.equalsIgnoreCase("Tijeras")) {
                                switch (objetoConsola) {
                                    case 1:
                                        if (objeto.equalsIgnoreCase("Piedra")) {
                                            System.out.println("\n*** Tenemos un Empate ***\n");
                                            System.out.println("| Objeto del Usuario: Piedra");
                                        } else if (objeto.equalsIgnoreCase("Papel")) {
                                            System.out.println("\n*** Ganador: Usuario ***\n");
                                            System.out.println("| Objeto del Usuario: Papel");
                                        } else if (objeto.equalsIgnoreCase("Tijeras")) {
                                            System.out.println("\n*** Ganador: Computadora ***\n");
                                            System.out.println("| Objeto del Usuario: Tijeras");
                                        }
                                        System.out.println("| Objeto de la Computadora: Piedra");
                                        break;
                                    case 2:
                                        if (objeto.equalsIgnoreCase("Piedra")) {
                                            System.out.println("\n*** Ganador: Computadora ***\n");
                                            System.out.println("| Objeto del Usuario: Piedra");
                                        } else if (objeto.equalsIgnoreCase("Papel")) {
                                            System.out.println("\n*** Tenemos un Empate ***\n");
                                            System.out.println("| Objeto del Usuario: Papel");
                                        } else if (objeto.equalsIgnoreCase("Tijeras")) {
                                            System.out.println("\n*** Ganador: Usuario ***\n");
                                            System.out.println("| Objeto del Usuario: Tijeras");
                                        }
                                        System.out.println("| Objeto de la Computadora: Papel");
                                        break;
                                    case 3:
                                        if (objeto.equalsIgnoreCase("Piedra")) {
                                            System.out.println("\n*** Ganador: Usuario ***\n");
                                            System.out.println("| Objeto del Usuario: Piedra");
                                        } else if (objeto.equalsIgnoreCase("Papel")) {
                                            System.out.println("\n*** Ganador: Computadora ***\n");
                                            System.out.println("| Objeto del Usuario: Papel");
                                        } else if (objeto.equalsIgnoreCase("Tijeras")) {
                                            System.out.println("\n*** Tenemos un Empate ***\n");
                                            System.out.println("| Objeto del Usuario: Tijeras");
                                        }
                                        System.out.println("| Objeto de la Computadora: Tijeras");
                                        break;
                                }

                                while (true) {
                                    System.out.print("\nDesea jugar nuevamente? (Si/No): ");
                                    respuesta = entrada.next();

                                    if (respuesta.equalsIgnoreCase("Si")) {
                                        salirJuego = false;
                                        break;
                                    } else if (respuesta.equalsIgnoreCase("No")) {
                                        salirJuego = true;
                                        break;
                                    } else {
                                        System.out.println("\n*** ERROR: Ingrese Si o No ***");
                                    }
                                }
                                break;
                            } else {
                                System.out.println("\n*** Objeto Invalido ***");
                            }
                        }
                    }
                    break;
                case 4:

                    boolean adivino = false;
                    int intentos = 1,
                     numeroIngresado = 0,
                     numeroRandom = random.nextInt(1, 101);

                    System.out.println("\n================================");
                    System.out.println("             Adivinar");
                    System.out.println("================================\n");
                    System.out.println("Numero Aleatorio: " + numeroRandom);

                    while (intentos <= 10) {

                        System.out.print("\nIngrese un numero: ");
                        numeroIngresado = entrada.nextInt();

                        if (numeroRandom > numeroIngresado) {
                            System.out.println("\nEl numero a adivinar es mayor que " + numeroIngresado);
                            System.out.println("Intentos Restantes: " + (10 - intentos));
                        } else if (numeroRandom < numeroIngresado) {
                            System.out.println("\nEl numero a adivinar es menor que " + numeroIngresado);
                            System.out.println("Intentos Restantes: " + (10 - intentos));
                        } else {
                            System.out.println("\n*** Usted adivino el numero ***\n");
                            System.out.println("| Numero Generado: " + numeroRandom);
                            System.out.println("| Adivinado en " + intentos + " intentos.");
                            adivino = true;
                            break;
                        }
                        intentos++;
                    }
                    if (!adivino) {
                        System.out.println("\n*** Se acabaron los intentos ***\n");
                        System.out.println("| El numero era " + numeroRandom + ".");
                    }
                    break;
                case 5:
                    System.out.println("\nQue tenga lindo dia!\n");
                    salir = true;
                    break;
                default:
                    System.out.println("\n*** Opcion Invalida ***");
                    break;
            }

        }

    }

}
