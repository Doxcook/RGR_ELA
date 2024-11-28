import controller.Controller;
import model.Model;
import view.Frame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Frame frame = new Frame();
        Controller controller = new Controller(model, frame);
    }
}