/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Karen
 */
public class Reloj {
    

    private static Reloj instance;
    
    private Reloj()
    {
        
    }
    
    public static Reloj getInstance()
    {
        if(instance == null)
        {
            instance = new Reloj();
        }
        
        return instance;
    }
    
    public String getHora (){
    
    Calendar calendario = Calendar.getInstance();
           
    
     int hora =calendario.get(Calendar.HOUR_OF_DAY);
     int minutos = calendario.get(Calendar.MINUTE);
     int segundos = calendario.get(Calendar.SECOND);
     
        System.out.println(hora);
        System.out.println(minutos);
        System.out.println(segundos);
        return null;
     
}
    
    public String getFecha (){
        
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    Date today = Calendar.getInstance().getTime();
    String reportDate = df.format(today);
        System.out.println(reportDate);
        return reportDate;
    
    }
    
    public static void main(String[] args) {
        
        Reloj reloj = Reloj.getInstance();
        reloj.getHora();
        reloj.getFecha();
        
    }
    
}