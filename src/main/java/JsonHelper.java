import com.fasterxml.jackson.databind.ObjectMapper;
import ru.qatools.json2pojo.beans.Config;
import ru.qatools.json2pojo.beans.ConfigKey;
import ru.qatools.json2pojo.beans.PositiveCases;
import ru.qatools.json2pojo.beans.Querystring;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

public class JsonHelper {
    ObjectMapper objectMapper = new ObjectMapper();
    Config config;


    {
        try {
            config = objectMapper.readValue(new File("config.json"), Config.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String createUrl(String location, String keyName, String radius, String rankby, String address, String endpoint, String key){
        String url = firstPart(address,endpoint) + location(location)+ keyName(keyName)+ radius(radius) + rankby(rankby);
        System.out.println("url: " + url);
        return url;
    }


    private String firstPart(String address, String endpoint){
        return address+endpoint+"?";
    }
    private String location(String location){
        if(location != null){
            return "location=" + location;
        }
        return "";
    }

    private String keyName(String keyName){
        if(keyName != null){
            return "&key=" + "AIzaSyCWOSz0D-dfNnfv7FJh6pP3dghHM9NmyuQ";  // вот тут должна быть нормальная подгрузка ключа
        }
        return "";
    }

    private String radius(String radius){
        if(radius != null){
            return "&radius=" + radius;
        }
        return "";
    }
    private String rankby(String rankby){
        if(rankby != null){
            return "&rankby=" + rankby;
        }
        return "";
    }


}
