package climate_action_javafx.java.com.climateaction.controllers;

import climate_action_javafx.java.com.climateaction.models.Article;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    @FXML
    private ListView<String> articleList;
    @FXML
    private TextArea articleContent;

    private List<Article> articles;

    public ArticleController() {
        articles = new ArrayList<>();
        articles.add(new Article("Pemanasan Global", "Deskripsi tentang pemanasan global..."));
        articles.add(new Article("Dampak Deforestasi", "Deskripsi tentang dampak deforestasi..."));
    }

    @FXML
    public void initialize() {
        ObservableList<String> articleTitles = FXCollections.observableArrayList();
        for (Article article : articles) {
             articleTitles.add(article.getTitle());
        }
        articleList.setItems(articleTitles);
    }

    @FXML
    private void handleArticleSelection() {
        String selectedTitle = articleList.getSelectionModel().getSelectedItem();
        for (Article article : articles) {
            if (article.getTitle().equals(selectedTitle)) {
                articleContent.setText(article.getContent());
                break;
            }
        }
    }
}