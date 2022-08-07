package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WorkoutTypePlannerController {
	Stage applicationStage;

	/**
	 * Method will create a GUI where a user can enter their age and weight which will be used in the calculation
	 * process for determining a work out that can be done for the day
	 * 
	 * @param dailyWorkoutEvent An ActionEvent that causes the code to run when the Button is clicked
	 * @return a work out based on the users age and weight otherwise returns an error if the values entered are not allowed
	 */
    @FXML
    void dailyWorkoutInfo(ActionEvent dailyWorkoutEvent) {
    	
    	//Saves the original GUI for later
    	Scene mainScene = applicationStage.getScene();
    	
    	//Initializes a VBox that will store everything later
    	VBox infoHolder = new VBox();
    	
    	//Create a label and textfield for age where users can enter their age
    	//Then stores it in a HBox for later
    	Label ageLabel = new Label("Age");
    	TextField ageTextField = new TextField();
    	HBox ageHolder = new HBox();
    	ageHolder.getChildren().addAll(ageLabel, ageTextField);
    	
    	//Creates a label and choice box where users can enter their sex
    	//Then stores it in a HBox for later
    	Label sexLabel = new Label("Sex");
    	ChoiceBox sexChoice = new ChoiceBox<String>();
    	sexChoice.getItems().add("Male");
    	sexChoice.getItems().add("Female");
    	HBox sexHolder = new HBox();
    	sexHolder.getChildren().addAll(sexLabel, sexChoice);
    	
    	//Create a label and textfield for age where users can enter their weight
    	//Then stores it in a HBox for later
    	Label weightLabel = new Label("Weight (kg)");
    	TextField weightTextField = new TextField();
    	HBox weightHolder = new HBox();
    	weightHolder.getChildren().addAll(weightLabel, weightTextField);
    	
    	//Stores the two HBoxes from before into the VBox
    	infoHolder.getChildren().addAll(ageHolder, sexHolder, weightHolder);
    	
    	//Creates a back button which can send back to the original GUI
    	//Adds it to the VBox
    	Button backButton = new Button("Back");
    	backButton.setOnAction(backEvent -> sendBack(mainScene));
    	infoHolder.getChildren().add(backButton);
    	
    	//Creates a submit button which initializes calculations for a workout
    	//Adds it to the VBox
    	Button submitButton = new Button("Submit");
    	submitButton.setOnAction(submitEvent -> workoutDailySchedule(ageTextField, weightTextField, sexChoice));
    	infoHolder.getChildren().add(submitButton);
    	
    	//Creates an error message if user input is invalid
    	dailyErrorLabel = new Label();
    	infoHolder.getChildren().add(dailyErrorLabel);
    	
    	//initializes the GUI for user input
    	Scene dailyInfo = new Scene(infoHolder);
    	applicationStage.setScene(dailyInfo);

    }

    /**
     * Method will create a GUI where a user can enter their age and weight which will be used in the calculation
	 * process for determining a work out that can be done for the week
     * 
     * @param weeklyWorkoutEvent An ActionEvent that causes the code to run when the Button is clicked
     * @return a work out based on the users age and weight otherwise returns an error if the values entered are not allowed
     */
    @FXML
    void weeklyWorkoutInfo(ActionEvent weeklyWorkoutEvent) {
    	
    	//Saves the original GUI for later
    	Scene mainScene = applicationStage.getScene();
    	
    	//Initializes a VBox that will store everything later
    	VBox infoHolder = new VBox();
    	
    	//Create a label and textfield for age where users can enter their age
    	//Then stores it in a HBox for later
    	Label ageLabel = new Label("Age");
    	TextField ageTextField = new TextField();
    	HBox ageHolder = new HBox();
    	ageHolder.getChildren().addAll(ageLabel, ageTextField);
    	
    	//Creates a label and choice box where users can enter their sex
    	//Then stores it in a HBox for later
    	Label sexLabel = new Label("Sex");
    	ChoiceBox sexChoice = new ChoiceBox<String>();
    	sexChoice.getItems().add("Male");
    	sexChoice.getItems().add("Female");
    	HBox sexHolder = new HBox();
    	sexHolder.getChildren().addAll(sexLabel, sexChoice);
    	
    	//Create a label and textfield for age where users can enter their weight
    	//Then stores it in a HBox for later
    	Label weightLabel = new Label("Weight (kg)");
    	TextField weightTextField = new TextField();
    	HBox weightHolder = new HBox();
    	weightHolder.getChildren().addAll(weightLabel, weightTextField);
    	
    	//Stores the two HBoxes from before into the VBox
    	infoHolder.getChildren().addAll(ageHolder, sexHolder, weightHolder);
    	
    	//Creates a back button which can send back to the original GUI
    	//Adds it to the VBox
    	Button backButton = new Button("Back");
    	backButton.setOnAction(backEvent -> sendBack(mainScene));
    	infoHolder.getChildren().add(backButton);
    	
    	//Creates a submit button which initializes calculations for a work out
    	//Adds it to the VBox
    	Button submitButton = new Button("Submit");
    	submitButton.setOnAction(submitEvent -> workoutWeeklySchedule(ageTextField, weightTextField, sexChoice));
    	infoHolder.getChildren().add(submitButton);
    	
    	//Creates an error message if user input is invalid
    	weeklyErrorLabel = new Label();
    	infoHolder.getChildren().add(weeklyErrorLabel);
    	
    	//initializes the GUI for user input
    	Scene dailyInfo = new Scene(infoHolder);
    	applicationStage.setScene(dailyInfo);

    }
    
    /**
     * Used to bring the original GUI back when user requests it
     * 
     * @param mainScene The original GUI scene from the start
     * @return re-initializes the GUI from the start 
     */
    void sendBack(Scene mainScene) {
    	//initializes original GUI
    	applicationStage.setScene(mainScene);
    }
    
    /**
     * Sends values for calculation for a recommended work out for the day for the user based
     * on their inputs for age and weight. Then displays a new GUI with the recommended work out
     * for the day.
     * 
     * @param ageTextField The TextField the user had input for their age
     * @param weightTextField The TextField the user had input for their weight
     * @return Creates a GUI which shows the work out for the day for the user
     */
    void workoutDailySchedule(TextField ageTextField, TextField weightTextField, ChoiceBox sexChoice) {
    	//Try and Catch statement test to see if the user entered a valid number
    	try {
    		//stores the age, weight and sex
    		int age = Integer.valueOf(ageTextField.getText());
    		double weightd = Double.parseDouble(weightTextField.getText());
    		int weight = (int) weightd;
    		String sex = (String) sexChoice.getValue();
    		
    		//Tests to see if the weight or age is less than or equal to 0
    		//and creates an error message to send back if it is
    		if (weight <= 0 || age <= 0) {
        		dailyErrorLabel.setText("Please enter a value greater than 0");
        	}
    		
    		//calls the DailyWorkoutCreator Function 
        	WeeklyWorkoutCreator workout = new WeeklyWorkoutCreator(age, weight, 0, sex);
        	
        	//Stores the pushups, situps, and squats calculated 
        	int pushups = workout.returnPushups();
        	int situps = workout.returnSitups();
        	int squats = workout.returnSquats();
        	
        	//Creates a VBox to store the values in for later to display
        	VBox workoutList = new VBox();
        	
        	//Creates labels to show workouts that should be done
        	Label pushupLabel = new Label("Pushup to do: " + pushups);
        	Label situpsLabel = new Label("situps to do: " + situps);
        	Label squatsLabel = new Label("squats to do: " + squats);
        	
        	//Stores the label into the VBox
        	workoutList.getChildren().addAll(pushupLabel, situpsLabel, squatsLabel);
        	if (weight > 0) {
        		Scene workoutInfo = new Scene(workoutList);
        		applicationStage.setScene(workoutInfo);
        	}
    	}
    	
    	catch (NumberFormatException e) {
    		dailyErrorLabel.setText("Please enter a valid number");
    	}
    }
    
    /**
     * Sends values for calculation for a recommended work out for the day for the user based
     * on their inputs for age and weight. Then displays a new GUI with the recommended work out
     * for the week.
     * 
     * @param ageTextField The TextField the user had input for their age
     * @param weightTextField The TextField the user had input for their weight
     * @return Creates a GUI which shows the work out for the week for the user
     */
    void workoutWeeklySchedule(TextField ageTextField, TextField weightTextField, ChoiceBox sexChoice) {
    	//Try and Catch statement test to see if the user entered a valid number
    	try {
    		//stores the age, weight and sex
    		int age = Integer.valueOf(ageTextField.getText());
    		int weight = Integer.valueOf(weightTextField.getText());
    		String sex = (String) sexChoice.getValue();
    		
    		//Tests to see if the weight or age is less than or equal to 0
    		//and creates an error message to send back if it is
    		if (weight <= 0 || age <= 0) {
        		weeklyErrorLabel.setText("Please enter a value greater than 0");
        	}
    		
    		VBox workoutList = new VBox();
    		
    		for (int i = 0; i < 7; i++) {
    			if (i == 0) {
    				WeeklyWorkoutCreator workout = new WeeklyWorkoutCreator(age, weight, i, sex);
    				
    				int pushups = workout.returnPushups();
    	        	int situps = workout.returnSitups();
    	        	int squats = workout.returnSquats();
    	        	
    	    		//Creates labels to show workouts that should be done
    	    		Label dayNameSun = new Label("===Sunday===");
    	        	Label pushupLabel = new Label("Pushup to do: " + pushups);
    	        	Label situpsLabel = new Label("situps to do: " + situps);
    	        	Label squatsLabel = new Label("squats to do: " + squats);
    	        	workoutList.getChildren().addAll(dayNameSun, pushupLabel, situpsLabel, squatsLabel);
    			}
    			
    			if (i == 1) {
    				WeeklyWorkoutCreator workout = new WeeklyWorkoutCreator(age, weight, i, sex);
    				
    				int pushups = workout.returnPushups();
    	        	int situps = workout.returnSitups();
    	        	int squats = workout.returnSquats();
    	        	
    	        	//Creates labels to show workouts that should be done
    	    		Label dayNameMon = new Label("===Monday===");
    	        	Label pushupLabel = new Label("Pushup to do: " + pushups);
    	        	Label situpsLabel = new Label("situps to do: " + situps);
    	        	Label squatsLabel = new Label("squats to do: " + squats);
    	        	workoutList.getChildren().addAll(dayNameMon, pushupLabel, situpsLabel, squatsLabel);
    			}
    			
    			if (i == 2) {
    				WeeklyWorkoutCreator workout = new WeeklyWorkoutCreator(age, weight, i, sex);
    				
    				int pushups = workout.returnPushups();
    	        	int situps = workout.returnSitups();
    	        	int squats = workout.returnSquats();
    	        	
    	        	//Creates labels to show workouts that should be done
    	    		Label dayNameTues = new Label("===Tuesday===");
    	        	Label pushupLabel = new Label("Pushup to do: " + pushups);
    	        	Label situpsLabel = new Label("situps to do: " + situps);
    	        	Label squatsLabel = new Label("squats to do: " + squats);
    	        	workoutList.getChildren().addAll(dayNameTues, pushupLabel, situpsLabel, squatsLabel);
    			}
    			
    			if (i == 3) {
    				WeeklyWorkoutCreator workout = new WeeklyWorkoutCreator(age, weight, i, sex);
    				
    				int pushups = workout.returnPushups();
    	        	int situps = workout.returnSitups();
    	        	int squats = workout.returnSquats();
    	        	
    	        	//Creates labels to show workouts that should be done
    	    		Label dayNameWed = new Label("===Wednesday===");
    	        	Label pushupLabel = new Label("Pushup to do: " + pushups);
    	        	Label situpsLabel = new Label("situps to do: " + situps);
    	        	Label squatsLabel = new Label("squats to do: " + squats);
    	        	workoutList.getChildren().addAll(dayNameWed, pushupLabel, situpsLabel, squatsLabel);
    			}
    			
    			if (i == 4) {
    				WeeklyWorkoutCreator workout = new WeeklyWorkoutCreator(age, weight, i, sex);
    				
    				int pushups = workout.returnPushups();
    	        	int situps = workout.returnSitups();
    	        	int squats = workout.returnSquats();
    	        	
    	        	Label dayNameThurs = new Label("===Thursday===");
    	        	Label pushupLabel = new Label("Pushup to do: " + pushups);
    	        	Label situpsLabel = new Label("situps to do: " + situps);
    	        	Label squatsLabel = new Label("squats to do: " + squats);
    	        	workoutList.getChildren().addAll(dayNameThurs, pushupLabel, situpsLabel, squatsLabel);
    			}
    			
    			if (i == 5) {
    				WeeklyWorkoutCreator workout = new WeeklyWorkoutCreator(age, weight, i, sex);
    				
    				int pushups = workout.returnPushups();
    	        	int situps = workout.returnSitups();
    	        	int squats = workout.returnSquats();
    	        	
    	        	Label dayNameFri = new Label("===Friday===");
    	        	Label pushupLabel = new Label("Pushup to do: " + pushups);
    	        	Label situpsLabel = new Label("situps to do: " + situps);
    	        	Label squatsLabel = new Label("squats to do: " + squats);
    	        	workoutList.getChildren().addAll(dayNameFri, pushupLabel, situpsLabel, squatsLabel);
    			}
    			
    			if (i == 6) {
    				WeeklyWorkoutCreator workout = new WeeklyWorkoutCreator(age, weight, i, sex);
    				
    				int pushups = workout.returnPushups();
    	        	int situps = workout.returnSitups();
    	        	int squats = workout.returnSquats();
    	        	
    	        	Label dayNameSat = new Label("===Saturday===");
    	        	Label pushupLabel = new Label("Pushup to do: " + pushups);
    	        	Label situpsLabel = new Label("situps to do: " + situps);
    	        	Label squatsLabel = new Label("squats to do: " + squats);
    	        	workoutList.getChildren().addAll(dayNameSat, pushupLabel, situpsLabel, squatsLabel);
    			}
    			
    		}
    		
    		if (weight > 0) {
    			Scene workoutInfo = new Scene(workoutList);
    			applicationStage.setScene(workoutInfo);
    		}
    	}
    	catch (NumberFormatException e) {
        	weeklyErrorLabel.setText("Please enter a valid number");
        	}
    }
    
    private Label dailyErrorLabel;
    
    private Label weeklyErrorLabel;

}

