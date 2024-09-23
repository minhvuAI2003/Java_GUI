package LapTrinhGiaoDien;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.awt.MenuBar;
import java.awt.MenuItem;
public class MenuDemo  extends JFrame {
MenuDemo()
{
	MenuBar menubar=new MenuBar();
	
	Menu File=new Menu("File");
	Menu Edit=new Menu("Edit");
	Menu Option= new Menu("Option");
	MenuItem copy=new MenuItem("Copy");
	MenuItem cut=new MenuItem("Cut");
	MenuItem paste=new MenuItem("Paste");
	MenuItem protecte=new MenuItem("Protected");
	MenuItem first =new MenuItem("First");
	MenuItem second =new MenuItem("Second");
	MenuItem third =new MenuItem("Third");
	Option.add(first);
	Option.add(second);
	Option.add(third);
	Edit.add(copy);
	Edit.add(cut);
	Edit.add(paste);
	Edit.add(Option);
	Edit.add(protecte);
	menubar.add(File);
	menubar.add(Edit);
	this.setMenuBar(menubar);
	;
	this.setSize(400,400);
	this.setLayout(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Menu Demo");
	}
public static void main(String[] args)
{
	MenuDemo f=new MenuDemo();
	f.setVisible(true);
}
}
