
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int sum1;
    private int sum2;
    private String operator;
    private boolean num1Set = false;
    private boolean num2Set = false;
    public int total = 0;
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        sum1=x;
        x = 0;
        JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPlus,bMinus,bTimes,bDivide, bEquals;
        JTextField out = new JTextField();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bTimes = new JButton("*");
        bDivide = new JButton("/");
        bEquals = new JButton("=");

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        GridLayout gL = new GridLayout(0,3,10,10);
        GridLayout gL2 = new GridLayout(0,1,10,10);
        frame.setLayout(gL2);
        out.setPreferredSize( new Dimension( 200, 24 ) );
        frame.setSize(400,400);
        frame.setTitle("Worzel's Simple Calc");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        panel2.setLayout(gL);
        frame.add(panel);
        frame.add(panel2);
        panel.add(out);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(b0);
        panel2.add(bPlus);
        panel2.add(bMinus);
        panel2.add(bTimes);
        panel2.add(bDivide);
        panel2.add(bEquals);
        frame.setVisible(true);

        b0.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    out.setText(out.getText()+0);

                }
            });
        b1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    out.setText(out.getText()+1);

                }
            });
        b2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    out.setText(out.getText()+2);

                }
            });
        b3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    out.setText(out.getText()+3);

                }
            });
        bPlus.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="+";
                    if(num1Set==false){
                        sum1= Integer.parseInt(out.getText());
                        out.setText("+");
                        num1Set=true;

                    
                    }else if(num1Set==true){
                        
                        sum2= Integer.parseInt(out.getText());
                        out.setText("");
                        
                        total = addSum();
                        String finalNum = Integer.toString(total);
                        out.setText(finalNum);
                        sum1=0;
                        sum2=0;
                        num1Set=false;
                        
                        
                    }
                }
            });
        bMinus.addActionListener(new 
            ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="-";
                    if(num1Set==false){
                        sum1= Integer.parseInt(out.getText());
                        out.setText("-");
                        num1Set=true;
                    }else{

                    }

                 
                }
            });
        bTimes.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="*";

                    if(num1Set==false){
                        sum1= Integer.parseInt(out.getText());
                        out.setText("*");
                        num1Set=true;
                    }else {
                        if(num2Set==false){
                        sum2= Integer.parseInt(out.getText());
                        num2Set=true;
                         total = addSum();
                        String finalNum = Integer.toString(total);
                        out.setText(finalNum);
                        }
                        
                        
                        
                        
                    }

                }
            });
        bDivide.addActionListener(new 
            ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="/";

                    sum1= Integer.parseInt(out.getText());
                    out.setText("/");

                    
                }
            });
        bEquals.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="=";

                    //sum1= Integer.parseInt(out.getText());
                    out.setText("=");

                    
                }
            });
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */


    public int addSum( ){
        int result =0;
        if(operator.equals("*")){
            int theTotal = sum1 * sum2;
            result = total;
        }else
        if(operator.equals("+")){
            int theTotal = sum1 + sum2;
            result = total;
        }else
        if(operator.equals("/")){
            int theTotal = sum1 / sum2;
            result = total;
        }
        else
        if(operator.equals("-")){
            int theTotal = sum1 - sum2;
             result = total;
        }
        return result;
    }
}
