package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
<<<<<<< HEAD:GUI/src/application/Main.java
import javafx.scene.layout.BorderPane;
=======
>>>>>>> d7428e7e85d1944656a80f2a0d4028ea3aada1ed:GUI_Intro/src/application/Main.java
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
<<<<<<< HEAD:GUI/src/application/Main.java
			AnchorPane root = (AnchorPane)FXMLLoader.load(Main.class.getResource("Sample.fxml"));
			Scene scene = new Scene(root);
=======
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
>>>>>>> d7428e7e85d1944656a80f2a0d4028ea3aada1ed:GUI_Intro/src/application/Main.java
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
