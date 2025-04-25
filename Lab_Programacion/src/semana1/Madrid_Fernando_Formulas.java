package semana1;

import java.util.Scanner;

public class Madrid_Fernando_Formulas {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
    
        float a, b, c, d, e, f, g, h, i, j, k, l, resultado;
        
        System.out.println("Ejercicio a");
        System.out.print("Ingrese numerador 1: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese denominador 1: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese numerador 2: ");
        c = entrada.nextFloat();
        System.out.print("Ingrese denominador 2: ");
        d = entrada.nextFloat();
        resultado = (a/b)+(c/d);
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio b");
        System.out.print("Ingrese numerador 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese denominador 1b: ");
        c = entrada.nextFloat();
        System.out.print("Ingrese numerador 2a: ");
        d = entrada.nextFloat();
        System.out.print("Ingrese numerador 2b: ");
        e = entrada.nextFloat();
        System.out.print("Ingrese numerador 2c: ");
        f = entrada.nextFloat();
        System.out.print("Ingrese denominador 2a: ");
        g = entrada.nextFloat();
        resultado = (a/(b-c)-(d*e*f)/g);
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio c");
        System.out.print("Ingrese numerador 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese numero 1a: ");
        c = entrada.nextFloat();
        resultado = (a/b)+c;
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio d");
        System.out.print("Ingrese numero 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese numerador 1a: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a: ");
        c = entrada.nextFloat();
        resultado = a+(b/c);
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio e");
        System.out.print("Ingrese numerador 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese denominador 1b: ");
        c = entrada.nextFloat();
        System.out.print("Ingrese numerador 2a: ");
        d = entrada.nextFloat();
        System.out.print("Ingrese numerador 2b: ");
        e = entrada.nextFloat();
        System.out.print("Ingrese denominador 2a: ");
        f = entrada.nextFloat();
        System.out.print("Ingrese numerador 3a en denominador 2b: ");
        g = entrada.nextFloat();
        System.out.print("Ingrese numerador 3b en denominador 2b: ");
        h = entrada.nextFloat();
        System.out.print("Ingrese denominador 3a en denominador 2b: ");
        i = entrada.nextFloat();
        resultado = (a*a)/(b-c)+(d-e)/(f-g*h/i);
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio f");
        System.out.print("Ingrese numerador 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese numero 1a: ");
        c = entrada.nextFloat();
        resultado = (a/b)+c;
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio g");
        System.out.print("Ingrese numero 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese numerador 1a: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a: ");
        c = entrada.nextFloat();
        System.out.print("Ingrese denominador 2a: ");
        d = entrada.nextFloat();
        resultado = a+(b/(c-d));
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio h");
        System.out.print("Ingrese numerador 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese numerador 2a: ");
        c = entrada.nextFloat();
        System.out.print("Ingrese denominador 2a: ");
        d = entrada.nextFloat();
        resultado = ((a*a)/(b*b))+((c*c)/(d*d));
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio i");
        System.out.print("Ingrese numerador 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese numerador 3a en numerador 2b: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a en numerador 2b: ");
        c = entrada.nextFloat();
        System.out.print("Ingrese denominador 2a: ");
        d = entrada.nextFloat();
        System.out.print("Ingrese denominador 3a en denominador 2b: ");
        e = entrada.nextFloat();
        System.out.print("Ingrese denominador 3b en denominador 2b: ");
        f = entrada.nextFloat();
        resultado = (a+(b/c))/(d-(e/f));
        System.out.println("Resultado: "+resultado);
        
        System.out.println(" ");
        System.out.println("Ejercicio j");
        System.out.print("Ingrese numerador 1a: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese numerador 1b: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese numerador 1c: ");
        c = entrada.nextFloat();
        System.out.print("Ingrese denominador 1a: ");
        d = entrada.nextFloat();
        System.out.print("Ingrese numerador 2a en denominador 1b: ");
        e = entrada.nextFloat();
        System.out.print("Ingrese numerador 2b en denominador 1b: ");
        f = entrada.nextFloat();
        System.out.print("Ingrese numerador 3b en denominador 1b: ");
        g = entrada.nextFloat();
        System.out.print("Ingrese denominador 2a en denominador 1b: ");
        h = entrada.nextFloat();
        System.out.print("Ingrese numerador 4a en denominador 2b en denominador 1b: ");
        i = entrada.nextFloat();
        System.out.print("Ingrese numerador 4b en denominador 2b en denominador 1b: ");
        j = entrada.nextFloat();
        resultado = (a*b+c)/(d-((e+f*g)/(h+(i/j))));
        System.out.println("Resultado: "+resultado);
        
        
    }
}
