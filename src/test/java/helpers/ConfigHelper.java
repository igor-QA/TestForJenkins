package helpers;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getURL() {
        return getConfig().remoteUrl();
    }

    public static String getVideo() {
        return getConfig().remoteVideo();
    }

    public static WebConfig getConfig() {
        if (System.getProperty("test") == null) System.setProperty("environment", "test"); // test, preprod

        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }

}