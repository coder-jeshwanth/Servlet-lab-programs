package com;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
public class Swing extends JFrame implements ActionListener
{
private static final long serialVersionUID = 1L;
JTextField t1;
JButton b1;
public Swing()
{
Container c=getContentPane();
c.setLayout(new FlowLayout());
t1=new JTextField(20);
b1=new JButton("SUBMIT");
c.add(t1);
c.add(b1);
b1.addActionListener(this);
setSize(400,400);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
try
{
if(e.getSource()==b1)
{
URL url=new URL("http://localhost:8282/Lab Programs/hello");
String qrytosend=URLEncoder.encode("param1")+"="+URLEncoder.encode(t1.getText());
URLConnection uc=url.openConnection();
uc.setDoInput(true);
uc.setDoOutput(true);
uc.setUseCaches(false);
PrintStream dos=new PrintStream(uc.getOutputStream());
dos.println(qrytosend);
dos.close();
System.out.println("ok");
System.out.println(qrytosend);
}
}
catch(Exception ee){ ee.printStackTrace(); }
}
public static void main(String args[])
{
new Swing();
}
}