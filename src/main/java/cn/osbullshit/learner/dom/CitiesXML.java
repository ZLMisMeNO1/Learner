/** 
 * Project Name:Learner 
 * File Name:CitiesXML.java 
 * Package Name:cn.osbullshit.learner.dom 
 * Date:2017年7月14日上午11:29:42 
 * 
 */  
  
package cn.osbullshit.learner.dom;  

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.Text;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Entity;

/** 
 * ClassName:CitiesXML 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月14日 上午11:29:42 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class CitiesXML {

	private static Logger log = Logger.getLogger(CitiesXML.class);
	
	private static Document cities = null;
	
	
	
	XMLWriter writer = null;
	FileWriter fw = null;
	public CitiesXML(){
		SAXReader reader = new SAXReader();
		ClassLoader classLoader = null;
		try {
			classLoader = getClass().getClassLoader();
			cities = reader.read(classLoader.getResource("xml/cities.xml"));
			Element root = cities.getRootElement();
			log.info("rootName:" + root.getName());
			int nodeCount = root.nodeCount();
			log.info("nodeCount :" + nodeCount);
			List<Element> elementList = root.elements();
			
//			Node currentNode;
//			for(int i = 0;i < nodeCount ;i ++) {
//				currentNode = root.node(i);
//				log.debug("currentNodeName : " + currentNode.asXML());
//			}
		
		} catch(Exception e) {
			log.error("error : " + e);
		}
	}
	public void printNode(Element root) {
		int len = root.nodeCount();
		Element child;
		for(int i=0;i<len;i++) {
		}
	}
	public void test() throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		FileWriter fw = null;
		XMLWriter xw = null;
		String path = null;
		try {
			path = classLoader.getResource("xml/abc1.xml").getPath();
			log.info("path : " + path);
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("utf-8");
			format.setTrimText(true);
			fw = new FileWriter(path);
			xw = new XMLWriter(fw,format);
			Element root = DocumentHelper.createElement("books");
			root.addNamespace("this", getClass().toString());
			
			Element namespace = root.addElement("namespace");
			namespace.addAttribute("bean", this.getClass().toString());
			
			Element book;
			Element detail;
			for(int i = 0; i < 5 ;i ++) {
				book = namespace.addElement("book");
				book.addAttribute("index", String.valueOf(i));
				book.addNamespace("pre", "bookNamespace"+i);
				detail = book.addElement("detail");
				detail.addElement("name").setText("bookName_"+i);
				detail.addElement("price").setText(String.valueOf(i));
			}
			xw.write(root);
			xw.flush();
			xw.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws IOException{
		CitiesXML a = new CitiesXML();
	}
}
 