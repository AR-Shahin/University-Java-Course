import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label ;

    @FXML
    private Button addBtn;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private TextField result;

    @FXML
    void doAdd(ActionEvent event) {
        System.out.println("hi");
    }

    @FXML
    void doClear(ActionEvent event) {

    }

}
