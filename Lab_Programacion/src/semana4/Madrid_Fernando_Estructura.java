package semana4;

import java.util.Scanner;

public class Madrid_Fernando_Estructura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        int opcion = 0;

        String resultado = "";

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
                case 1: // Seccion Cifrado

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
                case 2: // Seccion Filrado
                    System.out.println("\n================================");
                    System.out.println("            Filtrado");
                    System.out.println("================================\n");
                    System.out.print("Ingrese una frase: ");
                    String fraseFiltrado = entrada.next();

                    System.out.print("\nIngrese una longuitud minima: ");
                    int longmin = entrada.nextInt();

                    String palabra = "";
                    fraseFiltrado += " ";
                    System.out.println("\nLas palabras con mayor longuitud a " + longmin + " son: ");

                    String signos = "~`!@#$%^&*()_-+=|}]{[:;?/>.<, ";

                    for (int i = 0; i < fraseFiltrado.length(); i++) {

                        char j = fraseFiltrado.charAt(i);

                        if (signos.indexOf(j) == -1) {
                            palabra += j;
                        } else {
                            if (palabra.length() >= longmin) {
                                System.out.println("- " + palabra);
                            }
                            palabra = "";
                        }
                    }
                    break;
                case 3: // Seccion Codigo Enigma

                    int opcion3 = 0;

                    while (opcion3 != 3) {
                        System.out.println("\n================================");
                        System.out.println("          Codigo Enigma");
                        System.out.println("================================\n");
                        System.out.println("1. Encriptar texto");
                        System.out.println("2. Desencriptar texto");
                        System.out.println("3. Regresar\n");
                        System.out.print("Ingrese el numero de opcion que desea: ");
                        opcion3 = entrada.nextInt();

                        switch (opcion3) {
                            case 1: // Seccion Encriptar
                                System.out.print("\nIngrese el texto original: ");
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
                                resultado = pares + impares;
                                System.out.println("\nLas posiciones pares son: " + pares);
                                System.out.println("Las posiciones impares son: " + impares);
                                System.out.println("Resultado: " + resultado);
                                break;
                            case 2: // Seccion Desencriptar
                                if (!resultado.equalsIgnoreCase("")) {
                                    String palabraEncriptada = resultado;

                                    int mitad = palabraEncriptada.length() / 2 + palabraEncriptada.length() % 2;
                                    String pares2 = palabraEncriptada.substring(0, mitad);
                                    String impares2 = palabraEncriptada.substring(mitad);

                                    String original = "";

                                    for (int indice = 0; indice < palabraEncriptada.length(); indice++) {
                                        if (indice % 2 == 0 && indice / 2 < pares2.length()) {
                                            original += pares2.charAt(indice / 2);
                                        } else if (indice % 2 != 0 && indice / 2 < impares2.length()) {
                                            original += impares2.charAt(indice / 2);
                                        }
                                    }

                                    System.out.println("\nPalabra Encriptada: " + resultado);
                                    System.out.println("Resultado Palabra Desencriptada: " + original);
                                }else{
                                    System.out.println("\n*** Todavia no se ha ingresado una palabra en seccion de encriptacion ***");
                                }
                                break;
                            case 3:
                                System.out.println("\n*** Saliendo de Codigo Enigma ***");
                                break;
                            default:
                                System.out.println("\n*** Esta opcion no existe ***");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nQue tenga lindo dia!\n");
                    break;
                default:
                    System.out.println("\n*** Esta opcion no existe ***");
                    break;
            }
        }
    }
}
