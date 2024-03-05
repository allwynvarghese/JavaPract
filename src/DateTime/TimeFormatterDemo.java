package DateTime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatterDemo {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss:SS");
        System.out.println("Local date: "+dtf.format(dt));
        DateTimeFormatter ztf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss:SS z Z");
        System.out.println("Zoned Date time: "+ ztf.format(zdt));



    }
}
