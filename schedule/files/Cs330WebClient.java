/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs330.webserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gzhelezo
 */
public class Cs330WebClient {

    public static void main(String argv[]) throws IOException {

        // Path currentPath = Paths.get("");
        // System.out.println(currentPath.toAbsolutePath().toString());
        
        // List<String> words = Files.readAllLines(Paths.get("words.txt"));
        
        try {
            Socket clientSocket = new Socket("localhost", 9876);
            clientSocket.setSendBufferSize(100);
            clientSocket.setReceiveBufferSize(100);

            DataOutputStream outStream = new DataOutputStream(clientSocket.getOutputStream());
            InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
            
            Scanner scanner = new Scanner(System.in);
            int index = 0;
            while (true) {             
                System.out.print("Please enter a command >");
                String command = scanner.nextLine();
                                                
                if("QUIT".equals(command.toUpperCase())){
                    break;
                }
                String data = "Hello from CS330 My First Web Client ..." + System.currentTimeMillis() + '\n';
                outStream.writeBytes(data);

                String response = new BufferedReader(inputStream).readLine();
                System.out.println(index++ + " : " + response);
            }
            clientSocket.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
