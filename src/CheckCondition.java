public class CheckCondition {
    public static String checkCondition(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }


}




