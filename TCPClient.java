import java.util.Scanner;

import java.io.*;

import java.net.*;

import java.net.Socket.*;


class TCPClient {

 public static void main(String argv[]) throws IOException {

  String sentence;

  String modifiedSentence;

BufferedReader inFromUser = new BufferedReader(new 
InputStreamReader(System.in));

  
  Socket clientSocket = new Socket("192.168.136.128", 22000);

DataOutputStream outToServer = new 
DataOutputStream(clientSocket.getOutputStream());

  BufferedReader inFromServer = new BufferedReader(new 
InputStreamReader(clientSocket.getInputStream()));
 

     sentence = inFromUser.readLine();
   
     outToServer.writeBytes(sentence);


  modifiedSentence = inFromServer.readLine();

  System.out.println("FROM SERVER: " + modifiedSentence);

  clientSocket.close();

 }

}
