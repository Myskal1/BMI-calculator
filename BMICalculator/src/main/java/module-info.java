module com.bmi.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bmi.bmicalculator to javafx.fxml;
    exports com.bmi.bmicalculator;
}