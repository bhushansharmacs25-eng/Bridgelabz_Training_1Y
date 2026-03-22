package java_interfaces.MarkerInterfaces;

class ConfigPrototype implements Cloneable {
    String configName;
    
    public ConfigPrototype(String name) {
        this.configName = name;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "Config{" + "name='" + configName + '\'' + '}';
    }
}

public class CloningPrototypeObjects {
    public static void main(String[] args) {
        try {
            ConfigPrototype original = new ConfigPrototype("PrimaryDBCluster");
            ConfigPrototype copy = (ConfigPrototype) original.clone();
            
            System.out.println("Original: " + original);
            System.out.println("Clone: " + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
