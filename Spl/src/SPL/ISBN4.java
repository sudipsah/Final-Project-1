package SPL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class ISBN4{
	public   void Data1(String str) throws IOException {

		URL source = new URL("https://www.abebooks.com/servlet/SearchResults?fe=on&kn="+str+"&sortby=17&cm_sp=pan-_-srp-_-fe");
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						source.openStream()));
		String inputLine;	
		boolean flag=false;
		int indexForTitle;
		int price;
		System.out.print("ISBN number"+str+"\n");	
		System.out.print("Book's name:\n");	
		while ((inputLine = in.readLine()) != null) {

			flag=false;

			indexForTitle=inputLine.indexOf("Pixel");

			if(indexForTitle!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=indexForTitle;i<ch.length;i++) {

					if(ch[i]=='<'||ch[i]=='/'||ch[i]=='b') break;
					System.out.print(ch[i]);

					flag=true;

				}
				System.out.print("\nAuthor's name:\n");
				indexForTitle=inputLine.indexOf("Dan");

				if(indexForTitle!=-1) {

					char[] ch1=inputLine.toCharArray();

					for(int i=indexForTitle;i<ch1.length-134;i++) {

						if(ch1[i]=='<') break;
						System.out.print(ch1[i]);

						flag=true;

					}


				}

				if(flag==true) break;
			}
		}

		System.out.print("\nfrom abe.com\nPrice:");
		while ((inputLine = in.readLine()) != null) {

			price=inputLine.indexOf("US$");

			if(price!=-1) {

				char[] ch=inputLine.toCharArray();

				for(int i=price;i<ch.length;i++) {

					if(ch[i]=='<'||ch[i]=='/') break;
					System.out.print(ch[i]);
					flag=true;

				}

				if(flag==true) {
					System.out.println("");

				}
			}
		}

		URL source1 = new URL("https://wordery.com/pixel-art-for-game-developers-daniel-silber-"+str);
		BufferedReader in1 = new BufferedReader(
				new InputStreamReader(
						source1.openStream()));
		String inputLine1;	
		boolean flag1=false;
		int price1;
		System.out.print("\nfrom wordery.com\nPrice:$");
		while ((inputLine1 = in1.readLine()) != null) {

			price1=inputLine1.indexOf("u-fs--ex u-t--lh1");

			if(price1!=-1) {

				char[] ch=inputLine1.toCharArray();

				for(int i=price1;i<ch.length;i++) {

					if(ch[i]=='<') break;
					else if((ch[i]>='1'&&ch[i]<='9')||ch[i]=='.')
						System.out.print(ch[i]);

					flag1=true;

				}

				if(flag1==true) {
					System.out.println("");

				}
			}
		}
		URL source2 = new URL("https://www.chapters.indigo.ca/en-ca/books/pixel-art-for-game-developers/"+str+"-item.html?ref=isbn-search");
	BufferedReader in2 = new BufferedReader(
				new InputStreamReader(
						source2.openStream()));
		String inputLine2;	
		boolean flag2=false;
		int price2;
		System.out.print("\nfrom indigo.com\nPrice:$");
		while ((inputLine2 = in2.readLine()) != null) {

			price2=inputLine2.indexOf("price-list");

			if(price2!=-1) {

				char[] ch=inputLine2.toCharArray();

				for(int i=price2;i<ch.length;i++) {

					if(ch[i]=='/') break;
				else if((ch[i]>='0'&&ch[i]<='9')||ch[i]=='.')
						System.out.print(ch[i]);

					flag2=true;

				}

				if(flag2==false) {
					System.out.println("");

				}
			}
		}
		URL source3 = new URL("http://www.powells.com/searchresults?keyword="+str);
		BufferedReader in3 = new BufferedReader(
				new InputStreamReader(
						source3.openStream()));
		String inputLine3;	
		boolean flag3=false;
		int price3;
		System.out.print("\nfrom powells.com\nPrice:$");
		while ((inputLine3 = in3.readLine()) != null) {

			price3=inputLine3.indexOf("reg-price");

			if(price3!=-1) {

				char[] ch3=inputLine3.toCharArray();

				for(int i=price3;i<ch3.length;i++) {

					if(ch3[i]=='<'||ch3[i]=='/') break;
					else if((ch3[i]>='0'&&ch3[i]<='9')||ch3[i]=='.')
						System.out.print(ch3[i]);

					flag3=true;

				}

				if(flag3==true) {
					System.out.println("");

				}
			}
		}
		URL source4 = new URL("https://www.bookwire.com/book/USA/Pixel-Art-for-Game-Developers-"+str+"-Silber-Daniel-51010301");
		BufferedReader in4 = new BufferedReader(
				new InputStreamReader(
						source4.openStream()));
		String inputLine4;	
		boolean flag4=false;
		int price4;
		System.out.print("\nfrom bookwire.com\nPrice:$");
		while ((inputLine4 = in4.readLine()) != null) {

			price4=inputLine4.indexOf("priceSpan");

			if(price4!=-1) {

				char[] ch4=inputLine4.toCharArray();

				for(int i=price4;i<ch4.length;i++) {

					if(ch4[i]=='<'||ch4[i]=='/') break;
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

}
