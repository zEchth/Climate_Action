package climate_action_javafx.java.com.climateaction.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class HomeController {
    @FXML
    private Button articlesButton;
    @FXML
    private Button challengesButton;

    @FXML
    private void handleArticlesButtonAction() {
        loadView("articles.fxml");
    }

    @FXML
    private void handleChallengesButtonAction() {
        loadView("challenges.fxml");
    }

    private void loadView(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + fxmlFile));
            AnchorPane pane = loader.load();
            Stage stage = (Stage) articlesButton.getScene().getWindow();
            stage.getScene().setRoot(pane);
        } catch (IOException e) {
            showErrorDialog("Error loading view", e.getMessage());
        }
    }

    private void showErrorDialog(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}