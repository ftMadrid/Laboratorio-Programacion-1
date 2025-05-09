package semana3;

import java.util.Scanner;
import java.util.Random;

public class Madrid_Fernando_Estructura {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        int opcion = 0, cantidadPalabras, numeroPalabra = 0, cantidadMayor = 0;
        String palabra = "", palabraAlrevez = "", palabraMayor = "", palabraMayorAlrevez = "";
        
        int numeroBase = 0, calculoNumeroBase = 0, calculoResiduoBase = 0, resultadoNumeroBase = 0;
        
        int numeroAleatorio = 0, cantidadDivisores = 0, ultimaComa = 0;
        
        char letra;
        
        int caso1 = 0, caso2 = 0, caso3= 0, caso4= 0;
        
        while(opcion != 5){
            
            System.out.println("\n==============================");
            System.out.println("   Estructuras Repetitivas");
            System.out.println("==============================\n");
            System.out.println("1. Palabra Alreves");
            System.out.println("2. Numero Perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir\n");
            System.out.print("Escoge una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("\n==============================");
                    System.out.println("        Palabra Alrevez");
                    System.out.println("==============================\n");
                    System.out.print("Ingresar una cantidad de palabras: ");
                    cantidadPalabras = entrada.nextInt();
                    
                    while(numeroPalabra < cantidadPalabras){

                        palabraAlrevez = "";
                        numeroPalabra++;
                        System.out.print("\nPalabra #"+numeroPalabra+": ");
                        palabra = entrada.next();

                        for(int i = 0; i<palabra.length(); i++){
                            letra = palabra.charAt(i);
                            palabraAlrevez = letra + palabraAlrevez;
                        }
                        System.out.println("Alrevez: "+palabraAlrevez);
                        if(palabra.length() > cantidadMayor){
                            palabraMayor = palabra;
                            cantidadMayor = palabra.length();
                            palabraMayorAlrevez = palabraAlrevez;
                            if(palabraMayor.length() == palabra.length()){
                                palabraMayor += ", "+palabra;
                            }
                        }
                    }
                    System.out.println("\nLa palabra mayor es "+palabraMayor+" con "+cantidadMayor+" letras");
                    if(palabraMayor.equalsIgnoreCase(palabraMayorAlrevez)){
                        System.out.println(palabraMayor+" si es un palindromo");
                    }else{
                        System.out.println(palabraMayor+" no es un palindromo");
                    }
                    caso1 += 1;
                    break;
                case 2:
                    System.out.println("\n==============================");
                    System.out.println("        Numero Perfecto");
                    System.out.println("==============================\n");
                    System.out.print("Ingresar un numero entero: ");
                    numeroBase = entrada.nextInt();
                    
                    calculoNumeroBase = numeroBase / 2;
                    
                    for(int i = 1;i<=calculoNumeroBase;i++){
                        calculoResiduoBase = numeroBase % i;
                        
                        if(calculoResiduoBase == 0){
                            resultadoNumeroBase = resultadoNumeroBase + i;
                        }
                    }
                    if(resultadoNumeroBase == numeroBase){
                        System.out.println(numeroBase+" si es un numero perfecto");
                    }else{
                        System.out.println(numeroBase+" no es un numero perfecto");
                    }
                    caso2 += 1;
                    break;
                case 3:
                    boolean esPrimo = true;
                    numeroAleatorio = random.nextInt(1, 100);
                    System.out.println("\n==============================");
                    System.out.println("        Numeros Impares");
                    System.out.println("==============================\n");
                    System.out.println("Numero Generado: " + numeroAleatorio);

                    if (numeroAleatorio <= 1) {
                        esPrimo = false;
                    } else {
                        for(int i = 2; i <= numeroAleatorio/2; i++) {
                            if (numeroAleatorio % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }

                    if (esPrimo) {
                        System.out.println("\n"+numeroAleatorio+" si es un numero primo.");
                        System.out.print("Divisores de "+numeroAleatorio+" son: ");
                        for (int i = 1; i <= numeroAleatorio; i++) {
                            if (numeroAleatorio % i == 0) {
                                System.out.print(i+", ");
                            }
                        }
                    } else {
                        System.out.print("\n"+numeroAleatorio+" no es un numero primo.");
                    }
                    System.out.println("");
                    caso3 += 1;
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n** Esta opcion no existe **\n");
            }
        }
        
    }
    
}
