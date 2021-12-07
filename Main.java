
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
    public static double x;
    private static double y;
    private static double sum1;
    private static double sum2;
    private static String operator;
    private static boolean num1Set = false;
    private static boolean num2Set = false;
    public static double total = 0;
    public static String finalNum = "";
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        sum1=x;
        x = 0;
        JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPlus,bMinus,bTimes,bDivide, bEquals, bClear;
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
        bClear = new JButton("CE");

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
        panel2.add(b5);
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
        panel2.add(bClear);
        frame.setVisible(true);

        b0.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("0");
                    }else{
                        out.setText(out.getText()+0);
                    }

                }
            });
        b1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("1");
                    }else{
                        out.setText(out.getText()+1);
                    }

                }
            });
        b2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("2");
                    }else{
                        out.setText(out.getText()+2);
                    }

                }
            });
        b3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    out.setText(out.getText()+3);

                }
            });
        b4.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("4");
                    }else{
                        out.setText(out.getText()+4);
                    }

                }
            });
        b5.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("5");
                    }else{
                        out.setText(out.getText()+5);
                    }

                }
            });
        b6.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("6");
                    }else{
                        out.setText(out.getText()+6);
                    }

                }
            });
        b7.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("7");
                    }else{
                        out.setText(out.getText()+7);
                    }

                }
            });
        b8.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("8");
                    }else{
                        out.setText(out.getText()+8);
                    }

                }
            });
        b9.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(out.getText().equals("+") || out.getText().equals("-")|| out.getText().equals("/")|| out.getText().equals("*")){
                        out.setText("9");
                    }else{
                        out.setText(out.getText()+9);
                    }

                }
            });
        bPlus.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="+";
                    if(num1Set==false){
                        sum1= Double.parseDouble(out.getText());
                        out.setText("+");
                        num1Set=true;
                        System.out.println("sum 1 is "+sum1+" sum 2 is "+sum2);
                    }else if(num1Set==true){
                        sum2= Double.parseDouble(out.getText());
                        out.setText("");

                        total = addSum();
                        String finalNum = Double.toString(total);
                        //out.setText(finalNum);
                        sum1=0;
                        sum2=0;
                        num1Set=false;
                        System.out.println("sum 1 is "+sum1+" sum 2 is "+sum2+" "+" "+finalNum);
                    }
                }
            });
        bMinus.addActionListener(new 
            ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="-";
                    if(num1Set==false){
                        sum1= Double.parseDouble(out.getText());
                        out.setText("-");
                        num1Set=true;
                        System.out.println("sum 1 is "+sum1+" sum 2 is "+sum2);
                    }else if(num1Set==true){
                        sum2= Double.parseDouble(out.getText());
                        out.setText("");

                        total = addSum();
                        String finalNum = Double.toString(total);
                        //out.setText(finalNum);
                        sum1=0;
                        sum2=0;
                        num1Set=false;
                        System.out.println("sum 1 is "+sum1+" sum 2 is "+sum2+" "+" "+finalNum);
                    }

                }
            });
        bTimes.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="*";

                    if(num1Set==false){
                        sum1= Double.parseDouble(out.getText());
                        out.setText("*");
                        num1Set=true;
                        System.out.println("sum 1 is "+sum1+" sum 2 is "+sum2);
                    }else if(num1Set==true){
                        sum2= Double.parseDouble(out.getText());
                        out.setText("");

                        total = addSum();
                        String finalNum = Double.toString(total);
                        //out.setText(finalNum);
                        sum1=0;
                        sum2=0;
                        num1Set=false;
                        System.out.println("sum 1 is "+sum1+" sum 2 is "+sum2+" "+" "+finalNum);
                    }
                }
            });
        bDivide.addActionListener(new 
            ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    operator="/";
                    if(num1Set==false){
                        sum1= Double.parseDouble(out.getText());
                        out.setText("/");
                        num1Set=true;
                        System.out.println("sum 1 is "+sum1+" sum 2 is "+sum2);
                    }else if(num1Set==true){
                        sum2= Double.parseDouble(out.getText());
                        out.setText("");

                        total = addSum();
                        String finalNum = Double.toString(total);
                        //out.setText(finalNum);
                        sum1=0;
                        sum2=0;
                        num1Set=false;
                        System.out.println("sum 1 is "+sum1+" sum 2 is "+sum2+" "+" "+finalNum);
                    }

                }
            });
        bEquals.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(operator.equals("+")){
                        sum2= Double.parseDouble(out.getText());
                        out.setText("");

                        total = addSum();
                        finalNum = Double.toString(total);
                    }else if(operator.equals("*")){
                        sum2= Double.parseDouble(out.getText());
                        out.setText("");

                        total = addSum();
                        finalNum = Double.toString(total);
                    }else if(operator.equals("-")){
                        sum2= Double.parseDouble(out.getText());
                        out.setText("");

                        total = addSum();
                        finalNum = Double.toString(total);
                    }else if(operator.equals("/")){
                        sum2= Double.parseDouble(out.getText());
                        out.setText("");

                        total = addSum();
                        finalNum = Double.toString(total);
                    }

                    //sum1= Integer.parseInt(out.getText());
                    operator="";
                    num1Set=false;
                    num2Set=false;
                    sum1=0;
                    sum2=0;
                    total=0;
                    out.setText(finalNum);

                }
                    
            });
        bClear.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    //sum1= Integer.parseInt(out.getText());
                    operator="";
                    num1Set=false;
                    num2Set=false;
                    sum1=0;
                    sum2=0;
                    total=0;
                    finalNum="";
                    out.setText(finalNum);

                }
                    
            });
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

    public static double addSum( ){
        double result =0;
        if(operator.equals("*")){
            double theTotal = sum1 * sum2;
            result = theTotal;
        }else
        if(operator.equals("+")){
            double theTotal = sum1 + sum2;
            result = theTotal;
        }else
        if(operator.equals("/")){
            double theTotal = sum1 / sum2;
            result = theTotal;
        }
        else
        if(operator.equals("-")){
            double theTotal = sum1 - sum2;
            result = theTotal;
        }
        return result;
    }
}
