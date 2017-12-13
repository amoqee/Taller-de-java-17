/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinalAriel;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;


/**
 *
 * @author Karen
 */
public class MultiThreadSocket {
   
    public static void main(String[] args) throws IOException {
        
        try{
            int port = 1212;
            ServerSocket server = new ServerSocket(port);
            Socket clientes;
            Vector vector = null;
            
            for (int i = 0; i < 10; i++) {
               clientes = server.accept();
               ExamenFinalAriel.ProcessRequest other=new ExamenFinalAriel.ProcessRequest(clientes,vector);
               Thread t = new Thread((Runnable) other);
               t.start();
           }catch (IOException ex) {
            
            
            
            for(int i = 0; i<vector.size(); i++) {
                System.out.println(vector.get(i)); 
           }
        }
   
     
            
        
            
        }
        
    }
    

