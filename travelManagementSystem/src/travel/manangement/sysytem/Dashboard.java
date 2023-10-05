package travel.manangement.sysytem;
//import java.sql.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton JB1,JB2,JB3,JB4,JB5,JB6,JB7,JB8,JB9,JB10,JB11,JB12,JB13,JB14,JB15;

    Dashboard(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,2000,65);
        add(p1);


        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);


        JB1  =new JButton("Add Personal Details");
        JB1.setBounds(0,0,300,50);
        JB1.setBackground(new Color(0,0,102));
        JB1.setForeground(Color.WHITE);
        //JB1.setBorder(new LineBorder(new Color(0,158,204)));
        JB1.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB1.setMargin(new Insets(0,0,0,90));
        JB1.addActionListener(this);
        p2.add(JB1);


        JB2  =new JButton("Update Personal Details");
        JB2.setBounds(0,50,300,50);
        JB2.setBackground(new Color(0,0,102));
        JB2.setForeground(Color.WHITE);
        //JB2.setBorder(new LineBorder(new Color(0,158,204)));
        JB2.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB2.setMargin(new Insets(0,0,0,60));
        JB2.addActionListener(this);
        p2.add(JB2);



        JB3  =new JButton("View Details");
        JB3.setBounds(0,100,300,50);
        JB3.setBackground(new Color(0,0,120));
        JB3.setForeground(Color.WHITE);
        //JB3.setBorder(new LineBorder(new Color(0,158,204)));
        JB3.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB3.setMargin(new Insets(0,0,0,130));
        JB3.addActionListener(this);
        p2.add(JB3);




        JB4  =new JButton("Delete Details");
        JB4.setBounds(0,150,300,50);
        JB4.setBackground(new Color(0,10,102));
        JB4.setForeground(Color.WHITE);
        //JB4.setBorder(new LineBorder(new Color(0,158,204)));
        JB4.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB4.setMargin(new Insets(0,0,0,130));
        JB4.addActionListener(this);
        p2.add(JB4);


        JB5  =new JButton("Check Package");
        JB5.setBounds(0,200,300,50);
        JB5.setBackground(new Color(0,0,102));
        JB5.setForeground(Color.WHITE);
        //JB5.setBorder(new LineBorder(new Color(0,158,204)));
        JB5.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB5.setMargin(new Insets(0,0,0,130));
        JB5.addActionListener(this);
        p2.add(JB5);


        JB6  =new JButton("Book Package");
        JB6.setBounds(0,250,300,50);
        JB6.setBackground(new Color(0,0,102));
        JB6.setForeground(Color.WHITE);
        //JB6.setBorder(new LineBorder(new Color(0,158,204)));
        JB6.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB6.setMargin(new Insets(0,0,0,130));
        JB6.addActionListener(this);
        p2.add(JB6);


        JB7  =new JButton("View Package");
        JB7.setBounds(0,300,300,50);
        JB7.setBackground(new Color(0,0,102));
        JB7.setForeground(Color.WHITE);
        //JB7.setBorder(new LineBorder(new Color(0,158,204)));
        JB7.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB7.setMargin(new Insets(0,0,0,130));
        JB7.addActionListener(this);
        p2.add(JB7);


        JB8  =new JButton("View Hotel");
        JB8.setBounds(0,350,300,50);
        JB8.setBackground(new Color(0,0,102));
        JB8.setForeground(Color.WHITE);
        //JB8.setBorder(new LineBorder(new Color(0,158,204)));
        JB8.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB8.setMargin(new Insets(0,0,0,140));
        JB8.addActionListener(this);
        p2.add(JB8);


        JB9  =new JButton("Book Hotel");
        JB9.setBounds(0,400,300,50);
        JB9.setBackground(new Color(0,0,102));
        JB9.setForeground(Color.WHITE);
        //JB9.setBorder(new LineBorder(new Color(0,158,204)));
        JB9.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB9.setMargin(new Insets(0,0,0,140));
        JB9.addActionListener(this);
        p2.add(JB9);

        JB10  =new JButton("View Booked Hotel");
        JB10.setBounds(0,450,300,50);
        JB10.setBackground(new Color(0,0,102));
        JB10.setForeground(Color.WHITE);
       // JB10.setBorder(new LineBorder(new Color(0,158,204)));
        JB10.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB10.setMargin(new Insets(0,0,0,100));
        JB10.addActionListener(this);
        p2.add(JB10);



        JB11  =new JButton("Destinations");
        JB11.setBounds(0,500,300,50);
        JB11.setBackground(new Color(0,0,102));
        JB11.setForeground(Color.WHITE);
        //JB11.setBorder(new LineBorder(new Color(0,158,204)));
        JB11.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB11.setMargin(new Insets(0,0,0,140));
        JB11.addActionListener(this);
        p2.add(JB11);


        JB12  =new JButton(" Payment");
        JB12.setBounds(0,550,300,50);
        JB12.setBackground(new Color(0,0,102));
        JB12.setForeground(Color.WHITE);
        //JB12.setBorder(new LineBorder(new Color(0,158,204)));
        JB2.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB12.setMargin(new Insets(0,0,0,150));
        JB12.addActionListener(this);
        p2.add(JB12);

        JB13  =new JButton("Calculator");
        JB13.setBounds(0,600,300,50);
        JB13.setBackground(new Color(0,0,102));
        JB13.setForeground(Color.WHITE);
        //JB13.setBorder(new LineBorder(new Color(0,158,204)));
        JB13.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB13.setMargin(new Insets(0,0,0,150));
        JB13.addActionListener(this);
        p2.add(JB13);



        JB14  =new JButton("NotePad");
        JB14.setBounds(0,650,300,50);
        JB14.setBackground(new Color(0,0,102));
        JB14.setForeground(Color.WHITE);
        //JB14.setBorder(new LineBorder(new Color(0,158,204)));
        JB14.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB14.setMargin(new Insets(0,0,0,150));
        JB14.addActionListener(this);
        p2.add(JB14);



        JB15  =new JButton("About");
        JB15.setBounds(0,700,300,50);
        JB15.setBackground(new Color(0,0,102));
        JB15.setForeground(Color.white);
       // JB15.setBorder(new LineBorder(new Color(0,158,204)));
        JB15.setFont(new Font("Tahoma",Font.PLAIN,20));
        JB15.setMargin(new Insets(0,0,0,150));
        JB15.addActionListener(this);
        p2.add(JB15);




        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon =new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(heading);



        setVisible(true);
    }
    public static void main(String[] args){
        new Dashboard();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
