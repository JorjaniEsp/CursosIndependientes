package com.calcufx.controller;

import com.calcufx.model.Cal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.swing.*;

public class HelloController {
    Cal cal = new Cal();
    @FXML
    private TextField numA;
    @FXML
    private TextField numB;
    @FXML
    private TextField respuesta;
    @FXML
    private RadioButton suma;
    @FXML
    private RadioButton rest;
    @FXML
    private RadioButton mult;
    @FXML
    private RadioButton div;

    @FXML
    public void calcular() {
        String campoA = numA.getText();
        double num1 = Double.parseDouble(campoA);

        String campoB = numB.getText();
        double num2 = Double.parseDouble(campoB);

        if (suma.isSelected()) {
            double resultado = cal.suma(num1, num2);
            String CampRespuesta = String.valueOf(resultado);
            respuesta.setText(CampRespuesta);
        } else if (rest.isSelected()) {
            double resultado = cal.mult(num1, num2);
            String CampRespuesta = String.valueOf(resultado);
            respuesta.setText(CampRespuesta);
        } else if (mult.isSelected()) {
            double resultado = cal.rest(num1, num2);
            String CampRespuesta = String.valueOf(resultado);
            respuesta.setText(CampRespuesta);
        } else {
            double resultado = cal.div(num1, num2);
            String CampRespuesta = String.valueOf(resultado);
            respuesta.setText(CampRespuesta);
        }

    }
    @FXML
    public void limpiar() {
        numB.setText("");
        numA.setText("");
        respuesta.setText("");
    }
}
