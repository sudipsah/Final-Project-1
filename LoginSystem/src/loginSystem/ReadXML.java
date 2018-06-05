package loginSystem;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;

public class ReadXML {
		
	public String email;
	public String password;
	public boolean flag; 
	
	public void ReadXml(String email, String password ){
		
		this.email=email;
		this.password=password;
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		Document du = null;
		try {
			du = db.parse(new File("details.xml"));
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		Element element= du.getDocumentElement();
			
		NodeList list=element.getChildNodes();
		checkUserNameandPassword(list);
					
	}

	private void	checkUserNameandPassword(NodeList list){
			
		for(int i=0;i<list.getLength();i++) {
					
			Node node=list.item(i);
			
			if(node.getNodeType()==Node.ELEMENT_NODE) {
						
				Element element1=(Element) node;
				
				String s1=element1.getElementsByTagName("Email").item(0).getTextContent();
				String s2=element1.getElementsByTagName("password").item(0).getTextContent();
				
				if(s1.equals(email)&&s2.equals(password)) {
					
					System.out.println("userName:"+element1.getElementsByTagName("userName").item(0).getTextContent());
					System.out.println("email:"+element1.getElementsByTagName("Email").item(0).getTextContent());
					System.out.println("password:"+element1.getElementsByTagName("password").item(0).getTextContent());
					System.out.println("gender:"+element1.getElementsByTagName("gender").item(0).getTextContent());
					System.out.println("dateOfBirth:"+element1.getElementsByTagName("dateOfBirth").item(0).getTextContent());
					System.out.println();
					
					flag=true;
					return;
				}
											
			}
		}
		
		flag=false;
	}

}
