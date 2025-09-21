module org.example.mycalculater {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.mycalculater to javafx.fxml;
    exports org.example.mycalculater;
}