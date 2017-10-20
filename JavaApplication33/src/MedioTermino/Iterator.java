/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioTermino;

/**
 *
 * @author Karen
 */
public class Iterator 
    protected Dictionary<T> Dictionary;
    int cont;
    public Interator (Dictionary<T> Dictionary)
    {
        this. = Dictionary;
        cont = 0;
    }
    
    boolean hasNext()
    {
        if(cont < Dictionary.lenght())
        
            return true;
            return false;
        
    }
    public T next()
    {
        return Dictionary.at(cont++);
    }
    
}
