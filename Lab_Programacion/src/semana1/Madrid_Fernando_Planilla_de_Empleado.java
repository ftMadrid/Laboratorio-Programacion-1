package semana1;

import java.util.Scanner;

public class Madrid_Fernando_Planilla_de_Empleado {
    
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
               
        String nombre_empleado;
        int horas_trabajadas_mensual; 
        double salario_semanal=0;
                
        System.out.print("Ingrese el nombre del empleado: ");
        nombre_empleado = entrada.next();
        
        System.out.print("\nIngrese las horas trabajadas mensualmente: ");
        horas_trabajadas_mensual = entrada.nextInt();
        
        System.out.print("\nIngrese la tarifa por hora: ");
        double tarifa_hora = entrada.nextDouble();
        
        salario_semanal = (horas_trabajadas_mensual*tarifa_hora)/4;
        
        System.out.println("\n----- Boleta del Empleado ------");
        System.out.println("Nombre del Empleado: "+nombre_empleado);
        System.out.println("Hora de Trabajo Mensual: "+horas_trabajadas_mensual+" horas");
        System.out.println("Tarifa por Hora: Lps."+tarifa_hora);
        System.out.println("Salario del Empleado Semanal: Lps."+salario_semanal);
        
    }
}
