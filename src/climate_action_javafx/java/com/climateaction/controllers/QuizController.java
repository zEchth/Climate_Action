package climate_action_javafx.java.com.climateaction.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class QuizController {
    @FXML
    private Label questionLabel;
    @FXML
    private Button answerButton;

    @FXML
    public void initialize() {
        questionLabel.setText("Apa itu pemanasan global?");
    }

    @FXML
    private void handleAnswerButtonAction() {
        // Logika untuk memeriksa jawaban
        System.out.println("Jawaban diperiksa.");
    }
}