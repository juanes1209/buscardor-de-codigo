/*
 * PARA BUSCAR ENTRE TODOS LOS ZIP DE LAS ACTIVIDADES Y ENTREGABLE,EVALUACIONES O DEMAS DE LAS MATERIAS DE PROGRAMACION.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    [{()}]
 */
package principal;
import java.util.Scanner;

/**
 * este es la case donde se muestra o imprimen los los MENUS u OPCIONES del proyecto.
 * @author jcvel
 * @version 0.0.9
 */
public class Maintaskcollector {

    /**Maintaskcollector
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES
        String opciones=" ";//variable del switch.
        int subopciones=0;
        
        //OBJETOS
        Scanner entrada = new Scanner (System.in);
        
        //METODOS de VISUALIZACION
        /*
        me
        System.out.println("menu de opciones del taskcoletor \n "
        );
        System.out.println("buscar");
        System.out.println("agregar");
        System.out.println("verificar");
        System.out.println("categorias");
        System.out.println("conectar");
        */
        
        System.out.println("seleccione una de las siguientes opciones:\n" + "opc1\n" + "opc2\n" + "opc3\n" + "opc4\n" + "opc5\n");
        opciones = entrada.next();//se usa para selecionar una opcion del switch.
        
        switch(opciones){
            case "opc1":
                System.out.println("submenu para BUSCAR:");
                System.out.println("varibles");
                System.out.println("funciones");
                System.out.println("clases");
                break;
            case "opc2":
                System.out.println("submenu para AGREGAR:");
                System.out.println("clases \n"+"paquetes\n"+"proyectos");
                break;
            case "opc3":
                /*System.out.println("""
                                   submenu de VERIFICAR:
                                   si existe...
                                   si esta incompleto...
                                   a donde pertenece...
                                   """);*/
                System.out.println("submenu para VERIFICAR:");
                System.out.println("si existe archivo...");
                subopciones = entrada.nextInt();
                switch(subopciones){
                    case 1:
                        System.out.println("menu para la subopcion 1:");
                        System.out.println("la funcion \n"+"la clase \n"+"el paquete \n");
                        break;
                    default:
                        System.out.println("opcion no encontrada.");
                        break;
                }
                System.out.println("esta incompleto codigo de archivo");
                subopciones = entrada.nextInt();
                switch(subopciones){
                    case 1:
                        System.out.println("menu para la subopcion 2:");
                        System.out.println("la funcion \n"+"el condicional \n"+"el ciclo");
                        System.out.println("la estructura de datos");
                        break;
                    default:
                        System.out.println("opcion no encontrada.");
                        break;
                }
                System.out.println("a donde pertenece archivo o carpeta");
                subopciones = entrada.nextInt();
                switch(subopciones){
                    case 1:
                        System.out.println("menu para la subopcion 3:");
                        System.out.println("la funcion \n"+"la clase \n"+"el paquete\n");
                        break;
                    default:
                        System.out.println("opcion no encontrada.");
                        break;
                }
                break;    
            case "opc4":
                System.out.println("submenu para CATEGORIAS:");
                System.out.println("agregar categoria \n"+
                                   "cuantas categorias hay");
                System.out.println("a que categoria pertenece:");
                subopciones = entrada.nextInt();
                switch(subopciones){
                    case 1:
                        System.out.println("menu para la subopcion 3:");
                        System.out.println("la clase \n"+"el paquete ");
                    break;
                    default:
                        System.out.println("opcion no encontrada.");
                        break;
                }
                break;    
            case "opc5":
                System.out.println("submenu para CONECTAR:");
                System.out.println("base de datos");
                System.out.println("a APIS");
                break;    
            default:
                System.out.println("opcion no valida, seleccione una existente");
                break;
           
        }
        
        entrada.close();
        
        
        
        
        
    }
    
}
