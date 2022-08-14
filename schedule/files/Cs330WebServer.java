/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs330.webserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cs330WebServer {

    public static void main(String[] args) {
        try {
            ServerSocket welcomingSocket = new ServerSocket(9876);

            while (true) {
                System.out.println("Waiting to connect on port 9876 ...");
                Socket connectionSocket = welcomingSocket.accept();

                Runnable runnable = () -> {
                    System.out.println("Connection established ...");
                    int clientPort = connectionSocket.getPort();
                    try {
                        while (true) {
                            InputStreamReader inputStream = new InputStreamReader(connectionSocket.getInputStream());
                            BufferedReader reader = new BufferedReader(inputStream);
                            System.out.println(String.format("Port: %d - %s", clientPort, reader.readLine()));

                            String response = "HTTP/1.1 200 OK\r\n"
                                    + "Content-Type: text/html\r\n\r\n"
                                    + "Who hoo My first TCP Web Server";
                            connectionSocket.getOutputStream().write(response.getBytes());
                        }
                    } catch (Exception se) {
                        System.out.println("Closing connection with: " + clientPort);
                    }
                    try {
                        connectionSocket.close();
                    } catch (IOException ex) {
                        System.out.println("I should never be here: " + ex);
                    }
                };
                Thread t = new Thread(runnable);
                t.start();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
