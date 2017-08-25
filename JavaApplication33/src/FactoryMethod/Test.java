/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;


/**
 *
 * @author Karen
 */
public class Test {
    public static void main(String[] args) {
        Creator c = new ConcreteCreator();
        
        Product p = (Product) c.FactoryMethod("Producto1");
        
        ProductFather pro2 = c.FactoryMethod("Producto2");
    }
    
}
