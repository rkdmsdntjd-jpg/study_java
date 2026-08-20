package ex01_work;

public class Ex02_NumberMain {
    public static void main(String[] args) {
        String[] str = {
            "1234", "9x8y",
            "0x1F", "0X1F", "0x1G",
            "0b10", "0B10", "0b12",
            "0127", "0129"
        };
        Ex02_NumberSub ns = new Ex02_NumberSub();
        for (int i = 0; i < str.length; i++) {
            ns.baseNumber(str[i]);
        }
    }
}
