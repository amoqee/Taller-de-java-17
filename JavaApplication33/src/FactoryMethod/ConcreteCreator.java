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
public class ConcreteCreator extends Creator {

    @Override
    public void create(String typeProduct) {
        if(typeProduct.compareTo("Producto1")== 0)
        {
            product = new Product();
            ((Product)product).construirParteUno();
            ((Product)product).construirParteDos();
        }
        if(typeProduct.compareTo("Producto2")== 0)
        {
          product = new ProductoDos();
            ((ProductoDos )product).complex1();
          ((ProductoDos )product).complex2();
        }
    }
    
}
