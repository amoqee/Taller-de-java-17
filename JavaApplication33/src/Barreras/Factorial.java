/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barreras;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Karen
 */
public class Factorial extends Thread{

   int num;
   CyclicBarrier barrera;
   int resultado;
   
    public Factorial(int num, CyclicBarrier barrera)
    {
        this.num = num;
        this.barrera = barrera;
    }

    
    @Override
    public void run() {
        
       try {
           System.out.println("Calculando el factorial de ");
           resultado = Factorial(num);
           barrera.await();
           System.out.println("Terminé la operacion");
       } catch (InterruptedException ex) {
           
       } catch (BrokenBarrierException ex) {
           
       }
    }
    int Factorial (int n)
    {
        int accum = 1;
        for (int i = n; i > 0; i--)
        {
            accum *= i;
        }
        
        return accum;
    }

    public int getResultado() {
        return resultado;
    }
    
    
    
}
