/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author
 */
public class UDPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        System.out.println("Enter text ...");
        BufferedReader input
                = new BufferedReader(new InputStreamReader(System.in));
        
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress
                = InetAddress.getByName("localhost");
        
        byte[] sendData;
        byte[] receiveData = new byte[1024];
        String sentence = input.readLine();
        sendData = sentence.getBytes();
        DatagramPacket sendPacket
                = new DatagramPacket(sendData, sendData.length,
                        IPAddress, 7001);
        clientSocket.send(sendPacket);
        DatagramPacket receivePacket
                = new DatagramPacket(receiveData,
                        receiveData.length);
        clientSocket.receive(receivePacket);
        String output
                = new String(receivePacket.getData());
        System.out.println("FROM UDP SERVER:"
                + output);
        clientSocket.close();
    }

}
