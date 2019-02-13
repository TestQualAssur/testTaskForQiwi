package baseUtils;

import com.moandjiezana.toml.Toml;

import java.io.File;

public class Requests {

    public static Toml toml = new Toml().read(new File("config.toml"));

    private static String HOST = toml.getString("main.api_base_url");

    public static final String REQUEST_TO_GET_CASE = HOST + "index.php?/api/v2/get_case/";

}
