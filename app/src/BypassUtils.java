public class BypassUtils {

    public static void write(String path, String value) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter(path);
            fw.write(value);
            fw.close();
        } catch (Exception e) {}
    }

    public static boolean exists(String path) {
        return new java.io.File(path).exists();
    }

    public static void enable() {
        if (exists("/sys/class/power_supply/battery/charge_control_limit"))
            write("/sys/class/power_supply/battery/charge_control_limit", "0");
    }

    public static void disable() {
        if (exists("/sys/class/power_supply/battery/charge_control_limit"))
            write("/sys/class/power_supply/battery/charge_control_limit", "1");
    }
}
