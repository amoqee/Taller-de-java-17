/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author Karen
 * @param <T>
 */
public class Comparaciones<T>
{
    public <N extends Number & Comparable> N mayor (N a, N b)
    {
        if (a.compareTo(b) > 0)
            return a;
       return b;
    }
    
    
    public boolean iguales (T a, T b)
    {
        return a.equals(b);
    }
    
    public <E, R> boolean igualesB(E a, R b)
    {
        return a.equals(b);
    }
    public static void main(String[] args) {
        Comparaciones c = new Comparaciones ();
        String a = "Hola";
        String b = "Hola";
        
        Integer i = new Integer(5);
        Integer j = new Integer(5);
        
        Agua b1 = new Agua();
        b1.mililitros = 500;
        Agua b2 = new Agua();
        b2.mililitros = 500;
        Refresco r = new Refresco();
        r.mililitros = 500;
        
        System.out.println(b1.compareTo(b2));
        System.out.println("Enteros" + c.iguales(i, j));
        System.out.println("cadenas" + c.iguales(a, b));
        System.out.println("aguas" + c.iguales(b1, b2));
        System.out.println("refresco" + c.iguales(b1, r));
        System.out.println("numeros" + c.mayor(5, 3));
    }
}
