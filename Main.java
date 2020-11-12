import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long unixSeconds = 1605188168;
        Date date = new java.util.Date(unixSeconds*1000L);
        String[] patterns = {"dd-MM-yyyy HH:mm:ss z", "yyyy", "MM", "dd"};
        //SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
        //sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT+3"));
        //String formattedDate = sdf.format(date);
        //System.out.println(formattedDate);
        for (String pattern : patterns) {
            System.out.println(new SimpleDateFormat(pattern).format(date));
        }
    }
}
