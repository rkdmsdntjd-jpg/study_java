package ex5_lable;

public class Ex1_lable {
    public static void main(String[] args) {
        //특정 반복문에 lable을 붙여서 한 번에 2개 이상의 반복문을 제어할 수 있다.

        out://break를 만나면 사용자가 정의한 레이블'out'으로 이동(이름은 out이 아니어도 됨, abc:라고 정의해도 됨)
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 10; j++){
                if(j % 2 == 0) break out;//단, abc: 라고 레이블을 지정했으면 break abc;가 되어야 함
                //out이라는 이름을 가진 레이블로 반복문을 나간다는 의미.
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
