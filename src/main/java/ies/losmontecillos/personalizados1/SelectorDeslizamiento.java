package ies.losmontecillos.personalizados1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class SelectorDeslizamiento extends HBox {
    @FXML
    private Label label;
    @FXML
    private Button buttonLeft;
    @FXML
    private Button buttonRight;

    public SelectorDeslizamiento() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SelectorDeslizamiento.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //configura el título del selector
    public void setTitle(String title) {
        label.setText(title);
    }

    public Button getBtnLeft() {
        return buttonLeft;
    }

    public Button getBtnRight() {
        return buttonRight;
    }


}
