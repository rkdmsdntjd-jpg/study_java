package ex1_multiArray;

public class Ex2_multiArr {
    public static void main(String[] args) {
        String[][] str = new String[2][2];
        str[0][0] = "hello.";
        str[0][1] = "java world!";
        str[1][0] = "안녕.";
        str[1][1] = "자바야!";

        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length; j++){
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
    }
}
