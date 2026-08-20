package ex06_work;

public class ExMakeBread {
    public void bakeBread(){
        System.out.println("빵을 만들었습니다.");
    }
    public void bakeBread(int num){
        for (int i = 0; i < num; i++) {
            bakeBread();
        }
        System.out.printf("요청하신 %d개의 ", num);
        bakeBread();
    }
    public void bakeBread(int num, String name){
        for (int i = 0; i < num; i++) {
            System.out.print(name);
            bakeBread();
        }
        System.out.printf("요청하신 %d개의 %s", num, name);
        bakeBread();      
    }
}
