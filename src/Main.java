import java.nio.file.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        //use your logfile location
        String filePath = "C:\\Users\\Madhan\\Desktop\\CCBU.2024-01-10T05-10-55.125.log";

        try {

            String logContent = new String(Files.readAllBytes(Paths.get(filePath)));


            String timePattern = "\\d{2}:\\d{2}:\\d{2}";


            Pattern pattern = Pattern.compile(timePattern);

            Matcher matcher = pattern.matcher(logContent);

            while (matcher.find()) {
                System.out.println("Time: " + matcher.group());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}