package SPL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Powells {
	public   void Data1(String str1) throws IOException {

		URL info = new URL("http://www.powells.com/book/-"+str1);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						info.openStream()));
		String inputLine;

		boolean flag=false;
		int  price;
		int name;

		System.out.print("Books name and author Name:\n");	
		while ((inputLine = in.readLine()) != null) {

			flag=false;

			name=inputLine.indexOf("Algo");

			if(inputLine.indexOf("Algo")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length-72;i++) {

					if(ch[i]==':'||ch[i]=='<') break;
					System.out.print(ch[i]);

					flag=true;

				}

				if(flag==true) break;
				System.out.println();
			}
		}

		System.out.println();
		System.out.print("Price:$");
		while ((inputLine = in.readLine()) != null) {

			price=inputLine.indexOf("$");

			if(inputLine.indexOf("$")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<6;i++) {

					if(ch[i]=='>'||ch[i]=='/') break;
					else if((ch[i]>='0'&&ch[i]<='9')||ch[i]=='.')
						System.out.print(ch[i]);
					flag=true;

				}

				if(flag==true) {

				}
			}

		}
		System.out.println("\n");
	}
	/*---------------------------------------------------------------------------------------------*/	
	public   void Data2(String str1) throws IOException {

		URL info = new URL("http://www.powells.com/book/-"+str1);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						info.openStream()));
		String inputLine;

		boolean flag=false;
		int  price;
		int name;

		System.out.print("Books name and author Name:\n");	
		while ((inputLine = in.readLine()) != null) {

			flag=false;

			name=inputLine.indexOf("Master");

			if(inputLine.indexOf("Master")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length-40;i++) {

					if(ch[i]==':'||ch[i]=='<') break;
					System.out.print(ch[i]);

					flag=true;

				}

				if(flag==true) break;
				System.out.println();
			}
		}

		System.out.println();
		System.out.print("Price:$");
		while ((inputLine = in.readLine()) != null) {

			price=inputLine.indexOf("$");

			if(inputLine.indexOf("$")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<6;i++) {

					if(ch[i]=='>'||ch[i]=='/') break;
					else if((ch[i]>='0'&&ch[i]<='9')||ch[i]=='.')
						System.out.print(ch[i]);
					flag=true;

				}

				if(flag==true) {

				}
			}

		}
		System.out.println("\n");
	}

	/*---------------------------------------------------------------------------------------------*/	
	public   void Data3(String st) throws IOException {

		URL info = new URL("http://www.powells.com/book/-"+st);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						info.openStream()));
		String inputLine;

		boolean flag=false;
		int  price;
		int name;

		System.out.print("Books name and author Name:\n");	
		while ((inputLine = in.readLine()) != null) {

			flag=false;

			name=inputLine.indexOf("Cod");

			if(inputLine.indexOf("Cod")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length
						-50;i++) {

					if(ch[i]==':'||ch[i]=='<') break;
					System.out.print(ch[i]);

					flag=true;

				}

				if(flag==true) break;
				System.out.println();
			}
		}

		System.out.println();
		System.out.print("Price:$");
		while ((inputLine = in.readLine()) != null) {

			price=inputLine.indexOf("$");

			if(inputLine.indexOf("$")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<6;i++) {

					if(ch[i]=='>'||ch[i]=='/') break;
					else if((ch[i]>='0'&&ch[i]<='9')||ch[i]=='.')
						System.out.print(ch[i]);
					flag=true;

				}

				if(flag==true) {

				}
			}

		}
		System.out.println("\n");
	}
	/*---------------------------------------------------------------------------------------------*/
	public   void Data4(String st) throws IOException {

		URL info = new URL("http://www.powells.com/book/-"+st);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						info.openStream()));
		String inputLine;

		boolean flag=false;
		int  price;
		int name;

		System.out.print("Books name and author Name:\n");	
		while ((inputLine = in.readLine()) != null) {

			flag=false;

			name=inputLine.indexOf("Over");

			if(inputLine.indexOf("Over")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length
						+20;i++) {

					if(ch[i]==':'||ch[i]=='<') break;
					System.out.print(ch[i]);

					flag=true;

				}

				if(flag==true) break;
				System.out.println();
			}
		}

		System.out.println();
		System.out.print("Price:$");
		while ((inputLine = in.readLine()) != null) {

			price=inputLine.indexOf("$");

			if(inputLine.indexOf("$")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<6;i++) {

					if(ch[i]=='>'||ch[i]=='/') break;
					else if((ch[i]>='0'&&ch[i]<='9')||ch[i]=='.')
						System.out.print(ch[i]);
					flag=true;

				}

				if(flag==true) {

				}
			}

		}
		System.out.println("\n");
	}
	/*---------------------------------------------------------------------------------------------*/
	public   void Data5(String st) throws IOException {

		URL info = new URL("http://www.powells.com/book/-"+st);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						info.openStream()));
		String inputLine;

		boolean flag=false;
		int  price;
		int name;

		System.out.print("Books name and author Name:\n");	
		while ((inputLine = in.readLine()) != null) {

			flag=false;

			name=inputLine.indexOf("C++");

			if(inputLine.indexOf("C++")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length
						-45;i++) {

					if(ch[i]==':'||ch[i]=='<') break;
					System.out.print(ch[i]);

					flag=true;

				}

				if(flag==true) break;
				System.out.println();
			}
		}

		System.out.println();
		System.out.print("Price:$");
		while ((inputLine = in.readLine()) != null) {

			price=inputLine.indexOf("$");

			if(inputLine.indexOf("$")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<6;i++) {

					if(ch[i]=='>'||ch[i]=='/') break;
					else if((ch[i]>='0'&&ch[i]<='9')||ch[i]=='.')
						System.out.print(ch[i]);
					flag=true;

				}

				if(flag==true) {

				}
			}

		}System.out.println("\n");
	}
	/*---------------------------------------------------------------------------------------------*/

}


