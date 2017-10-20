/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioTermino;

import FactoryMethod.ProductFather;

/**
 *
 * @author Karen
 */
public abstract class Creator {
    public abstract void create(String typeCracker, Dictionary typeDictionary, String typeHost, String typeIp );
    public PasswordCracker FactoryMethod(String typeCracker, Dictionary Dictionary, String typeHost, String typeIp)
    {
        
        create (typeCracker, Dictionary, typeHost, typeIp);
        return Cracker;
    }
    protected PasswordCracker Cracker;
    
}
