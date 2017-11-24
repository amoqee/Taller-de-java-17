/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen
 */
public class Cliente {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 2242;
        try
        (Socket socket = new Socket(host, port);){
            PrintWriter print = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
              
           
        
        
        
        
        {
            String line = "soy el cliente pedinche y quiero algo";
            print.println(); //envia al servidor 
            System.out.println(in.readLine()); //lee el servidor
        }
        
        } catch (IOException ex) {
            System.out.println(ex.toString());
            
            
        }
        
        
        
    }
    
}
