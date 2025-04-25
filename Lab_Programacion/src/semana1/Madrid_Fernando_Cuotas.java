package semana1;

import java.util.Scanner;

public class Madrid_Fernando_Cuotas {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        double valor_prestamo, cuota_mensual, intereses, interes_mensual, comision, seguro, total_cuota_mensual, total;
        int meses, comision_cuotas, seguro_mensual;
        
        System.out.print("Ingrese el valor del prestamo: ");
        valor_prestamo = entrada.nextDouble();
        
        System.out.print("\nIngrese los meses a pagar el prestamo: ");
        meses = entrada.nextInt();
        
        System.out.print("\nIngrese el interes mensual: ");
        intereses = entrada.nextInt();
        
        System.out.print("\nIngrese el porcentaje de comision por cuotas: ");
        comision_cuotas = entrada.nextInt();
        
        System.out.print("\nIngrese el porcentaje mensual del seguro: ");
        seguro_mensual = entrada.nextInt();
        
        cuota_mensual = valor_prestamo/meses;
        interes_mensual = cuota_mensual*(intereses/100);
        comision = cuota_mensual*(comision_cuotas/100);
        seguro = cuota_mensual*(seguro_mensual/100);
        total_cuota_mensual = cuota_mensual+interes_mensual+comision+seguro;
        total = total_cuota_mensual*meses;
        
        System.out.println("\n**** CUOTAS MENSUALES ******");
        System.out.println("Cuota de Pago Mensual: HNL "+cuota_mensual);
        System.out.println("Total a Pagar: HNL "+total);
        
        
    }
    
}
