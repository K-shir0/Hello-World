import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {

       try {
           String url = "https://news.yahoo.co.jp";

           Document doc = Jsoup.connect(url).get();

           Elements newsHeadlines = doc.select(".topicsList li.topicsListItem a");

           for(Element headline: newsHeadlines){

               System.out.println("title: " + headline.ownText() + ", href: " + headline.absUrl("href"));
           }

       } catch(IOException e){
           e.printStackTrace();
       }
    }
}
