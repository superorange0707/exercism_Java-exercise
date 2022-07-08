public class LogLevels {

    public static String message(String logLine) {
        int index = logLine.indexOf(" ")+1;
        int length = logLine.length();
        String string1 = logLine.substring(index, length);
        string1 = string1.trim();
        return string1;
    }

    public static String logLevel(String logLine) {
        int index1 = logLine.indexOf("[")+1;
        int index2 = logLine.indexOf("]");
        String string1 = logLine.substring(index1, index2);
        string1 = string1.toLowerCase();
        return string1;
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String info = logLevel(logLine);
        String sum = message + " (" + info + ")";
        return sum;
    }
}
