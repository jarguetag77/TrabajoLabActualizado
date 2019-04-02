/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuralibros;

import java.util.Scanner;


public class Inicio {

    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        Libro libro;
        Lista lista = new Lista();
        int op;

        do{
             System.out.println("\nOPCIONES:");
             System.out.println("\n\t\t 1. Insertar Libro.");
             System.out.println("\n\t\t 2. Mostrar Lista.");
             System.out.println("\n\t\t 3. Eliminar Libro.");
             System.out.println("\n\t\t 0. SALIR");
             op = scn.nextInt();
        
        switch(op){
            case 1:
            {
                String titulo, autor, isbn;
                
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nINSERTAR");
                System.out.println("\n\tIngrese Titulo:");
                titulo = scn.next();
                 System.out.println("\n\tIngrese Autor:");
                autor = scn.next();
                 System.out.println("\n\tIngrese Isbn:");
                isbn = scn.next();
                libro = new Libro(titulo,autor,isbn);
                lista.insertarPrincipio(libro);
                
            }break;
            
            case 2:
            {
                 System.out.println("\n"+lista.Listar()+"\n");
            }break;
            
            case 3:
            {
                
            }break;
        }
        
        }while(op!=0);
        
        
        
        
        
       
        
    }
    
}
