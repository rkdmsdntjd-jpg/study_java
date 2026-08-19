package ex2_SetGet;

public class Ex1_PersonMain {
    public static void main(String[] args) {
        Ex1_Person p1 = new Ex1_Person();
        p1.setGender("남자");
        p1.setName("홍길동");
        p1.setAge(20);

        System.out.println(p1.getName() + "\t" + p1.getGender() + "\t" + p1.getAge());
        
        Ex1_Person[] p = {
            new Ex1_Person("홍길동", "남자", 20),
            new Ex1_Person("이말년", "남자", 30),
            new Ex1_Person("아무개", "여자", 40),
        };
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getName() + "\t" + p[i].getGender() + "\t" + p[i].getAge());
        }
    }
}
