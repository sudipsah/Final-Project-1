package SPL;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class GUI extends JFrame{
	JTable table;
	Abe object1 =new Abe();

	public GUI() {
		setLayout(new FlowLayout());
		String columnNames []= {"BooksName","Author","ISBN"};
		Object data[][]= {{" "," "," "},
				{" "," ", " "},
				{" "," "," "},
				{" "," "," ",},
				{" "," "," "}};
		table =new JTable(data,columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500,200));
		table.setFillsViewportHeight(true);
		JTableHeader THead = new JTableHeader();
		THead.setBackground(Color.BLUE);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);





	}

	URL source4 = new URL("https://studentvip.com.au/books/"+str);
	BufferedReader in4 = new BufferedReader(
			new InputStreamReader(
					source4.openStream()));
	String inputLine4;	
	boolean flag4=false;
	int price4;
	System.out.print("\nfrom studenvip.com\nPrice:$");
	while ((inputLine4 = in4.readLine()) != null) {

		price4=inputLine4.indexOf("RRP");

		if(price4!=-1) {

			char[] ch4=inputLine4.toCharArray();

			for(int i=price4;i<ch4.length;i++) {

				if(ch4[i]=='>'||ch4[i]=='<') break;
				else if((ch4[i]>='0'&&ch4[i]<='9')||ch4[i]=='.')
					System.out.print(ch4[i]);

				flag4=true;

			}

			if(flag4==true) {
				System.out.println("");

			}
		}
	}

}
