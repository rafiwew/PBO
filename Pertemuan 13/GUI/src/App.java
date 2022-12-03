import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Create label
        JLabel lblJudul = new JLabel("Home");
        lblJudul.setHorizontalTextPosition(JLabel.CENTER);
        JLabel lblJenisTanaman = new JLabel("Jenis Tanaman");
        lblJenisTanaman.setHorizontalTextPosition(JLabel.CENTER);

        //Create text field
        JTextField txt = new JTextField(10);
        txt.setSize(100, 150);

        //Create button
        JButton btnGetStarted = new JButton("Get Started");
        btnGetStarted.setVerticalTextPosition(AbstractButton.BOTTOM);
        btnGetStarted.setHorizontalTextPosition(AbstractButton.CENTER);

        //Create panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.add(lblJudul);
        panel.add(btnGetStarted, BorderLayout.PAGE_END);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.add(lblJenisTanaman);
        panel2.add(txt);
        
        //Create and set up the window.
        JFrame frmHome = new JFrame("EcoPal Apps");
        frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmHome.setSize(400, 600);
        frmHome.getContentPane().add(panel, BorderLayout.CENTER);

        JFrame frmLayanan = new JFrame("Layanan EcoPal");
        frmLayanan.setSize(400, 600);
        frmLayanan.getContentPane().add(panel2, BorderLayout.CENTER);

        //Display the window.
        frmHome.pack();
        frmHome.setVisible(true);

        btnGetStarted.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmLayanan.setVisible(true);
                frmHome.setVisible(false);
            }
         });
    }
}
