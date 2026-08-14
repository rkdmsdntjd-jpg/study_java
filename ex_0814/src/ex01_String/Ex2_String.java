package ex01_String;

public class Ex2_String {
    public static void main(String[] args) {
        String str = "홍길동";
        String str1 = "HongGildong";

        char c = str.charAt(0);
        int length = str.length();

        System.out.println(length);
        System.out.println(c);

        boolean b = str.equals("홍길동");       
        System.out.println(b);

        
        int num = str1.indexOf('G');
        System.out.println("G의 위치" + num);

        num = str1.lastIndexOf('o');
        System.out.println(num);

        String id = "001122-3345566";
        String id1 = "001122-334556-6";

        b = id.indexOf('-') == id1.lastIndexOf('-');

        String s1 = str1.substring(2, 5);
        System.out.println(s1);

        String a = "apple";
        if(a.equals("Apple"))
            System.out.println("참");

        if(a.equalsIgnoreCase("ApPlE"))
            System.out.println("대소문자를 신경쓰지 않음");

        String password = " 1111  ";
        String pwd = password.trim();//트림 공백지움
        System.out.println(pwd + "의 길이 " + pwd.length());

        String str2 = "123123";
        num = Integer.parseInt(str2);//int를 담는 상자Integer
        //Wrapper class
        //Boolean
        //Character
        //Byte
        //Short
        //Integer
        //Long
        //Float
        //Double

        String s = String.valueOf(num);
        System.out.println(str2 == s);//false
    }
}