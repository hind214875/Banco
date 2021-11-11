package hipoteca;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class HipotecaMetodos {
    //metodos

    private static void MostrarMenu() {
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("Realizar.Hacer el programa");
        System.out.println("Salir.Finalizar");
    }
    
    private static boolean recibeEdad(int edad){       
        //si la edad dentro del rango devuelve true
        return (edad > 18 && edad < 65);        
    }
    
    private static boolean recibeDineroPedir(double dineroPedir,double sueldo,double FactorMultiplicativo){
         //calcular el sueldo bruto anual y multiplicamos con el FACTORMULTIPLICATIVO
         double contidadresulta = sueldo * FactorMultiplicativo; 
         return (dineroPedir < contidadresulta);
    }
    
    private static boolean añosDevolverHipoteca(int añosDevuelveHipoteca,int edad){
         return ((añosDevuelveHipoteca > 30 || añosDevuelveHipoteca < 5) 
                 || ((edad + añosDevuelveHipoteca) > 75));       
    }

    public static void main(String[] args) {
        //declaracion de variables
        String opcion;
        int edad,anosDelvolverHipoteca;
        double salarioBrutoAnual,dineroPedir,factorMultiplicativo;
        Scanner sc = new Scanner(System.in);

        do {
            MostrarMenu();
            //eliga opcion del menu
            System.out.println("Elija una opción: ");
            opcion = sc.nextLine();
            //pedir Informaciones
            switch (opcion) {
                case "Realizar":
                    System.out.println("Introduce tu edad : ");
                    edad = sc.nextInt(); 
                    
                      if(recibeEdad(edad)){
                        
                        System.out.println("Introduce tu salario Bruto Anual");
                        salarioBrutoAnual = sc.nextDouble();
                        System.out.println("Introduce el dinero a pedir");
                        dineroPedir=sc.nextDouble();
                        System.out.println("Introduc el factor multiplicativo");
                        factorMultiplicativo=sc.nextDouble();
                        
                        if(recibeDineroPedir(dineroPedir,salarioBrutoAnual,factorMultiplicativo)){
                            System.out.println("Introduce numero de años en los que quiere devolver la hipoteca: ");
                            anosDelvolverHipoteca = sc.nextInt();
                            if(añosDevolverHipoteca(anosDelvolverHipoteca,edad)){
                                System.out.println("tu Hipoteca acceptada");
                            }else{
                                System.out.println("tu Hipoteca rechaza");
                            }
                            
                        }else{
                            System.out.println("Lo siento la hipoteca rechaza");
                        }
                
                        
                    }else{
                        System.out.println("la edad no es valido");
                    }
                    
                    
                    break;
                    
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
