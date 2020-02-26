package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("./resources/hti.properties");
        props.load(file);
        return props;

    }

    public static void  main(String args[]) throws IOException {
        String browser; //Variavel que guardará o login do servidor.
        System.out.println("************Teste de leitura do arquivo de propriedades************");

        Properties prop = getProp();

        browser = prop.getProperty("browser");

        System.out.println("Browser = " + browser);
    }

}
