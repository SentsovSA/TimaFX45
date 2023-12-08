package com.example.timafx45;

import com.example.Tima45.Colors;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;

public class Controller {
    public AnchorPane getAnchorPane() {
        return anchorPane;
    }

    @FXML
    private CheckBox checkBox;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button button;

    @FXML
    private TextField percentTF;

    @FXML
    private TextField poruchTF;

    @FXML
    private TextField srokTF;

    @FXML
    private TextField sumTF;

    @FXML
    void onFocusChanged(MouseEvent event) {
        if(event.getSource() instanceof TextField) {
            changeTextFieldColor((TextField) event.getSource());
        }
    }
    @FXML
    void onClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Срок кредита!");

        alert.setHeaderText(null);
        if(!srokTF.getText().isEmpty()) {
            alert.setContentText(srokTF.getText());
        } else alert.setContentText("Введите срок кредитования");

        alert.showAndWait();
    }

    void changeTextFieldColor(TextField textField) {
        if(textField.isFocused()) textField.setBackground(Background.fill(com.example.Tima45.Colors.FOCUSED));
        else textField.setBackground(Background.fill(com.example.Tima45.Colors.UNFOCUSED));
    }

    @FXML
    void onMouseExited(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Верни курсор!");

        alert.setHeaderText(null);
        alert.setContentText("ВЕРНИ КУРСОР!");

        alert.showAndWait();
    }

    @FXML
    void onTrue(ActionEvent event) {
        if(checkBox.isSelected()) {
            percentTF.setBackground(Background.fill(Colors.FOCUSED));
            poruchTF.setBackground(Background.fill(Colors.FOCUSED));
            srokTF.setBackground(Background.fill(Colors.FOCUSED));
            sumTF.setBackground(Background.fill(Colors.FOCUSED));
        } else {
            percentTF.setBackground(Background.fill(Colors.UNFOCUSED));
            poruchTF.setBackground(Background.fill(Colors.UNFOCUSED));
            srokTF.setBackground(Background.fill(Colors.UNFOCUSED));
            sumTF.setBackground(Background.fill(Colors.UNFOCUSED));
        }

    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public TextField getPercentTF() {
        return percentTF;
    }

    public void setPercentTF(TextField percentTF) {
        this.percentTF = percentTF;
    }

    public TextField getPoruchTF() {
        return poruchTF;
    }

    public void setPoruchTF(TextField poruchTF) {
        this.poruchTF = poruchTF;
    }

    public TextField getSrokTF() {
        return srokTF;
    }

    public void setSrokTF(TextField srokTF) {
        this.srokTF = srokTF;
    }

    public TextField getSumTF() {
        return sumTF;
    }

    public void setSumTF(TextField sumTF) {
        this.sumTF = sumTF;
    }
}