import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class driver implements LibActs {

	public void addBook(Book book) {
	
		if (library.contains(book) == false)
			library.add(book);
	
	}
	public void removeBook(Book book) {
	
		if (library.contains(book))
			library.remove(book);
	
	}
	public void searchCatalog(String query) {
	
		for (Book b : library) {
		
			if (b.getTitle().equals(query))
				System.out.println("Book is in catalog.");
		
		}
	
	}

	public static void main(String[] args) {
		
		driver d = new driver();
		Screen screen = new Screen("libScreen", true, "Welcome to Peter's Library!", "images/lib.jpg");
		JTextField t = new JTextField("                                                        ");
		JPanel panel = new JPanel();
		t.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			
				d.searchCatalog(t.getText().trim());
			
			}
		
		});
		panel.add(t);
		screen.add(panel);
		
	}
	
	public driver() {
	
		Osterhout library = new Osterhout();
	
	}

}
