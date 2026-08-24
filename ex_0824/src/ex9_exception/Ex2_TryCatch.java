package ex9_exception;

public class Ex2_TryCatch {
    public static void main(String[] args) {
        int res = 0;
        int[] arr = { 1, 2, 3 };

        try {
            res = 10 / 0;
            System.out.println(res);
            arr[3] = 100;

        } catch (Exception e) {//현재 발생할 수 있는 모든 예외를 잡아준다.
            // TODO: handle exception
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally{

            //예외 여부와 상관없이 반드시 실행되는 영역
            System.out.println("finally");
        }
        System.out.println("프로그램 정상 종료");
    }
}
