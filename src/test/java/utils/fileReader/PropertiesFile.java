package utils.fileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

    public static Properties ReadPropertiesFile(){
        Properties props = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream("src/test/resources/hti.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            props.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }


    public static void  main(String args[]) throws IOException {
        String browser; //Variavel que guardará o login do servidor.
        System.out.println("************Teste de leitura do arquivo de propriedades************");

        Properties prop = ReadPropertiesFile();

        browser = prop.getProperty("browser");

        System.out.println("Browser = " + browser);
    }

}
