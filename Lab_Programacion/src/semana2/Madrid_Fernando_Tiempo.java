package semana2;

import java.util.Scanner;

public class Madrid_Fernando_Tiempo {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int horas, minutos, residuoHoras, residuoMinutos, nuevosSegundos;
        
        System.out.print("Ingresa un numero de segundos: ");
        int segundos = entrada.nextInt();
        
        horas = segundos/3600;
        residuoHoras = segundos % 3600;
        minutos = residuoHoras/60;
        nuevosSegundos = residuoHoras % 60;
        
        System.out.println(segundos > 0 ? "\n"+horas+" horas "+minutos+" minutos "+nuevosSegundos+" segundos" : "No se permite ese valor");
    }
    
}
