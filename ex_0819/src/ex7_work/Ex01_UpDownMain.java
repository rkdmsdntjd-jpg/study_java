package ex7_work;

public class Ex01_UpDownMain {
    public static void main(String[] args) {
        //1~50사이의 난수에서 입력받은 정수와 난수 비교하기
        Ex01_UpDownSub ud = new Ex01_UpDownSub();
        ud.playUpDown(ud.ranNum(1, 50));
    }
}
