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
public class Cracker extends PasswordCracker {

    @Override
    public void setHost(String host) {
        this.host = host;
        System.out.println("El host es: " + host);
    }

    @Override
    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
        System.out.println("El diccionario es: " + dictionary);
    }

    @Override
    public String crackPWD() {
        return "password";
    }

    @Override
    public void setIp(String ip) {
        this.ip = ip;
        System.out.println("La IP es: " + ip);
    }
    
}
