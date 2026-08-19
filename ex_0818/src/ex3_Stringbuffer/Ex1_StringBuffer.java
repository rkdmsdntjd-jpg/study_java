package ex3_Stringbuffer;

public class Ex1_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");//가변이라 기존 객체의 내용을 변경
        sb.setLength(0);
        sb.append("nice to meet you");
        sb.append("!!!");
        System.out.println(sb.toString());

        /*주요 메소드
        append() : 문자열 뒤에 추가
        insert() : 특정 위치에 삽입
        delete() : 범위의 문자열 삭제
        deleteCharAt() : 특정 문자 하나 삭제
        replace() : 특점 범위의 문자열 교체
        reverse() : 문자열뒤집기

        charAt() : 특정 위치의 문자 가져오기
        length() : 현재 문자열 길이

        capacity() : 현재 버퍼 용량
        setCharAt() : 특정 위치의 문자 변경
        toString() : String으로 변환               
         */

        //StringBuffer: 동기화지원, 여러 스레드에서 안전하게 사용
        //StringBuilder: 동기화 하지 않음, 일반적으로 더 빠름(멀티스레드 환경에서 공유하여 사용할 필요가 없다면 사용)
        //동기화(synchronization) : 여러 스레드가 동시에 같은 자원에 접근할 때, 충돌하지 않도록 순서를 조절하는 것
    }
}
