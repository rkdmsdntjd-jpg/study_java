package ex2_SetGet;

public class Ex1_Person {
    private String gender, name;
    private int age;

    public Ex1_Person(){}//디폴트 생성자
    public Ex1_Person(String name, String gender, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
    //매개변수가 있는 생성자를 하나라도 직접 만들면,
    //기본 생성자를 자동으로 만들어주지 않음

    //setter: 변경 방법을 통제하는 것
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
