package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.Component;

public class Screen extends JFrame {

	private static final long serialVersionUID = 1L;

	//public void addComponent();
	
	public void updateScreen(boolean b) {
	
		this.setVisible(b);
	
	}
	
	public Screen(String title, boolean visible) {
	
		super(title);
		this.setVisible(visible);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public Screen(String title, boolean visible, String labelText) {
	
		super(title);
		JPanel p = new JPanel();
		JLabel l = new JLabel(labelText);
		l.setAlignmentX(Component.CENTER_ALIGNMENT);
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(l);
		this.add(p);
		this.pack();
		this.setVisible(visible);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public Screen(String title, boolean visible, String labelText, String imagePath) {
	
		super(title);
		JPanel p = new JPanel();
		JLabel l = new JLabel(labelText);
		ImageIcon i = new ImageIcon(imagePath);
		JLabel l2 = new JLabel(i);
		l.setAlignmentX(Component.CENTER_ALIGNMENT);
		l2.setAlignmentX(Component.CENTER_ALIGNMENT);
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(l);
		p.add(l2);
		this.add(p);
		this.pack();
		this.setVisible(visible);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
