import java.util.Scanner;

public class DBMScontroller {
    //역할을 시키는 관리자
    public void dbRun(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
            //명령어 입력
            
            String command = inputCommand(sc);
            //예시
            //CREATE TABLE users (
            //    user_id INT PRIMARY KEY,
            //    username VARCHAR(50) NOT NULL,
            //    email VARCHAR(100) UNIQUE,
            //    age INT,
            //    created_at DATE
            //);
            
            //종료조건
            if(command.startsWith("OUT")){
                sc.close();
                return;
            }

            //명령어 분석
            SQLparser ps = new SQLparser();
            String[] parsedCommand = ps.parser(command);
            SQLcommand cmd = ps.analyze(parsedCommand);

            cmd.execute(parsedCommand);//실제 명령어 실행 클래스로 전달

        }
    }
    
    public String inputCommand(Scanner sc){//명령어 입력받는 메소드
        System.out.print("---SQL command를 입력하십시오.----------");
        System.out.print("---OUT을 입력하면 프로그램을 종료합니다.---");
        System.out.print("입력 : ");
        String s = sc.nextLine();
        return s;
    }
}
