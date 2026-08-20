package ex02_work;

public class Ex_EncodeSub {
    private char[] alphabetCode = {
        '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}',
        ';', ':', ',', '.', '/'    
    };
    private char[] numberCode = {
        'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'p'
    };

    public String encoding(String str){
        StringBuilder strbd = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                strbd.append(alphabetCode[c - 'a']);
            }
            else if(c >= '0' && c <= '9'){
                strbd.append(numberCode[c - '0']);
            }
            else{
                strbd.append('0');
            }
        }
        return strbd.toString();
    }
}
