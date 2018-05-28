package SPL;
import java.io.*;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Data {


	public static void main(String args[]) throws IOException{
		BufferedReader bufReader = new BufferedReader(new FileReader("/Users/sudipshah/git/SPL-1/Spl/file.txt"));
		String isbn1,isbn2,isbn3,isbn4,isbn5;
		ArrayList<String> listOfLines = new ArrayList<>(); 
		String  line = bufReader.readLine();
		while (line != null) { 	
			listOfLines.add(line); line = bufReader.readLine(); 
		}
		isbn1=listOfLines.get(0);
		isbn2=listOfLines.get(1);
		isbn3=listOfLines.get(2);
		isbn4=listOfLines.get(3);
		isbn5=listOfLines.get(4);

		ISBN1 value =new ISBN1();
		//value.Data1(isbn1);
		ISBN2 value1 = new ISBN2();
	//	value1.Data1(isbn2);
		ISBN3 value2 = new ISBN3();
		//value2.Data1(isbn3);
		ISBN4 value3 = new ISBN4();
		value3.Data1(isbn4);
		ISBN5 value4 = new ISBN5();
		value4.Data1(isbn5);



		/*GUI method1 = new GUI();
		method1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		method1.setSize(500,200);
		method1.setVisible(true);
		method1.setTitle("Book's Infromation");*/






	}
}





