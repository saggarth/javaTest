import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long unixSeconds = 1605188168;
        System.out.println(dateConv("f", unixSeconds));
        System.out.println(dateConv("y", unixSeconds));
        System.out.println(dateConv("m", unixSeconds));
        System.out.println(dateConv("d", unixSeconds));
    }

    static String dateConv (String k, long timestamp) {
        Date date = new Date(timestamp * 1000L);
        switch (k) {
            case "f": return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z").format(date); //возвращает полное значение даты и времени
            case "y": return new SimpleDateFormat("yyyy").format(date); //возвращает год
            case "m": return new SimpleDateFormat("MM").format(date); //возвращает месяц
            case "d": return new SimpleDateFormat("dd").format(date); //возвращает день
        }
        return null;
    }
}
