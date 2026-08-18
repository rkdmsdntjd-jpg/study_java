package Computer;

public class ComMain {
    public static void main(String[] args) {
        Computer cpt1 = new Computer();//생성자 호출, 명시적 객체 생성   
        cpt1.printInfo();
        
        Computer cpt2 = new Computer();//cpt1과 다른 인스턴스
        cpt2.setBrand("Apple");
        cpt2.setColor("Silver");        
        cpt2.printInfo();//메소드 호출
        
        Computer cpt3 = new Computer("LG", "black");//생성자 오버로딩 가능
        cpt3.printInfo();
    }
}
