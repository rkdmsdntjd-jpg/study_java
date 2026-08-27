import java.util.HashSet;
import java.util.Set;

public class DDL extends SQLcommand{
    private Set<String> s;

    public DDL(){
        s = new HashSet<>();
        s.add("INT");
        s.add("VARCHAR");
        s.add("FLOAT");
    }
    /*
    DDL
    │
    ├── 속성 관리
    │    ├── 추가
    │    ├── 삭제
    │    └── 변경
    │
    └── 테이블 관리
         ├── 생성
         └── 삭제/변경

     */
    @Override
    public void execute(String[] command){
        String[] str1 = { "CREATE TABLE a", "number INT PRIMARY KEY", "name VARCHAR(50) NOT NULL"};
        String[] str2 = { "ALTER TABLE a ADD", "age INT"};
        String[] str3 = { "DROP TABLE a", "RESTRICT"};
        //1. 자료형이 있는지 검사. 있으면 속성(이름 자료형 ... 구조)
        for (int i = 0; i < str1.length; i++) {
            if (s.contains(str1[i])) {//여기 걸리면 속성
                if(str1[0].startsWith("ALTER") && !str1[0].contains("ADD")){
                    //Alter로 시작하되 문자열에 ADD가 없으면 속성 삭제나 변경
                }
                //나머지는 전부 속성 삽입(추가)
            }
            //if문에 걸리지 않았다면 table 삭제
        }

    }
}
