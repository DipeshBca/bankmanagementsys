package Management_Bank;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

        JTextField textName,textFName,textEmail,textMS,textadd,textCity,textPin,textState;

        JRadioButton r1,r2,m1,m2,m3;
        JButton next;

        JDateChooser dateChooser;
        Random ran = new Random();
        long first4 = (ran.nextLong() % 9000L) + 1000L;
        String first = " " +Math.abs(first4);
    Signup(){

        super("APPLICATION FORM");

        // FOR IMAGES

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(25, 10, 100, 100);
        add(l1);

        JLabel jl1 = new JLabel("APPLICATION FORM NO." + first);
        jl1.setFont(new Font("Raleway",Font.BOLD,38));
        jl1.setBounds(160,20,600,40);
        add(jl1);

        JLabel l2 = new JLabel("Page 1");
        l2.setBounds(330,70,600,30);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("Personal Details");
        l3.setBounds(290,90,600,30);
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        add(l3);

        JLabel ln = new JLabel("Name :");
        ln.setFont(new Font("Raleway",Font.BOLD,22));
        ln.setBounds(100,190,100,30);
        add(ln);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel lnf = new JLabel("Father's Name :");
        lnf.setFont(new Font("Raleway",Font.BOLD,22));
        lnf.setBounds(100,240,200,30);
        add(lnf);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,340,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel Gen = new JLabel("Gender :");
        Gen.setFont(new Font("Raleway",Font.BOLD,22));
        Gen.setBounds(100,290,200,30);
        add(Gen);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);


        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,22));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);


        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway",Font.BOLD,22));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);


        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(450,440,100,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(635,440,90,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,22));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,22));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,22));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,22));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next ->");
        next.setBounds(620,710,90,30);
        next.setBackground( Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setSize(850,800);
        setLocation(350,40);
        setLayout(null);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formnoname = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";
        }
        String email = textEmail.getText();
        String marital_status =null;
        if(m1.isSelected()){
            marital_status = "Married";
        } else if (m2.isSelected()) {
            marital_status = "Unmarried";
        } else if (m3.isSelected()) {
            marital_status = "Other";
        }
        String address = textadd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connect con1 = new Connect();
                String q = "insert into signup values('"+formnoname+"','"+name+"','"+fname+"','"+DOB+"','"+gender+"','"+email+"','"+marital_status+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.stmt.executeUpdate(q);
                new Signup2(formnoname);
                setVisible(false);
            }
        }catch (Exception E){
            System.out.println(E);
        }
       // setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Signup();
    }


}

