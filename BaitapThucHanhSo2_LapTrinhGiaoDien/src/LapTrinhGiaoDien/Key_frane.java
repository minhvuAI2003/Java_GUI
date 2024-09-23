package LapTrinhGiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Key_frane extends JFrame implements KeyListener {

	Panel pn;
	Button lb;
	public void GUI()
	{
		lb=new Button();
		lb.addKeyListener(this);
		lb.setSize(20, 20);
		pn=new Panel(new BorderLayout());
		pn.add(lb,BorderLayout.CENTER);
		add(pn);
	
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Key Event Test");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		lb.setLabel(String.valueOf(e.getKeyChar()));
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public  Key_frane()
	{
		GUI();
	}
	public static void main(String[] args)
	{
		 Key_frane f=new  Key_frane();
		 f.setVisible(true);
	}
}
