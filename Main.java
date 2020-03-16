import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {

       try {
           String url = "http://archaeology.jp/learning/university/2018kougiichiran/#";

           Document doc = Jsoup.connect(url).get();

           Elements elm = doc.select("tbody tr");

           for(Element elms: elm){
               String title = elms.text();
               System.out.println(title);
           }

       } catch(IOException e){
           e.printStackTrace();
       }
    }
}
