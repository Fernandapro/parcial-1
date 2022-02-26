import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Arreglo {
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);   
    int matriz [], resultado, aux, pos;
    resultado = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos digitos introducira? "));
    
    matriz = new int[resultado];
    
    for (int i=0; i< resultado; i++){
        
        System.out.println((i+1) + "----------Introduzca un numero ---------");
        matriz[i] = entrada.nextInt();
    }
    
     //metodo burbuja 
    for(int i=0; i< (resultado-1);i++){
        for(int j=0;j<(resultado-1);j++){
            if(matriz[j]> matriz[j+1]){
                aux = matriz[j];
                matriz[j] = matriz[j+1];
                matriz[j+1] = aux;
            }
        }
    }  
    for(int i=0;i < resultado;i++){
        System.out.println(matriz[i]+" - ");      
    }     
    
    //ordenamiento quicksort
    for(int i=0;i<resultado;i++){
        pos = i;
        aux = matriz[i];
        
        while((pos>0) && (matriz[pos-1] > aux)) {
            matriz[pos] = matriz[pos-1];
            pos--;
        }
        matriz[pos] = aux;
    }
    System.out.println("Orden Ascendente: ");
    for(int i=0;i<resultado;i++){
        System.out.print(matriz[i]+"_***_");
    }
        }  
}

    

 