package SPL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Wordery {
public   void Data1(String str) throws IOException {
		
		URL info = new URL("https://wordery.com/beginning-c-through-game-programming-michael-dawson-"+str);
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
				
				name=inputLine.indexOf("Beg");
				
				if(inputLine.indexOf("Beg")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=name;i<ch.length-40
							;i++) {
						
						if(ch[i]=='<'||ch[i]=='/') break;
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
				
				price=inputLine.indexOf("$6");
				
				if(inputLine.indexOf("$6")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=price;i<10;i++) {
						
						if(ch[i]=='/'||ch[i]=='<') break;
						else if((ch[i]>='0'&&ch[i]<='9')||(ch[i]=='.'))
						System.out.print(ch[i]);
						flag=true;
					
					}
					
					if(flag==true) {
						
					}
				}
			
			}System.out.println("\n");
	}
	/*---------------------------------------------------------------------------------------------------------*/
	public   void Data2(String str) throws IOException {
		
		URL info = new URL("https://wordery.com/learning-web-design-jennifer-niederst-robbins-"+str);
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
				
				name=inputLine.indexOf("Lea");
				
				if(inputLine.indexOf("Lea")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=name;i<ch.length-40
							;i++) {
						
						if(ch[i]=='<'||ch[i]=='/') break;
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
				
				price=inputLine.indexOf("$4");
				
				if(inputLine.indexOf("$4")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=price;i<10;i++) {
						
						if(ch[i]=='/'||ch[i]=='<') break;
						else if((ch[i]>='0'&&ch[i]<='9')||(ch[i]=='.'))
						System.out.print(ch[i]);
						flag=true;
					
					}
					
					if(flag==true) {
						
					}
				}
			
			}System.out.println("\n");
	}
/*---------------------------------------------------------------------------------------------------------*/
	public   void Data3(String str) throws IOException {
		
		URL info = new URL("https://wordery.com/doing-math-with-python-amit-saha-"+str);
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
				
				name=inputLine.indexOf("Do");
				
				if(inputLine.indexOf("Do")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=name;i<ch.length-40
							;i++) {
						
						if(ch[i]=='<'||ch[i]=='/') break;
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
				
				price=inputLine.indexOf("$2");
				
				if(inputLine.indexOf("$2")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=price;i<10;i++) {
						
						if(ch[i]=='/'||ch[i]=='<') break;
						else if((ch[i]>='0'&&ch[i]<='9')||(ch[i]=='.'))
						System.out.print(ch[i]);
						flag=true;
					
					}
					
					if(flag==true) {
						
					}
				}
			
			}System.out.println("\n");
	}
/*---------------------------------------------------------------------------------------------------------*/
	public   void Data4(String str) throws IOException {
		
		URL info = new URL("https://wordery.com/pixel-art-for-game-developers-daniel-silber-"+str);
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
				
				name=inputLine.indexOf("Pi");
				
				if(inputLine.indexOf("Pi")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=name;i<ch.length-40
							;i++) {
						
						if(ch[i]=='<'||ch[i]=='/') break;
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
				
				price=inputLine.indexOf("$6");
				
				if(inputLine.indexOf("$6")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=price;i<10;i++) {
						
						if(ch[i]=='/'||ch[i]=='<') break;
						else if((ch[i]>='0'&&ch[i]<='9')||(ch[i]=='.'))
						System.out.print(ch[i]);
						flag=true;
					
					}
					
					if(flag==true) {
						
					}
				}
			
			}System.out.println("\n");
	}
	/*---------------------------------------------------------------------------------------------------------*/
	public   void Data5(String str) throws IOException {
		
		URL info = new URL("https://wordery.com/professional-c-2012-and-net-45-christian-nagel-"+str);
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
				
				name=inputLine.indexOf("Pro");
				
				if(inputLine.indexOf("Pro")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=name;i<ch.length-40
							;i++) {
						
						if(ch[i]=='<'||ch[i]=='/') break;
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
				
				price=inputLine.indexOf("$8");
				
				if(inputLine.indexOf("$8")!=-1) {
				
					char[] ch=inputLine.toCharArray();
					
					for(int i=price;i<10;i++) {
						
						if(ch[i]=='/'||ch[i]=='<') break;
						else if((ch[i]>='0'&&ch[i]<='9')||(ch[i]=='.'))
						System.out.print(ch[i]);
						flag=true;
					
					}
					
					if(flag==true) {
						
					}
				}
			
			}System.out.println("\n");
	}

}
/*gjnbiorwmrb*/
package SPL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Indigo {
	public   void Data1(String st) throws IOException {

		URL info = new URL("https://www.chapters.indigo.ca/en-ca/books/computer-science-an-interdisciplinary-approach/"+st+"-item.html?ikwsec=Books&ikwidx=14");
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

			name=inputLine.indexOf("Comp");

			if(inputLine.indexOf("Comp")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length-33
						;i++) {

					if(ch[i]=='<'||ch[i]=='/') break;
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

			price=inputLine.indexOf("price");

			if(inputLine.indexOf("price")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<31;i++) {

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

	public   void Data2(String str) throws IOException {

		URL info = new URL("https://www.chapters.indigo.ca/en-ca/books/computer-science-a-very-short/"+str+"-item.html?ikwsec=Books&ikwidx=49");
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

			name=inputLine.indexOf("Comp");

			if(inputLine.indexOf("Comp")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length-33
						;i++) {

					if(ch[i]=='<'||ch[i]=='/') break;
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

			price=inputLine.indexOf("price");

			if(inputLine.indexOf("price")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<31;i++) {

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

	public   void Data3(String str) throws IOException {

		URL info = new URL("https://www.chapters.indigo.ca/en-ca/books/computers-ethics-and-society/"+str+"-item.html?ikwsec=Books&ikwidx=54");
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

			name=inputLine.indexOf("Comp");

			if(inputLine.indexOf("Comp")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length-33
						;i++) {

					if(ch[i]=='<'||ch[i]=='/') break;
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

			price=inputLine.indexOf("price");

			if(inputLine.indexOf("price")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<31;i++) {

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
	public   void Data4(String str) throws IOException {

		URL info = new URL("https://www.chapters.indigo.ca/en-ca/books/the-apollo-guidance-computer-architecture/"+str+"-item.html?ikwid=computer+architecture&ikwsec=Home&ikwidx=3");
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

			name=inputLine.indexOf("Apollo");

			if(inputLine.indexOf("Apollo")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length-33
						;i++) {

					if(ch[i]=='<'||ch[i]=='/') break;
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

			price=inputLine.indexOf("price");

			if(inputLine.indexOf("price")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<31;i++) {

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
	public   void Data5(String str) throws IOException {

		URL info = new URL("https://www.chapters.indigo.ca/en-ca/books/core-java-professional-think-twice/"+str+"-item.html?ikwid=java+programming&ikwsec=Home&ikwidx=28");
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						info.openStream()));
		String inputLine;

		boolean flag=false;
		int  price;
		int name;

		System.out.print("Books name and author Name:");	
		while ((inputLine = in.readLine()) != null) {

			flag=false;

			name=inputLine.indexOf("core");

			if(inputLine.indexOf("core")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=name;i<ch.length-20
						;i++) {

					if(ch[i]=='<'||ch[i]=='/') break;
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

			price=inputLine.indexOf("price");

			if(inputLine.indexOf("price")!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<31;i++) {

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

