/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author
 */
class TCPClient {

    public static void main(String argv[]) throws Exception {
        String input;
        String output;

        System.out.println("Enter text ...");
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        Socket clientSocket = new Socket("localhost", 6001);

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        input = inFromUser.readLine();
        outToServer.writeBytes(input + '\n');

        output = inFromServer.readLine();

        System.out.println(String.format("OUTPUT FROM SERVER: %s", output));

        clientSocket.close();
    }
}
