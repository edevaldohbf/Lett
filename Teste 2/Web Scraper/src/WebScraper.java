import java.io.IOException;
import java.sql.SQLOutput;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

public class WebScraper {
    public static void main(String[] args) throws IOException{
        //new Config();
        Document document = Jsoup.connect("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=102437&gclid=CjwKCAjw19z6BRAYEiwAmo64LWH8HYSWOcI7mLktsfmCOrVcwXab0WvZ9PvZV-S1XGFKJ1yHd76dSRoCQZgQAvD_BwE").get();

        //System.out.println(document);

        System.out.println(document.getElementsByTag("title"));
        //System.out.println(document.getElementsByTag("span"));
        System.out.println(document.getElementsContainingOwnText("class=\"preco_desconto_avista-cm\">R$ 1.599,90"));
        //System.out.println(document.getElementsByAttribute("preco_desconto_avista-cm"));
                //getElementsContainingOwnText("preco_desconto_avista-cm"));
    }
}
