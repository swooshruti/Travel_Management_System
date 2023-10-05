package travel.manangement.sysytem;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener {
    JButton create,back;
    Choice security;
    JTextField jtf1,jtf2,jtf3,jtf5;
    signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBackground(new Color(0,158,204));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);

        JLabel jl1=new JLabel("Username");
        jl1.setBounds(50,20,125,25);
        jl1.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
        p1.add(jl1);

        jtf1=new JTextField();
        jtf1.setBounds(190,20,180,25);
        jtf1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtf1);


        JLabel jl2=new JLabel("Name");
        jl2.setBounds(50,60,125,25);
        jl2.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
        p1.add(jl2);

        jtf2=new JTextField();
        jtf2.setBounds(190,60,180,25);
        jtf2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtf2);

        JLabel jl3=new JLabel("Password");
        jl3.setBounds(50,100,125,25);
        jl3.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
        p1.add(jl3);

        jtf3=new JTextField();
        jtf3.setBounds(190,100,180,25);
        jtf3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtf3);

        JLabel jl4=new JLabel("Security Question");
        jl4.setBounds(50,140,125,25);
        jl4.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
        p1.add(jl4);

        security=new Choice();
        security.add("abc");
        security.add("der");
        security.add("vrfc");
        security.add("cvf");
        security.add("vdsxv");
        security.add("svrtg");
        security.setBounds(190,140,180,25);
        p1.add(security);

        JLabel jl5=new JLabel("Answer");
        jl5.setBounds(50,180,125,25);
        jl5.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
        p1.add(jl5);

        jtf5=new JTextField();
        jtf5.setBounds(190,180,180,25);
        jtf5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtf5);


        create=new JButton("Create");
        create.setBounds(60,220,130,30);
        create.setForeground(new Color(0,158,204));
        create.setBackground(Color.WHITE);
        create.setBorder(new LineBorder(new Color(0,158,204)));
        create.addActionListener(this);
        p1.add(create);

        back  =new JButton("Back");
        back.setBounds(230,220,130,30);
        back.setForeground(new Color(0,158,204));
        back.setBackground(Color.WHITE);
        back.setBorder(new LineBorder(new Color(0,158,204)));
        back.addActionListener(this);
        p1.add(back);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);



        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==create){

            String username= jtf1.getText();
            String name= jtf2.getText();
            String password= jtf3.getText();

            String question= security.getSelectedItem();

            String answer= jtf5.getText();


            String query="insert into account values('"+ username +"','"+name+"','"+password+"','"+question+"','"+answer+"')";

            try{
                conn c=new conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account Created Sucessfullly");

                setVisible(false);

                new login();

            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() ==back){
            setVisible(false);
            new login();
        }

    }




    public  static void main(String[] args){

        new signup();
    }
}
