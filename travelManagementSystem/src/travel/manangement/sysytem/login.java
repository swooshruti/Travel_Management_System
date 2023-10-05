package travel.manangement.sysytem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;


public class login extends JFrame implements ActionListener {
    JButton login1,signup1,fp;
    JTextField jtf1,jtf2;

    login(){
        setSize(1000,600);
        setLocation(400,200);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBounds(0,0,500,600);
        p1.setBackground(new Color(0,158,204));
        p1.setLayout(null);
        add(p1);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(550,50,400,450);
        p2.setBackground( new Color(220,220,220));
        add(p2);

        JLabel jl1=new JLabel("Username");
        jl1.setBounds(60,50,100,30);
        jl1.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(jl1);

        jtf1=new JTextField();
        jtf1.setBounds(60,80,300,30);
        jtf1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(jtf1);

        JLabel jl2=new JLabel("Password");
        jl2.setBounds(60,130,100,30);
        jl2.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(jl2);

        jtf2=new JTextField();
        jtf2.setBounds(60,160,300,30);
        jtf2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(jtf2);

        login1=new JButton("Login");
        login1.setBounds(60,220,130,30);
        login1.setBackground(new Color(0,158,204));
        login1.setForeground(Color.WHITE);
        login1.setBorder(new LineBorder(new Color(0,158,204)));
        login1.addActionListener(this);
        p2.add(login1);

         signup1  =new JButton("Signup");
        signup1.setBounds(230,220,130,30);
        signup1.setBackground(new Color(0,158,204));
        signup1.setForeground(Color.WHITE);
        signup1.setBorder(new LineBorder(new Color(0,158,204)));
        signup1.addActionListener(this);
        p2.add(signup1);

         fp  =new JButton("Forgot Password");
        fp.setBounds(150,290,130,30);
        fp.setBackground(new Color(0,158,204));
        fp.setForeground(Color.WHITE);
        fp.setBorder(new LineBorder(new Color(0,158,204)));
        fp.addActionListener(this);
        p2.add(fp);

        JLabel text=new JLabel("Trouble Login...?");
        text.setBounds(160,270,200,20);
        text.setForeground(Color.GRAY);
        p2.add(text);







        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,150,200,200);
        p1.add(image);

        setVisible(true);
    }

    public static void main(String[]args){

        new login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== login1){

            try{
                String username=jtf1.getText();
                String password=jtf2.getText();

                conn c=new conn();
                String query="select * from account where username ='"+username+"' AND password ='"+password+"'";

                ResultSet rs=c.s.executeQuery(query);

                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                }



            }
            catch(Exception e){
                e.printStackTrace();

            }








        }
        else if(ae.getSource()==signup1){
            setVisible(false);
            new signup();
        }
        else{
            setVisible(false);
            new forgotPassword();
        }

    }
}
