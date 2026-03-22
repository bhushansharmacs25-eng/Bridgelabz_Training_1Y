// 11. Document Inheritance Behavior
/**
 * Base class for UI components.
 * Subclasses MUST override render().
 */
abstract class UIComponent {
    abstract void render();
}
class Button extends UIComponent {
    @Override void render() { System.out.println("Button Rendered"); }
}
public class DocumentInheritance {
    public static void main(String[] args) { new Button().render(); }
}
