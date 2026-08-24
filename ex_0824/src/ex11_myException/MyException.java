package ex11_myException;

public class MyException extends Exception{
    private String values;
    public MyException(String message){
        //super(message);부모한테 떠넘기기

        //넘어온 문자열의 시작("-")을 떼서 valuse에 저장
        values = message.substring(1);
    }

    public String getVelues(){
        return values;
    }

    public static void checkNegative(String str) throws MyException{
        if(str.startsWith("-")){
            throw new MyException(str);
        }
        //예외 검사 메소드에 static을 많이 만들필요없이 하나에 처리할 수 있음!
        // if (num <= 0) {
        //     throw new MyException("양수만 입력하세요.");
        // }
        
        // if (num > 50) {
        //     throw new MyException("50을 초과할 수 없습니다.");
        // }
        
        // if (num == 10) {
        //     throw new MyException("10은 입력할 수 없습니다.");
        // }
    }
}
