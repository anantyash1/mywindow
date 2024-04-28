package PROJECT;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
 class mywindows extends JFrame
{
    private JLabel heading;
    private JLabel clocklabel;
    private Font font =new Font("",Font.BOLD,35);
   public  mywindows()
   {
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }
    public void createGUI()
    {
        heading =new JLabel("My Clock");
        clocklabel=new JLabel("clock");
        heading.setFont(font);
        clocklabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clocklabel);


    }
    public void startClock(){
        Timer timer=new Timer(1000,new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                //  String dateTime=new Date().toString(); 
                // you can use these too.
                // String dateTime=new Date().toLocaleString();
                // you can use use this instead of using the default date format
                Date d=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a d E yyyy ");
                String dateTime=sdf.format(d);
                clocklabel.setText(dateTime);
            }
        });
        timer.start();

    }

}public class mywindow 
{
    public static void main(String[] args) {
        // System.out.println("Testing");
        mywindows w=new mywindows();
    }
    
} 
