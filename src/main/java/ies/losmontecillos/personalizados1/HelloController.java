package ies.losmontecillos.personalizados1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private SelectorDeslizamiento selectorUp;

    @FXML
    private SelectorDeslizamiento selectorDown;

    @FXML
    private Label pressedText;

    @FXML
    public void initialize() {
        // Configuración adicional si es necesaria
        selectorUp.setTitle("uno");
        selectorDown.setTitle("dos");

        // Establecer eventos para los botones
        selectorUp.getBtnLeft().setOnAction(e -> {
            pressedText.setText("Pulsado por selector de arriba");
            pressedText.setStyle("-fx-text-fill: red;");
        });
        selectorUp.getBtnRight().setOnAction(e -> {
            pressedText.setText("Pulsado por selector de arriba");
            pressedText.setStyle("-fx-text-fill: red;");
        });

        selectorDown.getBtnLeft().setOnAction(e -> {
            pressedText.setText("Pulsado por selector de abajo");
            pressedText.setStyle("-fx-text-fill: green;");
        });

        selectorDown.getBtnRight().setOnAction(e -> {
            pressedText.setText("Pulsado por selector de abajo");
            pressedText.setStyle("-fx-text-fill: green;");
        });
    }
}
