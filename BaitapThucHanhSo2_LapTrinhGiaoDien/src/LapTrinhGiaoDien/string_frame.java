package LapTrinhGiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class string_frame extends JFrame implements ActionListener{

	Label lb1,lb2,lb3,lb4,lb5;
	Button btn1,btn2,btn3;
	TextField txta,txtb,txtc,txtd,txte;
	Panel pn,pn1,pn22,pn2,pn3,pn4,pn5;
	public void GUI()
	{
		lb1=new Label("Enter a String");
		lb2=new Label("To Uppercase");
		lb3=new Label("To Lowercase");
		lb4=new Label("To LowerUpper");
		lb5=new Label("Number of word");
		
		btn1=new Button("OK");
		btn2=new Button("Reset");
		btn3=new Button("Exit");
		
		txta=new TextField(9);
		txtb=new TextField(9);
		txtc=new TextField(9);
		txtd=new TextField(9);
		txte=new TextField(9);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	
		
		pn=new Panel(new GridLayout(6,1));
		pn1=new Panel(new GridLayout(1,2));
		pn2=new Panel(new GridLayout(1,2));
		pn3=new Panel(new GridLayout(1,2));
		pn4=new Panel(new GridLayout(1,2));
		pn5=new Panel(new GridLayout(1,2));
		pn22=new Panel(new FlowLayout());
		pn1.add(lb1);
		pn1.add(txta);
		pn2.add(lb2);
		pn2.add(txtb);
		pn3.add(lb3);
		pn3.add(txtc);
		pn4.add(lb4);
		pn4.add(txtd);
		pn5.add(lb5);
		pn5.add(txte);
		pn22.add(btn1);
		pn22.add(btn2);
		pn22.add(btn3);
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		pn.add(pn5);
		pn.add(pn22);
		add(pn);
		
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	
	
	if (e.getSource()==btn1)
	{
		String st=txta.getText();
		st=st.trim();

		txtb.setText(st.toUpperCase());
		txtc.setText(st.toLowerCase());
		String words[] =st.split("\\s");
		char a[]=st.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if ( a[i]>='A' && a[i]<='Z')
			{
				
				a[i]=(char)((int)(a[i])+32);
			 
				
			}
			else if ( a[i]>='a' && a[i]<='z')
			{
				
				a[i]=(char)((int)(a[i])-32);
				
			}
		}
		txtd.setText(String.valueOf(a));
		txte.setText(Integer.toString(words.length));
	}
	if (e.getSource()==btn2)
	{
		txta.setText(null);
		txtb.setText(null);
		txtc.setText(null);
		txtd.setText(null);
		txte.setText(null);
	}
	if (e.getSource()==btn3)
	{
		System.exit(0);
	}
}
	public string_frame()
	{
		GUI();
	}
	public static void main(String[] args)
	{
		string_frame f=new string_frame();
		f.setVisible(true);
	}
}
