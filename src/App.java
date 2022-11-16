import java.io.FileInputStream;
import java.util.Properties;

import service.PrevisaoService;

public class App {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/App.properties"));

        final String WEATHER_MAP_BASEURL =
                      properties.getProperty("WEATHER_MAP_BASEURL");
        final String WEATHER_MAP_APPID = 
                      properties.getProperty("WEATHER_MAP_APPID");

        PrevisaoService service = new PrevisaoService();
        
        service.obterPrevisoesWeatherMap(
          WEATHER_MAP_BASEURL, 
          WEATHER_MAP_APPID, 
          "Itu");
    }
}
