import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {

       try {
           String url = "https://techacademy.jp/";

           Document doc = Jsoup.connect(url).get();
           Elements courses = doc.select(".top-bootcamp-courses div.block-content h3");

           for(Element course: courses){
               System.out.println(course.text());
           }

       } catch(IOException e){
           e.printStackTrace();
       }
    }
}
