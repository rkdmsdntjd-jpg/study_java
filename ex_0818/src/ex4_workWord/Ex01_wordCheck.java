package ex4_workWord;

public class Ex01_wordCheck {
    public String checkWord(String str){
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}
