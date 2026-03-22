package java_interfaces.StaticMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatterUtil {
    static String format(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("US Format: " + DateFormatterUtil.format(today, "MM/dd/yyyy"));
        System.out.println("Euro Format: " + DateFormatterUtil.format(today, "dd-MM-yyyy"));
        System.out.println("ISO Format: " + DateFormatterUtil.format(today, "yyyy-MM-dd"));
    }
}
