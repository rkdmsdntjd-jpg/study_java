public abstract class SQLcommand {//DDL, DML, DCL 부모클래스 겸 추상클래스
    
    public abstract void execute(String[] parsedCommand);
}
