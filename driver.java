import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;

public class driver implements LibActs {

	private static ArrayList<Book> library;

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
		screen.updateScreen(true);
		
	
	}
	
	public driver() {
	
		library = new ArrayList<>();
		Book crimeAndPunishment = new Book("Crime and Punishment", "Fyodor Dostoevesky", 9787600329564L, 678);
		Book wyndv = new Book("Wyndv: A Collection", "Gregory Brodst", 9798854226110L, 59);
		Book dune = new Book("Dune", "Frank Herbert", 9780441013593L, 647);
		addBook(crimeAndPunishment);
		addBook(wyndv);
		addBook(dune);
	
	}

}
