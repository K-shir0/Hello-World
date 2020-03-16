import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {

       try {
           String url = "https://google.com";
//           Document doc = Jsoup.connect("https://www.yahoo.co.jp/").get();

           Document doc = Jsoup.connect(url).get();
           Elements elm = doc.select("title");

           for(Element elms: elm){
               String title = elms.text();
               System.out.println(title);
           }

       } catch(IOException e){
           e.printStackTrace();
       }
    }
}
