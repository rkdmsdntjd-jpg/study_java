package ex2_socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        try {
            Socket s = new Socket("192.168.0.26",3000);

            try (
                PrintWriter pw = new PrintWriter(s.getOutputStream());
                ) {
                while (true) {
                    
                    System.out.print("입력 >> ");
                    String msg = sc.nextLine();

                    pw.println(msg);       
                    pw.flush(); 
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
