package baseUtils;

public class RunningConditions {

    //тут выборка по запуску определенных тестов исохдя из окружения...Прибегая к Assume

    public static boolean dontRunOnProd(){
        String env = System.getProperty("env");
        if (env.equalsIgnoreCase("prod")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean dontRunOnStaging() {
        String env = System.getProperty("env");
        if (env.equalsIgnoreCase("staging")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean dontRunOnDev() {
        String env = System.getProperty("env");
        if (env.equalsIgnoreCase("dev")) {
            return false;
        } else {
            return true;
        }

    }
}
