package java_interfaces.FunctionalInterfaces;

import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        double threshold = 35.0;
        Predicate<Double> isOverHeating = temp -> temp > threshold;
        
        double currentTemp = 38.5;
        if (isOverHeating.test(currentTemp)) {
            System.out.println("ALERT! Temperature crossed the threshold: " + currentTemp);
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
