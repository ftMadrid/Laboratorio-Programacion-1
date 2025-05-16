package semana4;

import java.util.Scanner;

public class Madrid_Fernando_Estructura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n================================");
            System.out.println("          Estructuras");
            System.out.println("================================\n");
            System.out.println("1. Cifrado");
            System.out.println("2. Filtrar");
            System.out.println("3. Codigo Enigma");
            System.out.println("4. Salir del Programa\n");
            System.out.print("Ingrese el numero de opcion que desea: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: // Cifrado

                    String abcMinus = "abcdefghijklmnopqrstuvwxyz";
                    String abcMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    String fraseEncriptada = "";
                    int nuevoIndice = 0;
                    int indiceAbecedario = 0;

                    System.out.println("\n================================");
                    System.out.println("            Cifrado");
                    System.out.println("================================\n");

                    System.out.print("Ingrese una frase: ");
                    String fraseCifrado = entrada.next();
                    System.out.print("\nIngrese la cantidad a desplazar: ");
                    int desplazamientoCifrado = entrada.nextInt();

                    for (int i = 0; i < fraseCifrado.length(); i++) {
                        char letra = fraseCifrado.charAt(i);

                        if (Character.isLowerCase(letra)) {
                            indiceAbecedario = abcMinus.indexOf(letra);
                            nuevoIndice = (indiceAbecedario + desplazamientoCifrado) % 26;
                            fraseEncriptada += abcMinus.charAt(nuevoIndice);
                        } else if (Character.isUpperCase(letra)) {
                            indiceAbecedario = abcMayus.indexOf(letra);
                            nuevoIndice = (indiceAbecedario + desplazamientoCifrado) % 26;
                            fraseEncriptada += abcMayus.charAt(nuevoIndice);
                        } else {
                            fraseEncriptada += letra;
                        }
                    }

                    System.out.println("\nFrase Cifrada: " + fraseEncriptada);
                    break;
                case 2:
                    System.out.println("\n================================");
                    System.out.println("            Filtrado");
                    System.out.println("================================\n");
                    System.out.print("Ingrese una frase: ");
                    String fraseFiltrado = entrada.next();

                    System.out.print("Ingrese una longuitud minima: ");
                    int longmin = entrada.nextInt();

                    String palabra = "";
                    fraseFiltrado += " ";
                    System.out.println("La palabras con mayor longuitud a " + longmin + " son: ");

                    String signos = "~`!@#$%^&*()_-+=|}]{[:;?/>.<, ";

                    for (int i = 0; i < fraseFiltrado.length(); i++) {

                        char j = fraseFiltrado.charAt(i);

                        if (signos.indexOf(j) == -1) {
                            palabra += j;
                        } else {
                            if (palabra.length() >= longmin) {
                                System.out.println(palabra);
                            }
                            palabra = "";
                        }
                    }
                    break;
                case 3:
                    System.out.println("---- MENÚ ----");
                    System.out.println(" Ingrese una de las siguientes opciones: ");
                    System.out.println(" (1) Encriptar texto ");
                    System.out.println(" (2) Desencriptar texto ");
                    System.out.println(" (3) Regresar ");
                    int opcion3 = entrada.nextInt();

                    switch (opcion3) {
                        case 1: {
                            System.out.println("Ingrese el texto original: ");
                            String textoOriginal = entrada.next();
                            String pares = "";
                            String impares = "";
                            for (int indice = 0; indice < textoOriginal.length(); indice++) {
                                char letra = textoOriginal.charAt(indice);
                                if (indice % 2 == 0) {
                                    pares = pares + letra;
                                } else {
                                    impares = impares + letra;
                                }
                            }
                            String resultado = pares + impares;
                            System.out.println("Las posiciones pares son: " + pares);
                            System.out.println("Las posiciones impares son: " + impares);
                            System.out.println("Resultado: " + resultado);
                        }
                        case 2: {
                            System.out.println("Ingrese el texto encriptado: ");
                            String textoEncriptado = entrada.next();
                            String pares = " ";
                            String impares = " ";
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nQue tenga lindo dia!\n");
                    break;
                default:
                    System.out.println("\n*** Esta opcion no existe ***\n");
                    break;
            }
        }
    }
}
