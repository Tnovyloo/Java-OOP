module lab12 {
    requires javafx.controls;
    requires javafx.fxml;

    opens lab12 to javafx.fxml;
    exports lab12;
}
