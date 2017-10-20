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
public class ConcreteCreator extends Creator{
        public void create(String typeCracker, String host, Dictionary dictionary, String Host, String Ip) {
        
        {
            Cracker = new Cracker();
            Cracker.setDictionary(dictionary);
            Cracker.setHost(Host);
            Cracker.setIp(Ip);

                        
        }
        
    
        }

    @Override
    
