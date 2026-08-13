package ex_work;

import java.util.Arrays;

public class Ex000_work {
    //static final int BIG_ALPHABET = 10;  // ← 여기 선언하면 필드(field)라고 한다.
    //반대로 메소드안에 생성되면 지역 변수
    public static void main(String[] args) {
        int[] intArr = {100, 23, 55, 32, 7 };
        /*
        //참고: Arrays.stream(arr).max(); //자바에서 제공하는 최대값 찾는 간단한 방법        
        Arrays(클래스) : 배열을 다루는 여러 기능을 모아놓은 도구 상자
        stream() : Arrays의 static Method, arr는 매개변수로 전달
        stream() : 반환값이 Stream 객체-> 이 Stream 객체가 max()를 호출
        //즉 something.getA().getB().doSomething() 이런 형태
        //예시)char c = sc.nextLine().charAt(0);
         */

        final int HYPER_COUNT = 24;
        System.out.println("-".repeat(HYPER_COUNT));
        // . :멤버 접근 연산자(member access operator) or 점 연산자(dot operator)
        //ex)"-".repeat(24)
        
        //메소드 체이닝(method chaining) : 메소드의 반환값에 다시 .으로 메소드를 이어서 호출하는 것
        //ex) sc.nextLine().charAt(0)

        int max = Arrays.stream(intArr).max().orElse(0);//최대값이 있으면 쓰고 없으면 그냥 0을 써라
        int min = Arrays.stream(intArr).min().getAsInt();//getAsInt값이 존재한다고 확신할 때 사용
        /*값이 있는지 확인을 한 뒤에 처리하는 방식
        OptionalInt result = Arrays.stream(arr).max();

        if (result.isPresent()) {
            int max = result.getAsInt();
        } else {
            System.out.println("배열이 비어있습니다.");
        }
         */
        int sum = Arrays.stream(intArr).sum();//sum의 반환형은 int형.
        double avg = Arrays.stream(intArr).average().getAsDouble();
        System.out.printf("max %d, min %d, sum %d, average %f", max, min, sum, avg);
        //Ctrl + 클릭 / Ctrl + B 같은 정의로 이동을 하면 메소드 선언을 볼 수 있어.
    }
}
