package javalabassignment;

import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Handler;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JavaLabAssignment extends JFrame {

    private Container c;
    private JLabel label1;
    private static JTextField tf1, tf2, rtf;
    private static JButton add, sub, mul, div;

    JavaLabAssignment() {
        components();

    }

    public static void main(String[] args) {
        JavaLabAssignment frame = new JavaLabAssignment();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Lab Assignment");
        frame.setBounds(500, 200, 270, 500);
        frame.setResizable(false);
    }

    private void components() {
        c = this.getContentPane();
        c.setLayout(null);

        //TextField
        tf1 = new JTextField();
        tf1.setBounds(20, 20, 210, 50);//sets size (x,y,width,height)
        tf1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });
        c.add(tf1);//adding Textfield to Container

        tf2 = new JTextField();
        tf2.setBounds(20, 80, 210, 50);
        tf2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });
        c.add(tf2);

        //Buttons
        add = new JButton("Add");
        add.setBounds(20, 150, 100, 50);
        c.add(add);

        sub = new JButton("Subtract");
        sub.setBounds(130, 150, 100, 50);
        c.add(sub);

        mul = new JButton("Multiply");
        mul.setBounds(20, 210, 100, 50);
        c.add(mul);

        div = new JButton("Divide");
        div.setBounds(130, 210, 100, 50);
        c.add(div);

        //Result Text Field
        rtf = new JTextField();
        rtf.setBounds(20, 270, 210, 50);
        rtf.setEditable(false);
        c.add(rtf);

        MultipleActionListner mal = new MultipleActionListner();
        add.addActionListener(mal);
        sub.addActionListener(mal);
        mul.addActionListener(mal);
        div.addActionListener(mal);

    }

    private static class MultipleActionListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String a, b;
            a = tf1.getText().toString().toLowerCase();
            int input1, input2;
            input1 = Integer.parseInt(tf1.getText().toString());
            input2 = Integer.parseInt(tf2.getText().toString());

            try {

                if (e.getSource() == add) {
                    rtf.setText("");
                    int x = input1 + input2;
                    rtf.setText("" + x);

                } else if (e.getSource() == sub) {
                    rtf.setText("");
                    int x = input1 - input2;
                    rtf.setText("" + x);

                } else if (e.getSource() == mul) {
                    rtf.setText("");
                    int x = input1 * input2;
                    rtf.setText("" + x);

                } else {
                    rtf.setText("");
                    if (input1 > input2) {
                        int x = input1 / input2;
                        rtf.setText("" + x);

                    } else if (input1 < input2) {
                        int x = input2 / input1;
                        rtf.setText("" + x);

                    } else {
                        int x = input1 / input2;
                        rtf.setText("" + x);
                    }

                }

            } catch (Exception ex) {

            }

        }
    }

}
