package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WorkoutTypePlannerController {
	Stage applicationStage;


    @FXML
    void dailyWorkoutInfo(ActionEvent dailyWorkoutEvent) {
    	
    	Scene mainScene = applicationStage.getScene();
    	
    	VBox infoHolder = new VBox();
    	
    	Label ageLabel = new Label("Age");
    	TextField ageTextField = new TextField();
    	HBox ageHolder = new HBox();
    	ageHolder.getChildren().addAll(ageLabel, ageTextField);
    	
    	
    	Label weightLabel = new Label("Weight");
    	TextField weightTextField = new TextField();
    	HBox weightHolder = new HBox();
    	weightHolder.getChildren().addAll(weightLabel, weightTextField);
    	
    	infoHolder.getChildren().addAll(ageHolder, weightHolder);
    	
    	
    	Button backButton = new Button("Back");
    	backButton.setOnAction(backEvent -> sendBack(mainScene));
    	infoHolder.getChildren().add(backButton);
    	
    	
    	Button submitButton = new Button("Submit");
    	submitButton.setOnAction(submitEvent -> workoutDailySchedule(ageTextField, weightTextField));
    	infoHolder.getChildren().add(submitButton);
    	
    	
    	Scene dailyInfo = new Scene(infoHolder);
    	applicationStage.setScene(dailyInfo);

    }

    @FXML
    void weeklyWorkoutInfo(ActionEvent event) {

    }
    
    
    void sendBack(Scene mainScene) {
    	applicationStage.setScene(mainScene);
    }
    
    void workoutDailySchedule(TextField ageTextField, TextField weightTextField) {
    	int age = Integer.valueOf(ageTextField.getText());
    	int weight = Integer.valueOf(weightTextField.getText());
    	
    	WorkoutCreator workout = new WorkoutCreator(age, weight);
    	
    	int pushups = workout.returnPushups();
    	int situps = workout.returnSitups();
    	int squats = workout.returnSquats();
    }
    

}
