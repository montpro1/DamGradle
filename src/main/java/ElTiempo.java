import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class ElTiempo {
    public static void main(String[]args) throws IOException {
        Document doc = Jsoup.connect(" https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
        //System.out.println(doc.body());

        Element miElemento =  doc.getElementsByClass("today_nowcard-phrase").first();
doc.title();
        System.out.println(miElemento);
        Element miElemento2 =  doc.getElementsByClass("today_nowcard-temp").first();
        System.out.println(miElemento2);
        String miElemtento3=doc.title();
        System.out.println(miElemtento3);
    }
}
