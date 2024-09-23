package LapTrinhGiaoDien;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class suKienActionEvent extends JFrame implements ActionListener{
	Button btn;
	TextField txt;
	List lst;
	Label lb;
	Panel pn,pn1,pn2;
	public void GUI()
	{
		btn= new Button("OK");
		txt= new TextField(10);
		lst=new List();
		lb = new Label("The event is here");
		
		lst.add("Tiger");
		lst.add("Lion");
		lst.add("Elepahnt");
		
		btn.addActionListener(this);
		txt.addActionListener(this);
		lst.addActionListener(this);
		pn=new Panel(new FlowLayout());
		
		pn1 = new Panel(new FlowLayout());
		pn1.add(btn);
		pn1.add(txt);
		pn1.add(lst);
		
		pn2 = new Panel(new FlowLayout());
		pn2.add(lb);
		
		pn.add(pn1);
		pn.add(pn2);
		this.add(pn);
		setSize(400,400)
;		
		add(pn);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		show();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn)
		{
			lb.setText("Bạn đã nhấn Ok");
		}
		if (e.getSource()==txt)
		{
			lb.setText("Bạn đã nhập vào text");
		}
		if (e.getSource()==lst)
		{
			lb.setText("Bạn đã nhấn vào danh sách");
		}
	}
	public  suKienActionEvent(String st)
	{super(st);
		GUI();
	}
	public static void main(String[] args)
	{
		 suKienActionEvent f=new  suKienActionEvent("ActionEventTest");
		f.setVisible(true);
	}
}
