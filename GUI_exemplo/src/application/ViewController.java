package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewController {
	@FXML
    public void backBtnPushed(ActionEvent event) throws IOException {
    	Parent newView = FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	Scene newScene = new Scene(newView);
    	Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	window.setScene(newScene);
    	window.show();
    	
    }
}
