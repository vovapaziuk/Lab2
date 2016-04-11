package sample;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;

public class Controller {
    @FXML
    Button buttonOne;

    public void pressButton(ActionEvent actionEvent) {
        buttonOne.setLayoutX(10);
        System.out.println("1");
    }


}
