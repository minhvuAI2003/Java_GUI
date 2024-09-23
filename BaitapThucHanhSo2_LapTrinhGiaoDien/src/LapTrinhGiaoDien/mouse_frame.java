package LapTrinhGiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouse_frame extends Frame implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Panel pn;
	public void GUI()
	{
		this.setTitle("Mouse Test");
		 addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                System.exit(1);
	            }});
		 pn=new Panel();
		 this.setSize(400,400);
		 pn.addMouseListener(this);
		 add(pn);
		 
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		 if (e.getButton()==MouseEvent.BUTTON3)
		System.out.println("You right click the mouse at "+e.getX()+" "+e.getY());
		 if (e.getButton()==MouseEvent.BUTTON1)
				System.out.println("You left click the mouse at "+e.getX()+" "+e.getY());
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You press the mouse at "+e.getX()+" "+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You release the mouse at "+e.getX()+" "+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You enter the Window at "+e.getX()+" "+e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You exit the Window at "+e.getX()+" "+e.getY());
	}
public	mouse_frame()
{
	GUI();}
public static void main(String[] args)
{
	mouse_frame f=new mouse_frame();
	f.setVisible(true);
	
	}

}
