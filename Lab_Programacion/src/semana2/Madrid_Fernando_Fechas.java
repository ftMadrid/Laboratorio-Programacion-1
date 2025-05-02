package semana2;

import java.util.Scanner;

public class Madrid_Fernando_Fechas {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la primer fecha: (Formato: Dia/Mes/Anio)");
        String primeraFecha = entrada.next();
        System.out.println("Ingrese la segunda fecha: (Formato: Dia/Mes/Anio)");
        String segundaFecha = entrada.next();
        
        String primerDias = primeraFecha.substring(0, 2);
        String primerMes = primeraFecha.substring(3, 5);
        String primerAnio = primeraFecha.substring(6,10);
        String segundoDias = segundaFecha.substring(0, 2);
        String segundoMes = segundaFecha.substring(3, 5);
        String segundoAnio = segundaFecha.substring(6,10);
        
        int calculoPrimeraFecha = (360 * Integer.parseInt(primerAnio)) + (30 * Integer.parseInt(primerMes)) + (30 - Integer.parseInt(primerDias));
        int calculoSegundaFecha = (360 * Integer.parseInt(segundoAnio)) + (30 * Integer.parseInt(segundoMes)) + (30 - Integer.parseInt(segundoDias));
        
        int total;
        
        if(calculoPrimeraFecha > calculoSegundaFecha) {
            total = calculoPrimeraFecha - calculoSegundaFecha;
            System.out.println("Diferencia de dias: "+total);
        }else{
            total = calculoSegundaFecha - calculoPrimeraFecha;
            System.out.println("Diferencia de dias: "+total);
        }
        
    }
    
}
