package Management_Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin ;
    JTextField textField;
    JButton b1,b2;
    Deposit(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1500,800);
        add(l1);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("Raleway",Font.BOLD,16));
        label1.setBounds(490,180,400,35);
        label1.setForeground(Color.white);
        l1.add(label1);

        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(490,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l1.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(715,391,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(715,435,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l1.add(b2);

        setSize(1600,1100);
        setLocation(0,0);
        setVisible(true);
        setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String ammount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
                }else {
                    Connect con = new Connect();
                    con.stmt.executeUpdate("Insert into bank values ('"+pin+"','"+date+"','Deposit','"+ammount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+ammount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
                }else if(e.getSource()==b2){
                setVisible(false);
                new main_Class(pin);
            }

        }catch (Exception E){
            System.out.println(E);
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }


}


