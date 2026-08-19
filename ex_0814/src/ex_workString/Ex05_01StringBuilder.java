package ex_workString;

public class Ex05_01StringBuilder {
    public static void main(String[] args) {
        String str1 = "HelloJavaWorld";

        StringBuilder str2 = new StringBuilder();
        //문자열을 계속 만들고 수정할 때 쓰는 java.lang의 클래스
        /*StringBuilder의 주요 메소드
        append(): 문자열 뒤에 이어붙이기
        insert(n, "str") : index n위치에 "str"을 삽입
        delete(n, m) : n이상 m미만 범위를 삭제
        deleteCharAt(n) : index n위치의 문자하나 삭제
        reverse() : 문자열을 뒤집는 메소드
        toString() : String으로 변환
        length() : 현재 들어있는 문자열의 길이 반환
         */

        for (int i = 0; i < str1.length(); i += 2) {
            str2.append(str1.charAt(i));
        }
        System.out.println(str2);
    }
}
