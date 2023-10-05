package travel.manangement.sysytem;

import javafx.scene.chart.Axis;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class forgotPassword extends JFrame implements ActionListener {
    JTextField jtf1,jtf5,jtf3,jtf6,tfquestion;
    JButton back,search,retrieve;




    forgotPassword(){
        setBounds(350,200,850,380);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,10,200,300);
        add(image);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,40,500,280);
        add(p1);

        JLabel title=new JLabel("Forgot Password");
        title.setBounds(320,5,200,25);
        title.setFont(new Font("Tahoma",Font.BOLD,18));
        add(title);

        JLabel iliusername=new JLabel("Username");
        iliusername.setBounds(30,30,80,25);
        iliusername.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(iliusername);

        jtf1=new JTextField();
        jtf1.setBounds(190,30,180,25);
        jtf1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtf1);



         search  =new JButton("Search");
        search.setBounds(380,30,80,25);
        search.setBackground(new Color(0,158,204));
        search.setForeground(Color.WHITE);
        search.setBorder(new LineBorder(new Color(0,158,204)));
        search.addActionListener(this);
        p1.add(search);

        JLabel Name=new JLabel("Name");
        Name.setBounds(30,70,80,25);
        Name.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(Name);

        jtf6=new JTextField();
        jtf6.setBounds(190,70,180,25);
        jtf6.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtf6);

        JLabel jl4=new JLabel("Security Question");
        jl4.setBounds(30,110,130,25);
        jl4.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(jl4);


        tfquestion=new JTextField();
        tfquestion.setBounds(190,110,180,25);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);

        /*Choice security=new Choice();
        security.add("abc");
        security.add("der");
        security.add("vrfc");
        security.add("cvf");
        security.add("vdsxv");
        security.add("svrtg");
        security.setBounds(190,110,180,25);
        p1.add(security);

         */

        JLabel jl5=new JLabel("Answer");
        jl5.setBounds(30,150,100,25);
        jl5.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(jl5);

        jtf5=new JTextField();
        jtf5.setBounds(190,150,180,25);
        jtf5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtf5);



        retrieve  =new JButton("Retrieve");
        retrieve.setBounds(380,150,80,25);
        retrieve.setBackground(new Color(0,158,204));
        retrieve.setForeground(Color.WHITE);
        retrieve.setBorder(new LineBorder(new Color(0,158,204)));
        retrieve.addActionListener(this);
        p1.add(retrieve);


        JLabel jl3=new JLabel("New Password");
        jl3.setBounds(30,190,150,25);
        jl3.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(jl3);

        jtf3=new JTextField();
        jtf3.setBounds(190,190,180,25);
        jtf3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtf3);

        /*
        JLabel jl2=new JLabel("Verifying");
        jl2.setBounds(150,230,100,25);
        jl2.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(jl2);
         */

         back  =new JButton("Back");
        back.setBounds(190,230,80,25);
        back.setBackground(new Color(0,158,204));
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(new Color(0,158,204)));
        back.addActionListener(this);
        p1.add(back);


        setVisible(true);

    }



    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==search){
            try{
               String query="select * from account where username = '"+jtf1.getText()+"'";
               conn c=new conn();
               ResultSet rs=c.s.executeQuery(query);

               while(rs.next()){

                   jtf6.setText(rs.getString("name"));
                   tfquestion.setText(rs.getString("security"));


               }



            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
        else if(ae.getSource()==retrieve){
            try{
                String query="select * from account where answer = '"+jtf5.getText()+"'And username = '"+jtf1.getText()+"'" ;
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(query);

                while(rs.next()){

                    jtf3.setText(rs.getString("password"));


                }



            }
            catch (Exception e){
                e.printStackTrace();
            }


        }
        else{
            setVisible(false);
            new login();
        }

    }

    public static void main(String[] args){
        new forgotPassword();

    }
}
