package java_interfaces.StaticMethods;

interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
    
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

public class UnitConversionTool {
    public static void main(String[] args) {
        double km = 10.0;
        double kg = 5.0;
        
        System.out.println(km + " km is " + UnitConverter.kmToMiles(km) + " miles.");
        System.out.println(kg + " kg is " + UnitConverter.kgToLbs(kg) + " lbs.");
    }
}
