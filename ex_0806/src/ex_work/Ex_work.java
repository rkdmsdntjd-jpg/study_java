package ex_work;

public class Ex_work {

    public static void main(String[] args) {
        //나이가 15세 이상이거나 키가 150이상이면 탑승 가능, 그렇지 않으면 탑승 불가를 출력
        int age = 14;
        float cm = 161.8f;

        System.out.println("나이 : " + age + ", 키 : " + cm);

        if(age >= 15 || cm >= 150) System.out.println("탑승 가능");
        else System.out.println("탑승 불가");
    }
}
