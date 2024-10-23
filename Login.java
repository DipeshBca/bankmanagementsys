package Management_Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JTextField t2;
    JPasswordField p1;


    public Login() {

        super("Bank Management System");

        // FOR IMAGES

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(350, 10, 100, 100);
        add(l1);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel l2 = new JLabel(ii3);
        l2.setBounds(630, 350, 100, 100);
        add(l2);

        // FOR JLABELS

        JLabel jl1 = new JLabel("WELCOME TO ATM");
        jl1.setBounds(250, 125, 450, 40);
        jl1.setForeground(Color.white);
        jl1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        add(jl1);

        JLabel jl2 = new JLabel("Card No:");
        jl2.setFont(new Font("Ralway", Font.BOLD, 28));
        jl2.setForeground(Color.white);
        jl2.setBounds(150, 190, 375, 30);
        add(jl2);

        // FOR JTEXT

        t2 = new JTextField(15);
        t2.setBounds(325, 190, 230, 30);
        t2.setFont(new Font("Arial", Font.BOLD, 14));
        add(t2);

        // FOR JLABELS

        JLabel jl3 = new JLabel("Pin: ");
        jl3.setFont(new Font("Ralway", Font.BOLD, 28));
        jl3.setForeground(Color.white);
        jl3.setBounds(150, 250, 375, 30);
        add(jl3);

        // FOR PASSWORD FIELD
        p1 = new JPasswordField(15);
        p1.setBounds(325, 250, 230, 30);
        p1.setFont(new Font("Arial", Font.BOLD, 14));
        add(p1);

        // FOR BUTTONS

        b1 = new JButton("SIGN IN");
        b1.setBounds(300, 300, 100, 30);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CLEAR");
        b2.setBounds(430, 300, 100, 30);
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("SIGN UP");
        b3.setBounds(300, 350, 230, 30);
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.addActionListener(this);
        add(b3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel l3 = new JLabel(iii3);
        l3.setBounds(0, 0, 850, 480);
        add(l3);
        setUndecorated(true);
        setLocation(450, 200);
        setLayout(null);
        setSize(850, 480);
        setVisible(true);

       // setDefaultCloseOperation(EXIT_ON_CLOSE);

}
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
                if(e.getSource() == b1){

                    Connect con = new Connect();
                    String cardno = t2.getText();
                    String pin = p1.getText();
                    String q = "select * from login where card_number = '"+cardno+"'and pin = '"+pin+"'";
                    ResultSet resultSet = con.stmt.executeQuery(q);
                    if (resultSet.next()){
                        setVisible(false);
                        new main_Class(pin);
                    }else {
                        JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");

                    }

                } else if (e.getSource() == b2) {
                    t2.setText("");
                    p1.setText("");
                } else if (e.getSource() == b3) {
                    new Signup();
                    setVisible(false);
                }
        }
        catch (Exception E){

            
        }
    }
        public static void main(String[] args) {
new Login();
}


}