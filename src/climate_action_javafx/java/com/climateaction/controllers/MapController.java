package climate_action_javafx.java.com.climateaction.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MapController {
    @FXML
    private Button showMapButton;

    @FXML
    private void handleShowMapButtonAction() {
        // Logika untuk menampilkan peta
        System.out.println("Menampilkan peta...");
    }
}