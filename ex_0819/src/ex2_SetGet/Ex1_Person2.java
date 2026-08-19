package ex2_SetGet;

public class Ex1_Person2 {
    private String name;
    private int age;

    public void setInfo(String name, int age){
        this.name = name;//this현재 내 클래스의 멤버
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
