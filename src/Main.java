import controller.Controller;
import view.Frame;
import model.Model;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Model model = new Model(); // создание модели
        Frame frame = new Frame(); //создание рамки
        Controller controller = new Controller(model, frame);
    }
}
