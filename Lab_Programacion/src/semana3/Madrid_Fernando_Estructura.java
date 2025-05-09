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
        
        int numeroAleatorio = 0;
        
        char letra;
        
        int cantidadVotantes, cantidadAzul = 0, cantidadRojo = 0, cantidadNegro = 0, cantidadAmarillo = 0, votoSeleccionado, votosValidos = 0, votosInvalidos = 0;
        double porcentajeVotosValidos;
        
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
                    System.out.println("\n==============================");
                    System.out.println("          Votaciones");
                    System.out.println("==============================\n");
                    System.out.print("Ingrese la cantidad de votantes en el pais: ");
                    cantidadVotantes = entrada.nextInt();
                    
                    for(int i=0;i<cantidadVotantes;i++) {
                        System.out.println("\n==============================");
                        System.out.println("           Planillas");
                        System.out.println("==============================\n");
                        System.out.println("1. Azul");
                        System.out.println("2. Rojo");
                        System.out.println("3. Negro");
                        System.out.println("4. Amarillo\n");
                        System.out.print("Ingrese el numero de planilla que votara: ");
                        votoSeleccionado = entrada.nextInt(); 
                        
                        switch(votoSeleccionado){
                            case 1:
                                cantidadAzul++;
                                votosValidos ++;
                                System.out.println("\n** Se agrego un voto a la Planilla Azul **");
                            break;
                            case 2:
                                cantidadRojo++;
                                votosValidos ++;
                                System.out.println("\n** Se agrego un voto a la Planilla Roja **");
                            break;
                            case 3:
                                cantidadNegro++;
                                votosValidos ++;
                                System.out.println("\n** Se agrego un voto a la Planilla Negra **");
                            break;
                            case 4:
                                cantidadAmarillo++;
                                votosValidos ++;
                                System.out.println("\n** Se agrego un voto a la Planilla Amarilla **");
                            break;
                            default:
                                System.out.println("\n** Este voto fue anulado **");
                            break;
                        }
                    }
                    
                    porcentajeVotosValidos = (votosValidos * 100.0) / cantidadVotantes;
                    
                    //Determinar quien es el ganador o si la votación fue fallida
                    System.out.println("\n==============================");
                    System.out.println("           Planillas");
                    System.out.println("==============================\n");
                    if(porcentajeVotosValidos >= 60){
                        if(cantidadAzul > cantidadRojo && cantidadAzul > cantidadNegro && cantidadAzul > cantidadAmarillo) {
                            System.out.println("\n==============================");
                            System.out.println("           Planillas");
                            System.out.println("==============================\n");
                            System.out.println("La planilla ganadora fue: Planilla Azul");  
                        }else if(cantidadRojo > cantidadAzul && cantidadRojo > cantidadNegro && cantidadRojo > cantidadAmarillo) {
                            System.out.println("La planilla ganadora fue: Planilla Roja");  
                        }else if(cantidadNegro > cantidadAzul && cantidadNegro > cantidadRojo && cantidadNegro > cantidadAmarillo) {
                            System.out.println("La planilla ganadora fue: Planilla Negra");  
                        }else{
                            System.out.println("La planilla ganadora fue: Planilla Amarilla");  
                        }  
                    }else{
                        System.out.print("\n** Votacion Fallida **");
                        System.out.println("Solo votos validos mayor al 60%");
                    }
                    
                    votosInvalidos = cantidadVotantes - votosValidos;
                    System.out.println("\n- Votos Validos: "+votosValidos);
                    System.out.println("- Votos Invalidos: "+votosInvalidos);
                    caso4 += 1;
                    break;
                case 5:
                    System.out.println("\n==============================");
                    System.out.println("        Resumen de Usos");
                    System.out.println("==============================\n");
                    System.out.println("- Palabra Alrevez: "+caso1);
                    System.out.println("- Numero Perfecto: "+caso2);
                    System.out.println("- Numeros Primos: "+caso3);
                    System.out.println("- Votaciones: "+caso4);
                    System.out.println("==============================\n");
                    System.out.println("Que tenga lindo dia!");
                    break;
                default:
                    System.out.println("\n** Esta opcion no existe **\n");
            }
        }
        
    }
    
}
