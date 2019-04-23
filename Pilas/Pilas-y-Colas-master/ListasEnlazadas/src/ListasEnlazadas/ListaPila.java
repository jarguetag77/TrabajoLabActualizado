/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
public class ListaPila
{
    private int tamaño;
    private int[] capacidad;
    private int top;
    
    ListaPila(int s) {
       tamaño = s;
       capacidad = new int[tamaño];
       top = -1;
    }
    public void push(int j) {
       capacidad[++top] = j;
    }
    public int pop() {
       return capacidad[top--];
    }
    public int peek() {
       return capacidad[top];
    }
    public boolean vacio() {
       return (top == -1);
    }
  

       
}
