package Computer;

public class Computer {
    //속성, 멤버
    private String brand, color;
    private int ssd = 512, ram = 256;
    private float cpu = 1.8f;
    //생성자
    public Computer(){
       brand = "samsung";
       color = "white";
    }

    public Computer(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    //메소드: 작업을 수행하기 위한 명령문들의 집합
    public void printInfo() {
        System.out.println("-------------------------------");
        System.out.println("브랜드\t" + brand);
        System.out.println("CPU\t" + cpu);
        System.out.println("SSD\t" + ssd);
        System.out.println("RAM\t" + ram);
        System.out.println("색상\t" + color);
        System.out.println("-------------------------------");
    }
    //접근제어자 반환형 메소드명(인자, 매개변수){ 메소드 실행 영역 }
    //public : 같은 프로젝트 내의 모든 객체에게 사용을 허가
    //private : 클래슨 내부에서 사용허가
    //protected : 동일 패키지 + 상속 관계까지 허가
    //default : 동일 패키지 내 허용
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }


}
