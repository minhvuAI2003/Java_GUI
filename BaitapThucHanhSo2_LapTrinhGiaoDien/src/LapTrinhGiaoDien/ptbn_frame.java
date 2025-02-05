package LapTrinhGiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ptbn_frame extends Frame implements ActionListener {
 Label lb1,lb2,lb3,lb;
 TextField txta,txtb,txtc,txtkq;
 Button tinh,reset,thoat;
 Panel pn,pn1,pn2,pn3;
 
public void GUI()
 {
	 lb=new Label(" GIAI PHUONG TRINH BAC NHAT");
	 lb1=new Label("Nhap a:");
	 lb2=new Label("Nhap b:");
	 lb3=new Label("Ket qua:");
	 
	 txta=new TextField(7);
	 txtb=new TextField(7);
	 txtkq= new TextField();
	 
	 tinh=new Button("Tinh");
	 reset=new Button("Reset");
	 thoat =new Button("Thoat");
	 
	 tinh.addActionListener(this);
	 reset.addActionListener(this);
	 thoat.addActionListener(this);
	 
	 pn=new Panel(new GridLayout(3,1));
	 pn1=new Panel(new FlowLayout());
	 pn2=new Panel(new GridLayout(3,2));
	 pn3=new Panel(new GridLayout(1,3));
	 
	 pn1.add(lb);
	 pn2.add(lb1);
	 pn2.add(txta);
	 pn2.add(lb2);
	 pn2.add(txtb);
	 pn2.add(lb3);
	 pn2.add(txtkq);
	 
	 pn3.add(tinh);
	 pn3.add(reset);
	 pn3.add(thoat);
	 pn.add(pn1);
	 pn.add(pn2);
	 pn.add(pn3);
	 add(pn);
	 setSize(400,300);
	 show();
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==tinh)
		{
			int a=Integer.parseInt(txta.getText());
			int b=Integer.parseInt(txtb.getText());
			if (a!=0) txtkq.setText(Float.toString((float)-b/a));
			else
				if (b==0) txtkq.setText("Phuong trinh co vo so nghiem");
				else txtkq.setText("Phuong trinh vo nghiem");
			
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
	public ptbn_frame(String st)
	{
		super(st);
		GUI();
	}
	public static void main(String[] args)
	{
		ptbn_frame f=new ptbn_frame("Giai phuong trinh bac nhat");
		f.setVisible(true);
	}
}
