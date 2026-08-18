package chicken;

public class Kyochon {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        c1.order();

        Chicken c2 = new Chicken();//같은 클래스에서 다른 객체로 사용되는 것을 다형성이라 함.
        c2.setName("양념");
        c2.setPrice(10000);
        c2.order();
    }
}
