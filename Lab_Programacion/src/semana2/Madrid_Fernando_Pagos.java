package semana2;

import java.util.Scanner;

public class Madrid_Fernando_Pagos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        int horasExtra, horasNormales = 0;
        double pagoExtra = 0;
        
        System.out.print("Ingrese el codigo del empleado: ");
        int codigo = entrada.nextInt();
        System.out.print("\nIngres el primer nombre del empleado: ");
        String nombre = entrada.next();
        System.out.print("\nIngrese el primer apellido del empleado: ");
        String apellido = entrada.next();
        System.out.print("\nIngrese las horas trabajadas: ");
        int horas = entrada.nextInt();
        System.out.print("\nIngrese el numero de categoria: ");
        int categoria = entrada.nextInt();
        
        System.out.println("Información de Categorías");
        System.out.println("Categoría 1 - $40 por hora extra");
        System.out.println("Categoría 2 - $50 por hora extra");
        System.out.println("Categoría 3 - $85 por hora extra.");
        System.out.println("Categoría 4 - $0");
        
        if(horas >= 40){
            horasExtra = horas - 40;
            horasNormales = 40;
            if(horasExtra > 15){
                horasExtra = 15;
            }
        }else{
            horasExtra = 0;
        }
        
        switch(categoria) {
            case 1:
                pagoExtra = horasExtra*40;
                break;
            case 2:
                pagoExtra = horasExtra*50;
                break;
            case 3:
                pagoExtra = horasExtra*85;
                break;
            case 4:
                pagoExtra = 0;
                break;
            default:
                System.out.println("No existe esta categoria.");
                break;
        } 
        
        double calculoHora = horasNormales*35.99;
        double totalExtra = calculoHora+pagoExtra;
        
        System.out.println("\n**** Informacion Final ****");
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Horas Trabajadas: "+horas);
        System.out.println("Pago por hora: $35.99");
        System.out.println("Horas Extra Trabajadas: "+horasExtra);
        System.out.println("Categoria: "+categoria);
        System.out.println(String.format("Pago por horas extra: $%.2f",pagoExtra));
        System.out.println(String.format("Total: $%.2f",totalExtra));
        
    }
}
