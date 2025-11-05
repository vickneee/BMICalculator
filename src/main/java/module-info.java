module bmi.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens bmi.bmicalculator to javafx.fxml;
    exports bmi.bmicalculator;
}