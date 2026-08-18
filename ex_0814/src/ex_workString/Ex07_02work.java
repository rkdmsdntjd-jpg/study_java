package ex_workString;

public class Ex07_02work {
    public static void main(String[] args) {
        String[] str = {
            "1234", "9x8y",
            "0x1F", "0X1F", "0x1G",
            "0b10", "0B10", "0b12",
            "0127", "0129"
        };
        for (int i = 0; i < str.length; i++) {
            boolean b = true;
            String type;
            if(str[i].startsWith("0x")){//16진수
                for(int j = 2; j < str[i].length(); j++){
                    
                }
            }
            else if(str[i].startsWith("0b")){//2진수
                for(int j = 2; j < str[i].length(); j++){

                }
            }
            else if(str[i].startsWith("0")){//8진수
                for(int j = 2; j < str[i].length(); j++){

                }
            }
            else{//10진수
                for(int j = 2; j < str[i].length(); j++){

                }
            }

        }
    }
}
