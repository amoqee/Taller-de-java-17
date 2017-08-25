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
public class Product extends ProductFather
{
    void construirParteUno()
    {
        System.out.println("Estoy construyendo la primera parte");
    }
    void construirParteDos ()
    {
        System.out.println("Construyendo parte compleja");
    }
}
