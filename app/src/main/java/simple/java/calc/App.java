/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package simple.java.calc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       Gui gui = new Gui();
       gui.setVisible(true);
    }
}
