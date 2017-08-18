/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Karen
 */
public class Singleton {
    private static Singleton instance;
    
    private Singleton()
    {
        
    }
    
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        
        return instance;
    }
    
    void doOperations(){
        
        System.out.println("Esta es ima de las operaciones");
    }
}
