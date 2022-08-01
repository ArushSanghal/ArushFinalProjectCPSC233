package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//initializes the GUI 
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/WorkoutTypePlannerView.fxml"));
			WorkoutTypePlannerController controller = (WorkoutTypePlannerController)loader.getController();
			controller.applicationStage = primaryStage;
			
			Scene scene = new Scene(root,300,60);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Workout Type Planner");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
