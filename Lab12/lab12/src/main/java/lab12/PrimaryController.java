package lab12;

import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void printToConsole() throws IOException {
        System.out.println("TRYING TO DO SMTH");
    }

    @FXML
    private void showClosePanel() throws IOException {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Zamknąć program?");
        alert.setHeaderText("Zamknąć program?");

        ButtonType yesButtonType = new ButtonType("Tak");
        ButtonType noButtonType = new ButtonType("Nie");
        alert.getButtonTypes().setAll(yesButtonType, noButtonType);

        alert.showAndWait().ifPresent(response -> {
            if (response == yesButtonType) {
                System.out.println("Yesesss button!");
            } else {
                System.out.println("Noooo button!");
            }
        });
    }
}
