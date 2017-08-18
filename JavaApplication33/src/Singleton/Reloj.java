/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.Calendar;

/**
 *
 * @author Karen
 */
public class Reloj {

    private static Singleton instance;
    
    private Reloj()
    {
        
    }
    
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Reloj();
        }
        
        return instance;
    }
    
    public String getHora (){
     
    Calendar calendario = Calendar.getInstance();
    
     hora =calendario.get(Calendar.HOUR_OF_DAY);
     minutos = calendario.get(Calendar.MINUTE);
     segundos = calendario.get(Calendar.SECOND);   
}
    
    public String getFecha(){
        
        
    }
    
    
    
    
}