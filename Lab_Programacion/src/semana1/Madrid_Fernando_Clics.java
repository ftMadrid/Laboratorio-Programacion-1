package semana1;

import java.util.Scanner;

public class Madrid_Fernando_Clics {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double viente_clics = 20*0.80;
        double sesenta_clics = 60*0.30;
        double cien_clics = 100*0.25;
        
        double total = viente_clics+sesenta_clics+cien_clics;
        double costo_promedio = total/180;
        double isv = total*0.16;
        double total_iva = total+isv;
        
        System.out.println("Total: "+total);
        System.out.println(String.format("Costo promedio: %.2f", costo_promedio));
        System.out.println("ISV: "+isv);
        System.out.println("Total IVA: "+total_iva);  
        
    }
}
