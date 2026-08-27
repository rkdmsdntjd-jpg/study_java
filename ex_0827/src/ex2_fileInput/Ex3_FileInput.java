package ex2_fileInput;

public class Ex3_FileInput {
    public static void main(String[] args) {
        /*
        System.out → 콘솔로 출력
        System.in → 콘솔에서 입력
        System.err → 오류 메시지 출력
         */
        byte[] consols = new byte[100];

        try {
            System.out.print("Input Data : ");
            System.in.read(consols);

            String str = new String(consols);
            System.out.println(str.trim());//trim()은 문자열의 앞과 뒤에 있는 공백 문자를 제거

        } catch (Exception e) {
            
        }
    }
}