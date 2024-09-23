package LapTrinhGiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Doimaunen_frame extends JFrame implements ActionListener{

	Button red,green,blue,thoat;
	
	Panel con,pn;
	public void GUI()
	{
		 red=new Button("Red");
		 green=new Button("Green");
		 blue=new Button("Blue");
		 thoat=new Button("Thoat");
		
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		thoat.addActionListener(this);
	
		pn=new Panel(new BorderLayout());
		con=new Panel(new FlowLayout());
		con.add(red);
		con.add(green);
		con.add(blue);
		con.add(thoat);
		pn.add(con,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pn);
		setSize(400,300);
		pn.setBackground(Color.white);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==red)
		{
	        pn.setBackground(Color.red);
           con.setBackground(Color.red);
		}
		if (e.getSource()==green)
		{
			pn.setBackground(Color.green);
		     con.setBackground(Color.green);
		}
		if (e.getSource()==blue)
		{
		pn.setBackground(Color.blue);
	     con.setBackground(Color.blue);
		}
		if (e.getSource()==thoat)
		{
			System.exit(0);
		}
	}
	public  Doimaunen_frame(String st)
	{
		super(st);
		GUI();
	}
	public static void main(String[] args)
	{
		 Doimaunen_frame f=new  Doimaunen_frame("Doi mau nen");
		
		f.setVisible(true);
          

	}
	
}