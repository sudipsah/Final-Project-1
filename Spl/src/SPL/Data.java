package SPL;
import java.io.*;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Data {


	public static void main(String args[]) throws IOException{
		BufferedReader bufReader = new BufferedReader(new FileReader("/Users/sudipshah/git/SPL-1/Spl/src/SPL/file.txt"));
		String isbn1,isbn2;
		ArrayList<String> listOfLines = new ArrayList<>(); 
		String  line = bufReader.readLine();
		while (line != null) { 	
			listOfLines.add(line); line = bufReader.readLine(); 
		}
		isbn1=listOfLines.get(0);
		isbn2=listOfLines.get(1);
		ISBN1 value =new ISBN1();
		value.Data1(isbn1);
		ISBN2 value1 = new ISBN2();
		value1.Data1(isbn2);
		BetterWorldBooks h = new BetterWorldBooks();
	//	h.Data2();
	
		/*GUI method1 = new GUI();
		method1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		method1.setSize(500,200);
		method1.setVisible(true);
		method1.setTitle("Book's Infromation");*/
		
	
		



	}
}





