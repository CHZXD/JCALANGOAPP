package br.com.jcalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class JSplash extends JFrame {
    public JSplash(){
        setTitle("JKalango Splash");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        JButton startJButton = new JButton("Start");
        add(startJButton);

        startJButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
        
                JOptionPane.showMessageDialog(JSplash.this, "Jcalango");
        
                
            }
            
        });
        setVisible(true);
    }
    
    



}
