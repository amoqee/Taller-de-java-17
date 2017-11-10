/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforos;

import java.util.concurrent.Semaphore;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Karen
 */
public class CenaChina implements Runnable{
    

/**
 *
 * @author Karen
 */

    
    String s;
    Semaphore silla;
    Semaphore tenedor;
    Semaphore cuchillo;
    
    public CenaChina (String s, Semaphore silla, Semaphore tenedor, Semaphore cuchillo )
    {
        this.s = s;
        this.silla = silla;
        this.tenedor = tenedor;
        this.cuchillo = cuchillo;
        
    }

    @Override
    public void run() {
        
        try{
            silla.acquire();
            tenedor.acquire();
            cuchillo.acquire();
            
            
           System.out.println(  s + " comiendo");
            Thread.sleep(3000);
            cuchillo.release();
            tenedor.release();
            silla.release();
        } catch (InterruptedException ex) {
            
        }
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        Semaphore Sillas = new Semaphore (6);
        Semaphore Tenedores = new Semaphore (5);
        Semaphore Cuchillos = new Semaphore (4);
        
        
        
        Thread t1 = new Thread(new CenaChina ("chino 1 esta cenando", Sillas, Tenedores, Cuchillos)); 
        Thread t2 = new Thread(new CenaChina("chino 2 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t3 = new Thread(new CenaChina("chino 3 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t4 = new Thread(new CenaChina("chino 4 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t5 = new Thread(new CenaChina("chino 5 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t6= new Thread(new CenaChina("chino 6 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t7 = new Thread(new CenaChina ("chino 7 esta cenando", Sillas, Tenedores, Cuchillos)); 
        Thread t8 = new Thread(new CenaChina("chino 8 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t9 = new Thread(new CenaChina("chino 9 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t10 = new Thread(new CenaChina("chino 10 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t11 = new Thread(new CenaChina("chino 11 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t12= new Thread(new CenaChina("chino 12 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t13 = new Thread(new CenaChina("chino 13 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t14 = new Thread(new CenaChina("chino 14 esta cenando", Sillas, Tenedores, Cuchillos));
        Thread t15= new Thread(new CenaChina("chino 15 esta cenando", Sillas, Tenedores, Cuchillos));
        
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t14.start();
    }
    
}
    

