package main;

import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import plugs.Shorthand;

public class driver implements LibActs, Shorthand {
	
	public driver() {
		
		library = new Osterhout();
	
	}
	
	private static Osterhout library;

	public void addBook(Book book) {
	
		if (library.contains(book) == false)
			library.add(book);
	
	}
	public void removeBook(Book book) {
	
		if (library.contains(book))
			library.remove(book);
	
	}
	public void searchCatalog(String query) {
		
		//if (library == null)
			say("well, this is a problem");
		for (Book b : library) {
		
			if (b.getTitle().equals(query))
				say("Book is in catalog.");
		
		}
	
	}

	public static void main(String[] args) {
		
		
		driver d = new driver();
		Screen screen = new Screen("libScreen", true, "Welcome to Peter's Library!", "images/lib.jpg");
		JTextField t = new JTextField("                                                        ");
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 300));
		t.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			
				d.searchCatalog(t.getText().trim());
			
			}
		
		});
		panel.add(t);
		screen.add(panel);
		
	}
	
	@Override
	public void say(String s) {
		
		System.out.println(s);
		
	}

}
