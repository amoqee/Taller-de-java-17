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
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Karen
 */
public class Server {
    public static void main(String[] args) {
        try{
        int port = 2242;
        ServerSocket server = new ServerSocket(port);
        Socket cliente = server.accept();
        
        PrintWriter print = new PrintWriter(cliente.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
        String line = "no estes molestando";
        while((line = in.readLine())!= null)
        {
            System.out.println(line);
            out.println("servidor repite" + line);
        }
        
        cliente.close();
        server.close();
        
    }catch (IOException ex) {
            
        }
        
     
}
}
