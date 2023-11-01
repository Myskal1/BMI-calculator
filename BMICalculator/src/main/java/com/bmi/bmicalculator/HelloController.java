package com.bmi.bmicalculator;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private TextField inputHeight;
    @FXML
    private TextField inputWeight;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private RadioButton metric;
    @FXML
    private RadioButton english;

    public void calculate() {
        if (metric.isSelected()) {
            if (inputWeight.getText().trim().isEmpty() || inputHeight.getText().trim().isEmpty()) {
                Alert a = new Alert(AlertType.NONE);
                a.setContentText("Please, enter!");
                a.setAlertType(AlertType.ERROR);
                a.show();
            } else {
                float a = Float.parseFloat(inputHeight.getText());
                float b = Float.parseFloat(inputWeight.getText());
                float bmi = b / (a * a);
                label1.setText("" + bmi);

                if (bmi <= 18.5) {
                    label2.setText("Underweight!");
                } else if (bmi > 18.5 && bmi <= 24.9) {
                    label2.setText("Normal!");
                } else if (bmi >= 25 && bmi <= 29.9) {
                    label2.setText("Overweight!");
                } else if (bmi > 30) {
                    label2.setText("Obese!");
                }
            }
        } else if (english.isSelected()) {
            if (inputWeight.getText().trim().isEmpty() || inputHeight.getText().trim().isEmpty()) {
                Alert a = new Alert(AlertType.NONE);
                a.setContentText("Please, enter!");
                a.setAlertType(AlertType.ERROR);
                a.show();
            } else {
                float a = Float.parseFloat(inputHeight.getText());
                float b = Float.parseFloat(inputWeight.getText());
                float bmi = 703 * (b / (a * a));
                label1.setText("" + bmi);

                if (bmi <= 18.5) {
                    label2.setText("Underweight!");
                } else if (bmi > 18.5 && bmi <= 24.9) {
                    label2.setText("Normal!");
                } else if (bmi >= 25 && bmi <= 29.9) {
                    label2.setText("Overweight!");
                } else if (bmi > 30) {
                    label2.setText("Obese!");
                }
            }
        }
    }


        @FXML
        protected void OnButtonCalculateClick () {
            calculate();
        }


}