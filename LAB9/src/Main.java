import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//1 THB = 39.11 KRW
//2 THB = 0.033 USD
//3 THB = 0.0000039 BTC
public class Main {

    public static void main(String[] args) {
        new TextFieldExample();
    }

    static class TextFieldExample implements ActionListener{
        JTextField Receive,OUTPUT,ReceiveTrans,OUTPUTTrans;
        JButton b1,b2,b3;
        TextFieldExample(){
            JFrame f= new JFrame();
            Receive=new JTextField();
            Receive.setBounds(50,50,150,20);
            ReceiveTrans=new JTextField();
            ReceiveTrans.setBounds(205,50,35,20);
            ReceiveTrans.setText("THB");
            OUTPUT=new JTextField();
            OUTPUT.setBounds(50,100,150,20);
            OUTPUTTrans=new JTextField();
            OUTPUTTrans.setBounds(205,100,35,20);
            OUTPUTTrans.setText("THB");
            ReceiveTrans.setEditable(false);
            OUTPUTTrans.setEditable(false);
            OUTPUT.setEditable(false);
            b1=new JButton("KRW");
            b1.setBounds(50,200,100,50);
            b2=new JButton("USD");
            b2.setBounds(150,200,100,50);
            b3=new JButton("BTC");
            b3.setBounds(250,200,100,50);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            f.add(Receive);
            f.add(OUTPUT);
            f.add(ReceiveTrans);
            f.add(OUTPUTTrans);
            f.add(b1);f.add(b2);f.add(b3);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent e) {


            double ReceiveFloat=Float.parseFloat(Receive.getText());
            double Answer = 0;
            if(e.getSource()==b1){
                Answer = ReceiveFloat * 39.11;
                OUTPUTTrans.setText("KRW");
            }else if(e.getSource()==b2){
                Answer = ReceiveFloat * 0.033;
                OUTPUTTrans.setText("USD");
            }
            else if(e.getSource()==b3){
                Answer =  ReceiveFloat * 0.0000039;
                OUTPUTTrans.setText("BTC");
            }

            String result=String.valueOf(Answer);
            OUTPUT.setText(result);

        }


}}
