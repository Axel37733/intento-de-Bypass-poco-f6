public class BypassService {
    public static void set(boolean on) {
        if(on) BypassUtils.enable();
        else BypassUtils.disable();
    }
}
