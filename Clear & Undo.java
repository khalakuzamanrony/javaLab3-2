package javalabassignment;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClearUndo extends JFrame {

    private Container c;
    private static JTextField tf1;
    private static JButton clear, undo;
    private static String m;

    ClearUndo() {
        components();
    }

    public static void main(String[] args) {
        ClearUndo frame = new ClearUndo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Lab Assignment");
        frame.setBounds(500, 200, 270, 500);
        frame.setResizable(false);

    }

    private void components() {
        c = this.getContentPane();
        c.setLayout(null);
        //Text Field
        tf1 = new JTextField();
        tf1.setBounds(20, 20, 210, 50);//sets size (x,y,width,height)
        c.add(tf1);

        //Buttons
        clear = new JButton("Clear");
        clear.setBounds(20, 80, 100, 50);
        c.add(clear);

        undo = new JButton("Undo");
        undo.setBounds(130, 80, 100, 50);
        c.add(undo);

        //Adding Action Listener with the buttons
        MyActionListener mal = new MyActionListener();
        clear.addActionListener(mal);
        undo.addActionListener(mal);

    }

    private static class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clear) {
                m = tf1.getText().toString();

                tf1.setText("");
            } else {
                tf1.setText(m);

            }
        }
    }
}
