package ex01_String;

public class Ex3_String {
    public static void main(String[] args) {
        String[] id = { "001122-3345566", "001122-,-3345566", "00112233445566" };
        //for (int i = 0; i < id.length; i++) {
        //    if(id[i].trim().length() != 14 || id[i].trim().charAt(6) != '6'){
        //        System.out.println("error code 040");
        //    }

            String year = id[0].substring(0, 2);
            String month = id[0].substring(2, 4);
            String day = id[0].substring(4, 6);
            
            int n = Integer.parseInt(id[0].substring(7, 8));
            char gender;
            if(n%2 != 0)
                gender = '남';
            else
                gender = '여';
            System.out.printf("%s년 %s월 %s일 생 : %c", year, month, day, gender);
        
        
    }
}
