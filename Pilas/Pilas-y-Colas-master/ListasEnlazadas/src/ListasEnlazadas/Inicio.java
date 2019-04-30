


package ListasEnlazadas;


import java.util.*; 

public class Inicio {

    public static void main(String[] args) {
        
      Scanner scn = new Scanner(System.in);  
      System.out.println("Ingrese tamaño de la pila:\t");
      int tamaño= scn.nextInt();
      int i=0, dato=0,op;
      ListaPila pila = new ListaPila(tamaño);
      
      
      //ingresar en pila
      
      do{
          System.out.print("\nIngrese dato #"+(i+1)+" en la pila:\t\t");
          dato= scn.nextInt();
          pila.push(dato);
          
          i+=1;
      }while(i!=tamaño);
      
      //mostrar pila
      
         System.out.print("\nPILA\n");
      while (!pila.vacio()) {
         int value = pila.pop();
         System.out.print(" { "+value+" } ");
      }
     
      do{
          System.out.print("\n\n\n\n\n1.Eliminar\n2.Mostrar\n\n\t\t\t\t\t");
          op =scn.nextInt();
          switch(op){
              case 1: {
                  pila.pop();
              }
              
              case 2: {
                  System.out.print("\nPILA\n");
                  while (!pila.vacio()) {
                    int value = pila.pop();
                    System.out.print(" { "+value+" } ");
                 }
              }
          }
          
      }while(op!=0);
          
      
      
      
    
        
        
      
// TODO code application logic here
    }
    
}
