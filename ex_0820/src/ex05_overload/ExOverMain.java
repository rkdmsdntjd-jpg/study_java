package ex05_overload;

public class ExOverMain {
    public static void main(String[] args) {
        ExOverSub os1 = new ExOverSub();
        ExOverSub os2 = new ExOverSub(1, 2);//생성자를 선언했으면 디폴트 생성자를 따로 정의해줘야 사용가능
        //오버로딩: 중복정의(단, 매개 인자 개수나 타입이 달라야한다.)
        //매개변수가 같은데, 리턴 타입이 다를 경우는 성립하지 않는다.

        os1.reslult();
        os1.reslult(3);
        os2.reslult(1, 2.9f);
        os2.reslult(2.9f, 1);
        System.out.println(os2.result("이것도 가능하긴 ", '함'));

        String s = "hello";
        s.indexOf('e');
        s.indexOf(0);
        //몇번째부터 s나 0을 찾을래
        System.out.println(s.indexOf('l', 3));
        System.out.println(s.indexOf(2, 0));
    }
}
