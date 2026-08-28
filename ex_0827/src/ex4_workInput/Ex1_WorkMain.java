package ex4_workInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex1_WorkMain {
    public static void main(String[] args) {
        File file = new File("C:/java/ex_0827/myFile/work3.txt");
        byte[] letter = new byte[(int)file.length()];
        FileInputStream inStream = null;
        Scanner sc = new Scanner(System.in);

        try {
            inStream = new FileInputStream(file);
            inStream.read(letter);
            String str = new String(letter).trim();

            System.out.print("입력 >> ");
            char inChar = sc.next().charAt(0);

            int letterCount = 0;

            // for (char c : str.toCharArray()) { //추가 메모리: O(n)
            //     if(c == inChar){
            //         letterCount++;
            //     }
            // }

            for (int i = 0; i < str.length(); i++) {//시간복잡도는 동일, 추가 메모리: O(1)
                if(inChar == str.charAt(i)){
                    letterCount++;
                }
            }

            System.out.printf("%c의 출현 횟수 : %d\n", inChar, letterCount);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
            try {
                if(inStream != null)
                    inStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}