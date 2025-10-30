module bmi.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens bmi.bmicalculator to javafx.fxml;
    exports bmi.bmicalculator;
}