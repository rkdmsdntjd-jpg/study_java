package ex1_file;
import java.io.File;//파일/폴더의 정보와 경로를 다루는 클래스

public class Ex1_File {
    public static void main(String[] args) {
        //IO(InputOutput) : 입출력 스트림(Stream)
        /*
        Input(입력) → 프로그램 안으로 데이터를 가져오는 것
        Output(출력) → 프로그램 밖으로 데이터를 내보내는 것
        Stream(스트림) : 데이터가 이동하는 통로
        1. byte기반의 stream: 1byte단위로 데이터를 처리, 컴퓨터가 처리하기 좋은 형태
        InputStream
        OutputStream
        2. char기반의 stream: 문자 데이터를 다룰 때
        Reader
        │
        ├── FileReader
        └── BufferedReader

        Writer
        │
        ├── FileWriter
        └── BufferedWriter

        Buffered는 버퍼(임시 저장 공간)를 사용한다는 뜻

                    I/O
                    │
        ┌──────────┴──────────┐
        │                     │
        Byte                   Character
        │                     │
        ▼                     ▼
    InputStream               Reader
    OutputStream              Writer
        │                     │
        ├─ FileInputStream    ├─ FileReader
        ├─ BufferedInputStream├─ BufferedReader
        │                     │
        ├─ FileOutputStream   ├─ FileWriter
        └─ BufferedOutputStream└─ BufferedWriter
         */

        String path = "c:/java/ex_0827/text/test.txt";
        File f = new File(path);    

        if(f.isFile()){//내가 설정한 경로path가 파일인지 확인 = true
            System.out.println(f.length());//바이트단위로 크기 용량을 출력하는 코드
        }
    }
}
/*
exists()	    파일/폴더가 존재하는지
isFile()	    파일인지 확인
isDirectory()	폴더인지 확인

getName()	        파일/폴더 이름
getPath()	        지정한 경로
getAbsolutePath()	절대 경로
length()	        파일 크기(byte)
lastModified()	    마지막 수정 시간

createNewFile()	    새 파일 생성
mkdir()	            폴더 1개 생성
mkdirs()	        필요한 상위 폴더까지 생성
delete()	        파일/폴더 삭제
renameTo()	        이름 변경/이동

listFiles()     File 객체를 가져옴
list()          이름만(String) 가져옴
ex)파일 크기, 경로, 파일인지 폴더인지 같은 정보까지 필요할 때 다음과 같이 사용
for (File file : f.listFiles()) {
    System.out.println(file.getName());
    System.out.println(file.length());
}
*/