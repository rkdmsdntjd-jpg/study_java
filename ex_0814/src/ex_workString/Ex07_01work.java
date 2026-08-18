package ex_workString;

public class Ex07_01work {
    public static void main(String[] args) {
        String[] str = { "0x1AF", "0X1AF", "0x1AG" };
        
        
        for (int i = 0; i < str.length; i++) {
            boolean b = true;
            if(!(str[i].startsWith("0x")) || str[i].length() <= 2){
                b = false;
            }
            else{
                for(int j = 2; j < str[i].length(); j++){
                    char c = str[i].charAt(j);
                    
                    if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))){
                        b = false;
                        break;
                    }
                }
            }
            if(b)
                System.out.println(str[i] + "는 16진수가 맞습니다.");
            else
                System.out.println(str[i] + "는 16진수가 아닙니다.");
        }

    }
}
