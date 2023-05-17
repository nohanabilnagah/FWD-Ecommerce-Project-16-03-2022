package utilities;

public class BrowserUtils {

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int convertStringToInt(String text) {
 // example    String ss = "1032$aqwert";
        String value = text.replaceAll("[^0-9^]", "");
        return Integer.parseInt(value);
    }
}
