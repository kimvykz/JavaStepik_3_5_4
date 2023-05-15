import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JOptionPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        JButton button = new JButton("click me");
        JPanel panel = new JPanel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JOptionPane.showInputDialog(panel, "do you learn Korean?");

                if (s == null) {
                    s = JOptionPane.showInputDialog(panel, "when will you start?");
                    if (s == null){
                        JOptionPane.showMessageDialog(null, "fucku");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "ok, got it");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(panel, s + " molodec");
                }
            }
        });

        panel.add(button);
        frame.getContentPane().add(panel);




        frame.setVisible(true);
    }
}
