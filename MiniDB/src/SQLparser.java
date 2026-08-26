import java.util.StringTokenizer;

public class SQLparser {
    //int index = str.indexOf(" ADD ");
    //int index = str.indexOf(" TO ");
    //정규식(Pattern, Matcher)

    private final int LANGUAGE_INDEX = 0;
    
    public String[] parser(String command){//역할: 문자열 쪼개기
        String[] str = command.split(" ");
        return str;
    }
    
    //문자열 그룹핑
    public String[] parsedToken(String command){
        StringTokenizer st = new StringTokenizer(command, "(,)");
        String[] str = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            str[i++] = st.nextToken();
        }
        return str ;
    }

    

    public SQLcommand analyze(String[] parsedCommand){//역할: 쪼개진 배열을 보고 이게 무슨 종류의 SQL인지 판단.
        switch (parsedCommand[LANGUAGE_INDEX]) {
            case "CREATE":
            case "ALTER":
            case "DROP":
                return new DDL();
            
            case "SELECT":
            case "INSERT":
            case "UPDATE":
            case "DELETE":                
                return new DML();
            
            case "GRANT":
            case "REVOKE":
                return new DCL();

            default:
                throw new IllegalArgumentException("잘못된 SQL 명령어입니다.");
        }
    }
}
