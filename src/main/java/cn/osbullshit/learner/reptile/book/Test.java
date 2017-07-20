/** 
 * Project Name:Learner 
 * File Name:Test.java 
 * Package Name:cn.osbullshit.learner.reptile.book 
 * Date:2017年7月20日下午4:07:02 
 * 
 */  
  
package cn.osbullshit.learner.reptile.book;  

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

/** 
 * ClassName:Test 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月20日 下午4:07:02 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Test {

	public static void main(String[] args) {
		String url = "https://www.douban.com/note/629076130/";
		try{
			Document doc = Jsoup.connect(url)
					.header("Cookie", "ll=\"108289\"; bid=fiO_G4j9bxE; __utmt=1; regpop=1; __utma=30149280.771018158.1500540092.1500540092.1500540092.1; __utmb=30149280.3.10.1500540092; __utmc=30149280; __utmz=30149280.1500540092.1.1.utmcsr=baidu|utmccn=(organic)|utmcmd=organic")
					.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")
					.header("Host", "erebor.douban.com")
					.header("Referer", "https://www.douban.com/note/629076130/")
					.get();
			
			Elements elements = doc.select("#link-report p");
			for(Element e : elements) {
				String href = e.attr("href");
				String str = e.html();
				System.out.println("当前爬取:"+str);
//				get(str,url+href);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void get(String title,String url) {
		try{
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.select("table tbody tr td[bgcolor=#FFFFFF] p");
			File file = new File("C:\\zhiqingchun.txt");
			if(!file.exists())
				file.createNewFile();
			OutputStream os = new FileOutputStream(file,true);
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
			PrintWriter pw = new PrintWriter(osw,true);
			pw.println(title);
			pw.print(elements.get(0).html());
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
 