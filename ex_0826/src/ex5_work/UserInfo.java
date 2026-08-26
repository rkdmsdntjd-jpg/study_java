package ex5_work;

public class UserInfo {
    private String id;
    private int password;

    public UserInfo(String id, int password){
        this.id = id;
        this.password = password;
    }
    
    public String getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }
}
