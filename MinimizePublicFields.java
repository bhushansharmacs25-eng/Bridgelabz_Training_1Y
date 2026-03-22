// 7. Minimize Public Fields in Superclasses
class Base {
    private int secretData = 42;
    protected int getSecretData() { return secretData; }
}
class Derived extends Base {
    void show() { System.out.println(getSecretData()); }
}
public class MinimizePublicFields {
    public static void main(String[] args) { new Derived().show(); }
}
