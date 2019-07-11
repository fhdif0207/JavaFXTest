package org.dimigo.gui.newsranking;


import java.awt.Desktop;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CategoryController implements Initializable {
    public static String title = new String();
    @FXML private Pane pane_first;
    @FXML private Label lbl_first;
    @FXML
    ComboBox<String> cbClass;

    public void setLabelAction(List<String> list){
        String rank = new String();
        for(int i=0; i <5;i++){
            rank += (i+1) + ". " + list.get(i) + "\n";
        }
        lbl_first.setText(rank);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbClass.getItems().addAll("1번 뉴스", "2번 뉴스", "3번 뉴스", "4번 뉴스", "5번 뉴스");
    }

    public void handleOpenAction(){
        if(cbClass.getValue().equals("1번 뉴스")){
            try {
                Desktop.getDesktop().browse(new URI(NewsChart.getNewsChart().get("url").get(title).get(0)));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        else if(cbClass.getValue().equals("2번 뉴스")){
            try {
                Desktop.getDesktop().browse(new URI(NewsChart.getNewsChart().get("url").get(title).get(1)));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        else if(cbClass.getValue().equals("3번 뉴스")){
            try {
                Desktop.getDesktop().browse(new URI(NewsChart.getNewsChart().get("url").get(title).get(2)));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        else if(cbClass.getValue().equals("4번 뉴스")){
            try {
                Desktop.getDesktop().browse(new URI(NewsChart.getNewsChart().get("url").get(title).get(3)));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        else if(cbClass.getValue().equals("5번 뉴스")){
            try {
                Desktop.getDesktop().browse(new URI(NewsChart.getNewsChart().get("url").get(title).get(4)));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    public void handleBackAction() throws IOException {
        Stage stage = (Stage) pane_first.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/dimigo/gui/newsranking/select.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("카테고리");
        stage.centerOnScreen();
        stage.show();
    }

}
