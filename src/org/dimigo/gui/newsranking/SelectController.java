package org.dimigo.gui.newsranking;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectController {
    @FXML private Pane pane_first;
    @FXML private Button btn_pol;
    @FXML private Button btn_eco;
    @FXML private Button btn_soc;
    @FXML private Button btn_lnc;
    @FXML private Button btn_wor;
    @FXML private Button btn_ins;

    public void handlePolAction() throws IOException {
        Stage stage = (Stage) pane_first.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Category.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Top5");
        stage.centerOnScreen();
        stage.show();

        CategoryController ctrl = loader.getController();
        ctrl.setLabelAction(NewsChart.getNewsChart().get("category").get("정치"));
        CategoryController.title = "정치";
    }
    public void handleEcoAction() throws IOException {
//        CategoryController.title = "경제";
        Stage stage = (Stage) pane_first.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Category.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Top5");
        stage.centerOnScreen();
        stage.show();

        CategoryController ctrl = loader.getController();
        ctrl.setLabelAction(NewsChart.getNewsChart().get("category").get("경제"));
        CategoryController.title = "경제";
    }
    public void handleSocAction() throws IOException {
//        CategoryController.title = "사회";
        Stage stage = (Stage) pane_first.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Category.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Top5");
        stage.centerOnScreen();
        stage.show();

        CategoryController ctrl = loader.getController();
        ctrl.setLabelAction(NewsChart.getNewsChart().get("category").get("사회"));
        CategoryController.title = "사회";
    }
    public void handleLncAction() throws IOException {
//        CategoryController.title = "생활/문화";
        Stage stage = (Stage) pane_first.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Category.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Top5");
        stage.centerOnScreen();
        stage.show();

        CategoryController ctrl = loader.getController();
        ctrl.setLabelAction(NewsChart.getNewsChart().get("category").get("생활/문화"));
        CategoryController.title = "생활/문화";
    }
    public void handleWorAction() throws IOException {
//        CategoryController.title = "세계";
        Stage stage = (Stage) pane_first.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Category.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Top5");
        stage.centerOnScreen();
        stage.show();

        CategoryController ctrl = loader.getController();
        ctrl.setLabelAction(NewsChart.getNewsChart().get("category").get("세계"));
        CategoryController.title = "세계";
    }
    public void handleInsAction() throws IOException {
//        CategoryController.title = "IT/과학";
        Stage stage = (Stage) pane_first.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Category.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Top5");
        stage.centerOnScreen();
        stage.show();

        CategoryController ctrl = loader.getController();
        ctrl.setLabelAction(NewsChart.getNewsChart().get("category").get("IT/과학"));
        CategoryController.title = "IT/과학";
    }

}
