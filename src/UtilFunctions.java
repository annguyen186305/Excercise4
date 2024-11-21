// Nhánh feature-rocket-util - file UtilFunctions.java
public class UtilFunctions {

    // Function này sẽ gây xung đột với function ở nhánh feature-rocket-24h
    public static String formatString(String input) {
        return input.trim().toLowerCase();
    }
}
