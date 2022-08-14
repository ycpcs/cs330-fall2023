package PongServer;

import java.io.*;
import java.net.*;
import java.util.*;

/*
 * Server to process ping requests over UDP.
 */
public class PingServer {

    private static class PongPacket extends Thread {

        DatagramPacket ping;
        Random random;
        double loss_rate;
        int average_delay_ms;

        PongPacket(DatagramPacket ping, Random random, double loss_rate, int average_delay_ms) {
            this.ping = ping;
            this.random = random;
            this.loss_rate = loss_rate;
            this.average_delay_ms = average_delay_ms;
        }

        @Override
        public void run() {
            try {
                print_data(ping);

                /* simulate packet loss. */
                if (random.nextDouble() < loss_rate) {
                    System.out.println("    Packet lost, reply not sent.");
                    return;
                }

                /* Let's simulate some network delay */
                Thread.sleep((int) (random.nextDouble() * 2 * average_delay_ms));

                /* Finally, send the pong reply */
                InetAddress clientHost = ping.getAddress();
                int clientPort = ping.getPort();
                byte[] buf = "Pong".getBytes();
                DatagramPacket reply = new DatagramPacket(buf, buf.length, clientHost, clientPort);
                DatagramSocket socket = new DatagramSocket();
                socket.send(reply);

                System.out.println("    Pong reply sent.");

            } catch (Exception ex) {
                System.out.println("ERROR - Processing ping request: " + ex.getMessage());
            }
        }
    }

    /* Arguments:
     *   port #
     *   average delay in milliseconds
     *   loss rate
     */
    public static void main(String[] args) throws Exception {

        /* server port number */
        int port;

        /* default average delay */
        int average_delay_ms = 5;

        /* default loss rate */
        double loss_rate = 0.3;

        /* Random number generator used for simulating packet loss and delay */
        Random random = new Random();

        /* Parse command line arguments */
        if (args.length < 1) {
            System.out.println("ERROR - Arguments missing");
            return;
        }

        port = Integer.parseInt(args[0]);
        if (port <= 1024) {
            System.err.println("ERROR - Avoid using reserved port numbers");
            return;
        }

        if (args.length >= 1) {
            average_delay_ms = Integer.parseInt(args[1]);
        }
        if (args.length >= 2) {
            loss_rate = Double.parseDouble(args[2]);
        }

        DatagramSocket socket = new DatagramSocket(port);
        System.out.println("    UDP Ping server listening on port "
                + port
                + " with "
                + average_delay_ms
                + "ms dellay and "
                + loss_rate
                + " loss rate ...");

        while (true) {
            DatagramPacket request = new DatagramPacket(new byte[1024], 1024);

            /* This is a blocking call - until the server receives a UDP packet */
            socket.receive(request);
            print_data(request);

            /* Handle each ping request on a new thread */
            PongPacket pong = new PongPacket(request, random, loss_rate, average_delay_ms);
            pong.start();
        }
    }

    /* Print host information and data received from it */
    private static void print_data(DatagramPacket request) throws Exception {
        byte[] buf = request.getData();

        ByteArrayInputStream bais = new ByteArrayInputStream(buf);

        InputStreamReader isr = new InputStreamReader(bais);

        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();

        System.out.println(
                "    Received from "
                + request.getAddress().getHostAddress()
                + ": "
                + request.getPort()
                + " - "
                + line);
    }
}
