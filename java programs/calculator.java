import javax.swing.*;
import java.awt.event.*;

class calculator implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,badd,bsub,beq,bclear,bdec,bdelete;
    static double a=0,b=0,result=0;

    static int operator=0;
    calculator()
    {
        f=new JFrame("calculator");
        t=new JTextField();

        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        badd=new JButton("+");
        bsub=new JButton("-");
        beq=new JButton("=");
        bclear=new JButton("C");
        bdec=new JButton(".");
        bdelete=new JButton("Del");
        
        t.setBounds(30,40,280,30);
        b1.setBounds(40,100,50,40);
        b2.setBounds(100,100,50,40);
        b3.setBounds(160,100,50,40);
        badd.setBounds(220,100,50,40);

        b4.setBounds(40,150,50,40);
        b5.setBounds(100,150,50,40);
        b6.setBounds(160,150,50,40);
        bsub.setBounds(220,150,50,40);

        b7.setBounds(40,200,50,40);
        b8.setBounds(100,200,50,40);
        b9.setBounds(160,200,50,40);
        bmul.setBounds(220,200,50,40);

        b0.setBounds(100,250,50,40);
        bdiv.setBounds(220,250,50,40);
        bdec.setBounds(40,250,50,40);
        beq.setBounds(160,250,50,40);
        bclear.setBounds(50,310,80,40);
        bdelete.setBounds(140,310,80,40);

        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(bdiv);
        f.add(bmul);
        f.add(badd);
        f.add(bsub);
        f.add(beq);
        f.add(bclear);
        f.add(bdec);
        f.add(bdelete);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        beq.addActionListener(this);
        bclear.addActionListener(this);
        bdec.addActionListener(this);
        bdelete.addActionListener(this);

        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        beq.addActionListener(this);
        bclear.addActionListener(this);
        bdec.addActionListener(this);
        bdelete.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            t.setText(t.getText().concat("1"));
        }
        else if(e.getSource()==b2)
        {
            t.setText(t.getText().concat("2"));
        }
        else if(e.getSource()==b3)
        {
            t.setText(t.getText().concat("3"));
        }
        else if(e.getSource()==b4)
        {
            t.setText(t.getText().concat("4"));
        }
        else if(e.getSource()==b5)
        {
            t.setText(t.getText().concat("5"));
        }
        else if(e.getSource()==b6)
        {
            t.setText(t.getText().concat("6"));
        }
        else if(e.getSource()==b7)
        {
            t.setText(t.getText().concat("7"));
        }
        else if(e.getSource()==b8)
        {
            t.setText(t.getText().concat("8"));

        }
        else if(e.getSource()==b9)
        {
            t.setText(t.getText().concat("9"));
        }
        else if(e.getSource()==b0)
        {
            t.setText(t.getText().concat("0"));
        }
        else if(e.getSource()==bdec)
        {
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
            
        }
        else if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
            
        }
        else if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
            
        }
        else if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
            
        }
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());
            switch(operator)
            {
                case 1:
                    result=a+b;
                    break;
                case 2:
                
                    result=a-b;
                    break;
                case 3:
                
                    result=a*b;
                    break;
                case 4:
                
                    result=a/b;
                    break;
                default:

                    result=0;
                    break;

            }
            t.setText(""+result);
        }
        if(e.getSource()==bclear)
        {
            t.setText("");
        }

        if(e.getSource()==bdelete)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
                t.setText(t.getText()+s.charAt(i));        
        }


    }
    public static void main(String[] args)
    {
        new calculator();
    }
    
}