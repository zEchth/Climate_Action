package climate_action_javafx.java.com.climateaction.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProfileController {
    @FXML
    private Label usernameLabel;

    @FXML
    public void initialize() {
        // Misalnya, ambil nama pengguna dari model pengguna
        usernameLabel.setText("Nama Pengguna: JohnDoe");
    }
}