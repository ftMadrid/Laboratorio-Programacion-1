package semana2;

import java.util.Scanner;

public class Madrid_Fernando_Clases {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la fecha de este dia: (Formato: Dia de Semana, Dia/Mes)");
        System.out.println("Ejemplo: Lunes, 12/04");
        String fecha = entrada.next();
        
        String diaSemana = fecha.substring(0, fecha.indexOf(","));
        String dia = fecha.substring(fecha.indexOf(" ") + 1, fecha.indexOf("/"));
        String mes = fecha.substring(fecha.indexOf("/") + 1);
        String respuestaExamen;
        int alumnosAprobados, alumnosReprobados, asistenciaClase, nuevoCiclo;
        double totalAlumnos, porcentajeAprobados, precioAlumno, totalPrecio;
        
        if(Integer.parseInt(dia) <= 31 && Integer.parseInt(dia) > 0 && Integer.parseInt(mes) <= 12 && Integer.parseInt(mes) > 0){
            if(diaSemana.equalsIgnoreCase("Lunes") || diaSemana.equalsIgnoreCase("Martes") || diaSemana.equalsIgnoreCase("Miercoles")){ // Nivel Inicial, Intermedio y Avanzado
                System.out.println("Fecha: "+diaSemana+" del "+dia+"/"+mes);
                System.out.println("Se tomo examen este dia? Si/No");
                respuestaExamen = entrada.next();
                
                if(respuestaExamen.equalsIgnoreCase("Si")){
                    System.out.print("Ingrese el numero de alumnos aprobados: ");
                    alumnosAprobados = entrada.nextInt();
                    System.out.print("\nIngrese el numero de alumnos reprobados: ");
                    alumnosReprobados = entrada.nextInt();
                    
                    totalAlumnos = alumnosAprobados + alumnosReprobados;
                    porcentajeAprobados = (alumnosAprobados*100.0)/totalAlumnos;
                    System.out.println("\nPorcentaje de Alumnos Aprobados: "+porcentajeAprobados+"%");
                }else{
                    System.out.println("Adios."); 
                }
                
            }else if(diaSemana.equalsIgnoreCase("Jueves")){ // Practica Hablada
                System.out.println("Fecha: "+diaSemana+" del "+dia+"/"+mes);
                System.out.print("Ingrese el porcentaje de asistencia en clase: ");
                asistenciaClase = entrada.nextInt();
                if(asistenciaClase > 50) {
                    System.out.println("\nAsistio la mayoria");
                }else{
                    System.out.println("\nNo asistio la mayoria");
                }
            }else if(diaSemana.equalsIgnoreCase("Viernes")){ // Ingles para viajeros
                if(Integer.parseInt(mes) == 1 && Integer.parseInt(dia) == 1 || Integer.parseInt(mes) == 7) {
                    System.out.println("Comienza el nuevo ciclo");
                    System.out.print("Ingrese la cantidad de alumnos de nuevo ciclo: ");
                    nuevoCiclo = entrada.nextInt();
                    System.out.print("\nIngrese el precio por cada alumno: L.");
                    precioAlumno = entrada.nextDouble();
                    totalPrecio = nuevoCiclo*precioAlumno;
                    System.out.println("Total: L."+totalPrecio);
                }else{
                    System.out.println("No corresponde!");
                }
            }else{
                System.out.println("Este dia no se dicto ninguna clase.");
            }
        }else{
            System.out.println("Esta fecha no existe.");
            System.out.println("Fecha Ingresada: "+dia+"/"+mes);   
        }
    }
}
