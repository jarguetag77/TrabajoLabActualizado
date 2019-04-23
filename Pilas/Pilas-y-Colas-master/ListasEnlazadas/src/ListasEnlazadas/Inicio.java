


package ListasEnlazadas;


import java.util.*; 

public class Inicio {

    public static void main(String[] args) {
        
      Scanner scn = new Scanner(System.in);  
      System.out.println("Ingrese tamaño de la pila:\t");
      int tamaño= scn.nextInt();
      
      ListaPila pila = new ListaPila(tamaño); 
      
    
      do{
          
           System.out.println("\n\nQue desea hacer con la pila?\n\n1.Push\n2.Mostrar");
      int op= scn.nextInt();
      switch(op){
          
          case 1:{
              System.out.println("Ingrese tamaño de la pila:\t");
              int dato= scn.nextInt();
              
              pila.push(dato);
          }
          
          case 2:{
                while (!pila.vacio()) {
         int value = pila.pop();
         System.out.print(value);
         System.out.print(" ");
      }
          }
      }
      
      }while(op!=0);   
          
          
      
      
      
    
        
        
      
// TODO code application logic here
    }
    
}
