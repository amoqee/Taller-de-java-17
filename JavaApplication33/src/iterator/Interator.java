/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Karen
 */
public class Interator<T> {
    protected Collection<T> collection;
    int cont;
    public Interator (Collection<T> collection)
    {
        this.collection = collection;
        cont = 0;
    }
    
    boolean hasNext()
    {
        if(cont < collection.lenght())
        
            return true;
            return false;
        
    }
    public T next()
    {
        return collection.at(cont++);
    }
    
}
