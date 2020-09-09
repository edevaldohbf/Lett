import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Config {
    private String path = "/home/dlopes/GitHub - Edevaldo/Web Scraper/file.txt";
    private String link = "https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=102437&gclid=CjwKCAjw19z6BRAYEiwAmo64LWH8HYSWOcI7mLktsfmCOrVcwXab0WvZ9PvZV-S1XGFKJ1yHd76dSRoCQZgQAvD_BwE";
    private OutputStreamWriter writer;

    public Config (){
        configFile();
        executar();
    }

    private void executar(){

    }

    private void configFile(){
        try{
            File file = new File(path);

            if(!file.exists()){
                file.createNewFile();
            }

            writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            writer.write("Nome\tPreço à vista\tPreço a prazo\tQuantidade em estoque\tClock base\tClock boost");
            writer.flush();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
