package javaapplication19;

import java.util.Scanner;
import javaapplication19.Lista;

public class JavaApplication19 {
    
    Scanner in = new Scanner(System.in);
    Lista lista = new Lista();
    
 
    public static void main(String[] args) {
        
        JavaApplication19 list = new JavaApplication19();
        list.menu();

    }
    public void menu(){
        boolean  exit = false;
        int opcion;
        while(!exit) {
            System.out.println("------------Ejercicio Lista Enlazada-------------");
            System.out.println("Seleccione una opcion: \n"
                    + "1.añadir \n"
                    + "2.Imprimirt\n"
                    + "3.Añadir al ultimo \n"
                    + "4.Añadir al primero\n"
                    + "5.Borrar\n"
                    + "6.Buscar\n"
                    + "7.Borrar un numero especifico\n"
                    + "8.Salir\n"); 
            
            
            System.out.println("Please select an option");
            
            
            

            opcion = in.nextInt();
            switch(opcion) {

                case 1:   
                    add();
                    break;   

                case 2: 
                    System.out.println("Los elementos a mostar son\n");
                    lista.mostrarLista();
                    
                    break;  
                    
                case 3: 
                    addLast();
                    break;  
                    
                case 4: 
                    lista.eliminarAlInicio();
                    System.out.println("El" + lista.eliminarAlInicio()+ " ha sido eliminado");
                    break;  
                case 5: 
                    
                    System.out.println("El" + lista.eliminarAlFinal()+ "ha sido eliminado");
                    break;  
                   
                case 6:
                    find();
                    System.out.println("El Elemento ha sido encontrado ");
                    break;
                    
                case 7:                  
                    Eliminar();
                    break;
                            
                case 8:
                    System.out.println("It was a plasure to be with you");
                    exit= true;
                    break;
                default: 
                    System.out.println("----------------Please select the correct option----------------");
                break;        
            } 
          }
    }


    public void add(){
        int elemento;    
        System.out.println("Ingresa un elemento");
        elemento = in.nextInt();
        lista.agregarAlInicio(elemento);
    }
  
    public void  addLast(){
        System.out.println("Ingresar elemento");
        lista.agregarAlFinal(in.nextInt());
     
    }
    public void find(){
        System.out.println("Ingrese elemento a buscar");
        lista.buscarElemento(in.nextInt()); 
    }
    
    public void Eliminar(){
        System.out.println("Ingrese Numero a eliminar");
        lista.eliminar(in.nextInt());
        System.out.println("El Numero ha sido eliminado exitosamente");
    
    
    }
 }
