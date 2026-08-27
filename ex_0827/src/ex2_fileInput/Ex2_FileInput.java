package ex2_fileInput;
import java.io.File;
import java.io.FileInputStream;

public class Ex2_FileInput {
    public static void main(String[] args) {
        String path = "C:/java/ex_0827/myFile/test.txt";// 읽어올 파일의 경로를 문자열로 저장

        // 위에서 지정한 경로를 이용해서 File 객체 생성
        // 실제 파일을 읽는 것은 아니고, 파일의 정보를 다룰 수 있는 객체를 만드는 것
        File f = new File(path);

        // 파일의 크기만큼 byte 배열을 생성
        // f.length() : 파일의 크기를 byte 단위로 반환
        // (int) : long 타입인 f.length()를 int 타입으로 형변환

        byte[] read = new byte[(int)f.length()];
        // FileInputStream 객체를 저장할 변수 선언
        // 아직 파일과 연결하지 않았기 때문에 일단 null로 초기화
        FileInputStream fis = null;

        if(f.exists()){// 해당 경로에 실제 파일이 존재하는지 확인
            try {
                // FileInputStream을 이용해서 파일과 연결
                // 이제 fis를 통해 파일의 내용을 읽을 수 있음
                fis = new FileInputStream(f);

                // 파일의 데이터를 읽어서 read 배열에 저장
                // 파일의 내용을 byte 형태로 읽어옴
                fis.read(read);

                // byte 배열에 들어있는 데이터를 String으로 변환
                // 여기서 인코딩을 지정하지 않으면 운영체제의 기본 인코딩을 사용함
                String res = new String(read);
                
                System.out.println(res);// 변환한 문자열을 콘솔에 출력

            } catch (Exception e) {
                // 파일을 읽는 과정에서 오류가 발생했을 때 실행
            }
            finally{
                // 파일 스트림을 닫아주는 용도로 사용
                try {
                    // fis가 null이 아닌지 확인
                    // 파일 연결이 정상적으로 이루어진 경우에만 close() 실행
                    if (fis != null) {
                        // 파일과 연결된 스트림을 닫음
                        // 사용한 자원을 정리하는 과정
                        fis.close();
                    }
                } catch (Exception e) {
                    // 스트림을 닫는 과정에서 오류가 발생했을 때 실행
                }
            }
        }
    }
}