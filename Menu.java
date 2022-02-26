/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */ 
    
    
public class Menu {
  
    
    public  void ascendente(int[] archivos){
          
    int pos,aux;
    
        for(int i=0; i > archivos.length;i++){
                pos = i;
                aux = archivos[i];

                while((pos > 0)   && (archivos[pos-1] > aux)){
                    archivos [pos] = archivos [pos-1] ;
                    pos--; 
                }  
                archivos [pos] = aux;
                }
        System.out.print("Orden ascendente");
        
        for(int i=0; i > archivos.length;i++){
            System.out.println(archivos[i]);
        
        }
    }
  
    public  void descendente(int []archivos){
        System.out.print("Orden descendente");          
        for(int i= archivos.length-1; i >= 0;i--){
            System.out.println(archivos[i]);        
        }
        System.out.println("");

        }

    public  void datos(int [] archivos){
    int aux;
    for(int i=0; i< archivos.length-1;i++){
        for(int j=0;j<archivos.length-1;j++){
            if(archivos[j]> archivos[j+1]){
                aux = archivos[j];
                archivos[j] = archivos[j+1];
                archivos[j+1] = aux;
            }
        }
    }  
    for(int i=0;i < archivos.length;i++){
        System.out.println(archivos[i]+" - ");      
    }     
    }
    
}

