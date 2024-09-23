package LapTrinhGiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AO_frame extends Frame implements ActionListener {
	Label lb1,lb2,lb3,lb;
	 TextField txta,txtb,txtc,txtkq;
	 Button cong,reset,thoat,chia,tru,nhan;
	 Panel pn,pn1,pn2,pn3,pn4;
	 
	public void GUI()
	 {
		 lb=new Label("Basic Arithmetic Operation");
		 lb1=new Label("Number 1:");
		 lb2=new Label("Number 2:");
		 lb3=new Label("Result:");
		 
		 txta=new TextField(7);
		 txtb=new TextField(7);
		 txtkq= new TextField();
		 
		 cong=new Button("Addition");
		 tru=new Button("Subtraction");
		 thoat =new Button("Exit");
		 chia=new Button("Division");
		 reset=new Button("Reset");
		 nhan=new Button("Multiplication");
		 
		 cong.addActionListener(this);
		 reset.addActionListener(this);
		 thoat.addActionListener(this);
		 chia.addActionListener(this);
		 nhan.addActionListener(this);
		 tru.addActionListener(this);
		 
		 pn=new Panel(new GridLayout(4,1));
		 pn1=new Panel(new FlowLayout());
		 pn2=new Panel(new GridLayout(3,2));
		 pn3=new Panel();
		 pn4=new Panel();
		
		 
		 pn1.add(lb);
		 pn2.add(lb1);
		 pn2.add(txta);
		 pn2.add(lb2);
		 pn2.add(txtb);
		 pn2.add(lb3);
		 pn2.add(txtkq);
		 
		 pn3.add(cong);
		 pn3.add(tru);
		
		
		 pn3.add(nhan);
		 pn3.add(chia);
		
		 pn4.add(reset);
		 pn4.add(thoat); 
		 
		 pn.add(pn1);
		 pn.add(pn2);
		 pn.add(pn3);
		 pn.add(pn4);
		 
		 add(pn);
		 setSize(400,300);
		 show();
		
	 }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==cong)
			{
				int a=Integer.parseInt(txta.getText());
				int b=Integer.parseInt(txtb.getText());
				txtkq.setText(Integer.toString(a+b));
			
				
			}
			if (e.getSource()==tru)
			{
				int a=Integer.parseInt(txta.getText());
				int b=Integer.parseInt(txtb.getText());
				txtkq.setText(Integer.toString(a-b));
				
			
			}
			if (e.getSource()==nhan)
			{
				int a=Integer.parseInt(txta.getText());
				int b=Integer.parseInt(txtb.getText());
				txtkq.setText(Integer.toString(a*b));
				
				
			}
			if (e.getSource()==chia)
			{
				
				int a=Integer.parseInt(txta.getText());
				int b=Integer.parseInt(txtb.getText());
				if (b==0) txtkq.setText("Khong the chia");
				else
				txtkq.setText(Float.toString((float)((float)a/b)));
				
			}
			if (e.getSource()==reset)
			{
				txta.setText("");
				txtb.setText("");
				txtkq.setText("");
			}
			if (e.getSource()==thoat)
			{
				System.exit(0);
			}
			
		}
		public AO_frame(String st)
		{
			super(st);
			GUI();
		}
		public static void main(String[] args)
		{
			AO_frame f=new AO_frame("Arithmetic Operation");
			
			f.setVisible(true);
	          

		}
}