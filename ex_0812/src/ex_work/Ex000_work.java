package ex_work;

import java.util.Arrays;

public class Ex000_work {
    public static void main(String[] args) {
        int[] intArr = {100, 23, 55, 32, 7 };

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
