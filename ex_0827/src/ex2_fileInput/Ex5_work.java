package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_work {
    public static void main(String[] args) {
        String path = "C:/java/ex_0827/myFile/work2.txt";
        File file = new File(path);
        byte[] letter = new byte[(int)file.length()];
        FileInputStream inStream = null;

        try {//시간복잡도O(n), 추가 메모리 공간 O(1), 조기 종료
            inStream = new FileInputStream(file);
            inStream.read(letter);
            String str = new String(letter).trim();

            boolean check = true;
            
            for (int i = 0, j = str.length() - 1 ; i < j ; i++, j--) {
                if(str.charAt(i) != str.charAt(j)){
                    check = false;
                    break;
                }
            }
            
            if(check){
                System.out.println(str + "회문입니다.");
            }
            else{
                System.out.println(str + "회문이 아닙니다.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inStream != null)
                    inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}