package ex2_statement;

public class Ex1_switch {
    public static void main(String[] args) {
        //switch~case문: 비교값과 조건값을 통해서 원하는 레이블로 이동하여 진행
        //switch(value){
        //case 값:수행문
        //break;를 걸지않으면 다음 케이스로 계속 진행, 
        //default: 해당 레이블이 없을 경우 여기서부터 진행 }
        int n = 2;

        switch (n) {
            case 1://같은 조건값이 여러개일 경우 오류 발생
                System.out.println("게임시작");
                break;
            
            case 2:
                System.out.println("설정");
                break;

            case 3:
                System.out.println("종료");
                break;

            default:
                System.out.println("해당하는 레이블이 없을 경우 default부터 진행");
                break;
        }
    }
}
