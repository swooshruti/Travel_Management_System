package travel.manangement.sysytem;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;

    String username;
    @Override
    public void run() {
        try{
            for (int i=1;i<=100;i++){
                int max= bar.getMaximum();
                int value=bar.getValue();

                if(value<max){
                    bar.setValue(bar.getValue()+2);

                }
                else{
                    setVisible(false);

                }
                Thread.sleep(20);


            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


    Loading(String username){
        this.username=username;

        t=new Thread(this);


        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text=new JLabel("Travel & Tourism Application");
        text.setBounds(80,20,600,40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);

        JLabel text1=new JLabel("Loading, Please wait...");
        text1.setBounds(230,130,300,40);
        text1.setForeground(Color.red);
        text1.setFont(new Font("Raleway",Font.BOLD,16));
        add(text1);

        JLabel text2=new JLabel("Welcome "+ username);
        text2.setBounds(20,310,450,40);
        text2.setForeground(Color.red);
        text2.setFont(new Font("Raleway",Font.BOLD,16));
        add(text2);

         bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);



        t.start();
        setVisible(true);
    }

    public static void main(String[] args){

        new Loading("");


    }


}
