package climate_action_javafx.java.com.climateaction.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class ForumController {
    @FXML
    private ListView<String> postList;
    @FXML
    private TextArea postContent;

    private List<String> posts;

    public ForumController() {
        posts = new ArrayList<>();
        posts.add("Apa pendapat Anda tentang perubahan iklim?");
        posts.add("Bagaimana cara mengurangi jejak karbon?");
    }

    @FXML
    public void initialize() {
        postList.getItems().addAll(posts);
    }

    @FXML
    private void handlePostSelection() {
        String selectedPost = postList.getSelectionModel().getSelectedItem();
        postContent.setText("Detail untuk: " + selectedPost);
    }
}