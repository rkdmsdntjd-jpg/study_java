package ex3_ClassArray;

public class Ex1_PersonMain {
    public static void main(String[] args) {
        Ex1_Person[] p1 = new Ex1_Person[2];
        //클래스 배열은 각각의 인덱스로 접근해서 새로 메모리 할당을 받아야 한다.
        //p1[0] = new Ex1_Person();//반드시 각 index의 객체화가 필수
        //p1[1] = new Ex1_Person();
        for (int i = 0; i < p1.length; i++) {
            p1[i] = new Ex1_Person();
        }
        p1[0].setAge(20);
        p1[0].setName("Hong Gildong");

        p1[1].setAge(25);
        p1[1].setName("Kim Gildong");

        for (int i = 0; i < p1.length; i++) {
            System.out.printf("%s \t/ %d\n",p1[i].getName(), p1[i].getAge());
        }
        
    }
}
