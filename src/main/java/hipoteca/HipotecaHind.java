package hipoteca;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class HipotecaHind {

    public static void main(String[] args) {

        //declaracion y initialisation variables
        int edad, anosDelvolverHipoteca;
        double salarioBrutoMensual, totalHipoteca, sueldoBrutoAnual, contidadresulta;
        String opcion;
        //constantes
        double FACTORMULTIPLICATIVO = 5.85;

        //scanner 
        Scanner sc = new Scanner(System.in);
    do{
        
        do {
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("Realizar.Hacer el programa");
            System.out.println("Salir.Finalizar");
            //eliga opcion del menu
            System.out.println("Elija una opción: ");
            opcion = sc.next();
          
     } while(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no"));
                
            
            //pedir Informaciones
            switch (opcion) {
                case "Realizar":
                    System.out.println("Introduce tu edad : ");
                    edad = sc.nextInt();

                    if (edad > 18 && edad < 65) { //la edad debe ser entre 18 y 65 
                        System.out.println("Introduce tu salario Bruto Mensual : ");
                        salarioBrutoMensual = sc.nextDouble();
                        System.out.println("Introduce la cantidad total de pasta que necesita para su hipoteca : ");
                        totalHipoteca = sc.nextDouble();

                        //calcular el sueldo bruto anual y multiplicamos con el FACTORMULTIPLICATIVO
                        sueldoBrutoAnual = salarioBrutoMensual * 12;
                        contidadresulta = sueldoBrutoAnual * FACTORMULTIPLICATIVO;
                        //ver si el total pediendo de hipoteca mas que su sueldoAnual multiplicando con el Factor Multiplicativo
                        if (totalHipoteca > contidadresulta) {
                            System.out.println("Lo siento la hipoteca rechaza");//si si devuelve msg que tu hipoteca rechaza 
                        } else {//si no entra para saber mas informaciones 
                            System.out.println("Introduce numero de años en los que quiere devolver la hipoteca: ");
                            anosDelvolverHipoteca = sc.nextInt();
                            if ((anosDelvolverHipoteca > 30 || anosDelvolverHipoteca < 5) || ((edad + anosDelvolverHipoteca) > 75)) {
                                System.out.println("Lo siento la hipoteca rechaza");
                            } else {
                                System.out.println("hipoteca Acceptada");
                            }
                        }

                    } else {
                        System.out.println("lo siento no conceden préstamos a menores de edad y a mayores de 65 años.");
                    }   
                    
                case "salir":
                    System.out.println("Has eligado finalizar");
                    break;
                default:
                    System.out.println("Introduce opcion valida");
                    break;
            }

        } while (!opcion.equalsIgnoreCase("salir"));

    }
}
