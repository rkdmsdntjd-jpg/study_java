package src.ui.form;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

public class FormField extends JPanel{

    private int l = 120;
    private int f = 210;
    private int h = 40;

    private JTextField tf;
    private JLabel lb;

    public FormField(String text){//텍스트필드 생성자
        setLayout(null);
        setOpaque(false);

        lb = new JLabel(text, SwingConstants.CENTER);
        lb.setBounds(0, 0, l ,h);

        lb.setFont(new Font("나눔고딕", Font.BOLD, 15));
        lb.setForeground(Form.TEXT); 

        tf = new JTextField();
        tf.setBounds(l, 0, f ,h);

        tf.setForeground(Form.TEXT);// 입력하는 글자색
        tf.setCaretColor(Form.BLUE);// 깜빡이는 커서색
        tf.setBorder(null);

        tf.setFont(new Font("나눔고딕", Font.PLAIN, 16));

        add(lb);
        add(tf);
    }
    public FormField(String text, boolean pw){//패스워드필드 생성자
        setLayout(null);
        setOpaque(false);

        lb = new JLabel(text, SwingConstants.CENTER);
        lb.setBounds(0, 0, l ,h);

        lb.setFont(new Font("나눔고딕", Font.BOLD, 16));
        lb.setForeground(Form.TEXT); 

        tf = new JPasswordField();
        tf.setBounds(l, 0, f ,h);

        tf.setForeground(Form.TEXT);// 입력하는 글자색
        tf.setCaretColor(Form.BLUE);// 깜빡이는 커서색
        tf.setBorder(null);

        tf.setFont(new Font("나눔고딕", Font.PLAIN, 16));

        add(lb);
        add(tf);
    }
    
    //getter
    public String getText(){
        return tf.getText();
    }
    
    public String getPassword() {
        char[] c = ((JPasswordField) tf).getPassword();
        String password = String.valueOf(c);
        return password;
    }

    public JTextField getJTF(){
        return tf;
    }

    public void onlyNumber() {//숫자만 입력받는 메소드
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
    
                if (!Character.isDigit(c))
                    e.consume();
            }
        });
    }
}