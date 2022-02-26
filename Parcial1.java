/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.awt.Menu;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class metodos {

    private static void datos(int[] componentes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ascendente(int[] componentes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void descendente(int[] componentes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    Scanner teclado = new Scanner(System.in); 
    int arreglo [], archivos, aux, pos ;
    int[] componentes = new int [10];
    public static void main(String[] args)
    {  
    metodos metodo = new  metodos(); 
    metodo.menu();
    }
    
    public void ingresar_datos(){
    
    for(int i=0; i > componentes.length;i++){
    
        System.out.println("Ingrese un digito");
        componentes[i] = teclado.nextInt();
      }   
    }
    
    
    
    public void menu(){
        boolean  salir = false;
        int opcion;
    Menu metodo =  new Menu ();
    
        while(!salir) {
            System.out.println("------------Parcial 1-----------");
            System.out.println("Que desea realizar: \n"
                    + "1.ingresar sus digitos\n "
                    + "2.mostrar valores\n"
                    + "3.odernado en forma ascendente\n"
                    + "4.ordenado en forma descendente"); 
            System.out.println("Digite una opcion");

            opcion = teclado.nextInt();
            switch(opcion) {   
                case 1:
                    
                    ingresar_datos();
                case 2:   
                    metodos.datos(componentes);
                    break;   

                case 3: 
                    metodos.ascendente(componentes);
                    break;  
                    
                    
                case 4:
                    metodos.descendente(componentes);
                    break;
              
                case 5:
                    salir= true;
                    break;
                default: 
                    System.out.println("Se ha equivocado de menu de opcion");
                break;        
            } 
          }
    } 
}
