package climate_action_javafx.java.com.climateaction.controllers;

import climate_action_javafx.java.com.climateaction.models.Challenge;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class ChallengeController {
    @FXML
    private ListView<String> challengeList;
    @FXML
    private TextArea challengeDescription;

    private List<Challenge> challenges;

    public ChallengeController() {
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Kurangi Penggunaan Plastik", "Cobalah untuk tidak menggunakan plastik sekali pakai selama seminggu."));
        challenges.add(new Challenge("Hemat Energi", "Kurangi penggunaan listrik di rumah selama sebulan."));
    }

    @FXML
    public void initialize() {
        ObservableList<String> challengeTitles = FXCollections.observableArrayList();
        for (Challenge challenge : challenges) {
            challengeTitles.add(challenge.getTitle());
        }
        challengeList.setItems(challengeTitles);
    }

    @FXML
    private void handleChallengeSelection() {
        String selectedTitle = challengeList.getSelectionModel().getSelectedItem();
        for (Challenge challenge : challenges) {
            if (challenge.getTitle().equals(selectedTitle)) {
                challengeDescription.setText(challenge.getDescription());
                break;
            }
        }
    }
}