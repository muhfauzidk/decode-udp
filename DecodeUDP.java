/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decode.udp;

import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author UZI
 */
public class DecodeUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Input UDP header in hexadecimal: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String substr = "";
        
        System.out.println("");
        
        // source port number from first 4 digits hexadecimal
        substr = str.substring(0, 4);
        System.out.print("sourcePort(" + substr + ")16: ");
        System.out.println(Integer.parseInt(substr, 16));  // hex to decimal

        // destination port number from second 4 digits hexadecimal
        substr = str.substring(4, 8);
        System.out.print("destinationPort(" + substr + ")16: ");
        System.out.println(Integer.parseInt(substr, 16));  // hex to decimal
        
        // user datagram length from third 4 digits hexadecimal
        substr = str.substring(8, 12);
        System.out.print("userDatagramLength(" + substr + ")16: ");
        System.out.println(Integer.parseInt(substr, 16) + " bytes");  // hex to decimal
        
        // data length
        int dataLength = Integer.parseInt(substr, 16) - 8; //
        System.out.println("dataLength: " + dataLength + " bytes");
    }
}           
