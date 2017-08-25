/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DriverDB;

/**
 *
 * @author Karen
 */
public class Concrete extends Creator {
    public void create(String typeProduct) {
        if(typeProduct.compareTo("mongoDB")== 0)
        {
            product = new DriverDBMango();
            ((DriverDBMango)product).abrirConexion();
            ((DriverDBMango)product).establecerPropiedades();
            ((DriverDBMango)product).crearLogFile();
        }
       
    }
    
}
