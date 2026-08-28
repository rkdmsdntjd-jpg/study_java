package ex1_ObjStream;

import java.io.Serializable;//출입증

public class User implements Serializable{
    //이 객체를 파일이나 다른 곳에 저장할 수 있도록 허용하는 마커 인터페이스 구현
    //직렬화(Serializable)/역직렬화(Deserialization)가 가능하다는 표시!
    private String name;
    private String tel;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
    public int getAge() {
        return age;
    }
}
