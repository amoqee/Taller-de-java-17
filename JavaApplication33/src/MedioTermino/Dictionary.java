/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioTermino;

import Singleton.Singleton;

/**
 *
 * @author Karen
 */
public class Dictionary {
    
    private static Dictionary Dic;
    public String abc [];
    protected int contador;
    
    private Dictionary()
    {
        
    }
    
    public static Dictionary getDic()
    {
        if(Dic == null)
        {
            Dic = new Dictionary();
        }
        
        return Dic;
    }
    
    public void agregarPalabra(String palabras){
        abc [contador] = palabras;
        contador = contador + 1;
                
              
    }
    
}
