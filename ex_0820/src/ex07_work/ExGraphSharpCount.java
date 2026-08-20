package ex07_work;

public class ExGraphSharpCount {
    private StringBuilder sharp = new StringBuilder();//'#'추가할 공간
    private int cnt = 0;//개수 셀 변수

    public void addSharpCount(){//호출될때마다 cnt와 '#'이 증가(다른 클래스에서 직접 변경을 차단)
        sharp.append('#');
        cnt++;
    }

    public void printGraph(){//이 클래스가 가진 '#'개수와 cnt에 저장된 값을 출력
        System.out.print(sharp.toString() + " " + cnt);
        System.out.println();
    }
}
