package LapTrinhGiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class itemevent_frame extends JFrame implements ItemListener,ActionListener{

	Checkbox cb1,cb2;
	List lst;
	Label lb;
	Choice choice;
	Panel pn;
	public void GUI()
	{
		lb= new Label("The Events is displayed here");
		
		
		lst=new List();
		lst.add("Tiger");
		lst.add("Lion");
		lst.add("Elephant");
		
		cb1= new Checkbox("Male",false);
		cb2=new  Checkbox("Female",false);
		
		choice = new Choice();
		choice.add("MS DOS");
		choice.add("Window");
		choice.add("Linux");
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		choice.addItemListener(this);
		lst.addActionListener(this);
		
		pn=new Panel(new FlowLayout());
		pn.add(cb1);
		pn.add(cb2);
		pn.add(choice);
		pn.add(lst);
		pn.add(lb);
		add(pn);
		
		setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if ( e.getSource()==cb1 &&   cb1.getState()==true)
		{
			lb.setText("Bạn là nam");
			
		}
		if (cb1.getState()==false &&  cb2.getState()==false) lb.setText("The Events is displayed here");
		if (e.getSource()==cb2 &&  cb2.getState()==true)
		{
			lb.setText("Bạn là nữ");
			if (cb2.getState()==false) lb.setText("The Events is displayed here");
		}
		if (e.getSource()==choice && choice.getSelectedItem()=="MS DOS")
		{
			lb.setText("Bạn dùng hệ điều hành MS_DOS");
		}
		if (e.getSource()==choice && choice.getSelectedItem()=="Linux")
		{
			lb.setText("Bạn dùng hệ điều hành Linux");
		}
		if ( e.getSource()==choice && choice.getSelectedItem()=="Window")
		{
			lb.setText("Bạn dùng hệ điều hành Window");
		}
		
	}
	public itemevent_frame(String st)
	{
		super(st);
		GUI();}
	public  static void main(String[] args)
	{
		itemevent_frame s=new itemevent_frame("ItemEventTest");
		s.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==lst)
		{
			lb.setText("Bạn đang xem danh sách");
		}
	}
	}


