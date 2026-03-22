// 17. Avoid Inheriting from Concrete Classes
interface Logger { void log(String msg); }
// Concrete class FileLogger implements Logger
class ConsoleLogger implements Logger {
    public void log(String msg) { System.out.println(msg); }
}
// Avoid subclassing ConsoleLogger directly. Use Logger interface.
public class AvoidInheritingConcrete {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger(); logger.log("Test log");
    }
}
