package ex3_ClassArray;
//Shift + Alt + o
public class Ex1_Person {
    private int age;
    private String name;

    public Ex1_Person(){}//default 생성자

    public Ex1_Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    //방법1: ctrl + k -> 'setter랑 getter 생성'
    //방법2: 우클릭 -> Source Action -> Generate Getters and Setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
