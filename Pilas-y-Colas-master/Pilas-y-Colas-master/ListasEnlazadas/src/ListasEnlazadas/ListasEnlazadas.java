/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;

import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
public class ListasEnlazadas
{
    	Nodo Primero;
	public ListasEnlazadas()
	{
		Primero=null;
	}
	public boolean vacia()
	{
		if (Primero==null)
		{
			return(true);
		} else
		{
			return(false);
		}
	}
	public void InsertarEnPrimero(int Dato)
	{
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
	}
	public void borrarPrimero()
	{
		Primero=Primero.Siguiente;
	}
	public String Listar()
	{
		String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null)
		{
			Dato+="{" + aux.info + "}";
			aux=aux.Siguiente;
		}
		return(Dato);
	}
	public void borrarUltimo()
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.Siguiente!=null)
		{
			anterior=actual;
			actual=actual.Siguiente;
		}
		anterior.Siguiente=null;
	}
	public void borrarPosicion(int pos)
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
		if (pos>0)
		{
			while (k!=pos && actual.Siguiente != null)
			{
				anterior=actual;
				actual=actual.Siguiente;
				k++;
				System.out.println("K       "+k);
			}
			anterior.Siguiente=actual.Siguiente;
		}
	}
        public int Localizar(int bsq){
            
            int n=0;
            Nodo aux=Primero;
            while (aux!=null)
		{
                    n+=1;
                    if(aux.info==bsq)
                        bsq=n;
                    aux=aux.Siguiente;
		}
                
                
            return bsq;
            
        }
        
        public void Insert(){
            
            
            Scanner scn = new Scanner(System.in);
            System.out.println("Tamaño? =  ");
            int dato,tm = scn.nextInt();
            
            for(int i=1;i<=tm;i++){
                System.out.println(tm+"Insertar dato =");
                dato = scn.nextInt();
                InsertarEnPrimero(dato);
            }
  
        }

}
