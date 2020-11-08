package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root, 600, 400);
			
			Button b = new Button("Click");
			Button exit = new Button("EXIT");
			b.setOnAction(e -> System.out.println("Hello"));
			exit.setOnAction(e -> {
				System.out.println("A terminar...");
				System.exit(0);
			});
			
			VBox root = new VBox();
			root.getChildren().addAll(b,exit);
			
			
			Scene scene = new Scene(root,600,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("MyTitle");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
		System.out.println();
	}

}
