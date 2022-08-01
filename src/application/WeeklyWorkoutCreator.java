package application;

public class WeeklyWorkoutCreator {
	
	//Private variables initialized so that they can be updated and
	//referred to later
	private int age = 0;
	private int weight = 0;
	
	private int sunPushups = 0;
	private int sunSitups = 0;
	private int sunSquats = 0;
	
	private int monPushups = 0;
	private int monSitups = 0;
	private int monSquats = 0;
	
	private int tuePushups = 0;
	private int tueSitups = 0;
	private int tueSquats = 0;
	
	private int wedPushups = 0;
	private int wedSitups = 0;
	private int wedSquats = 0;
	
	private int thurPushups = 0;
	private int thurSitups = 0;
	private int thurSquats = 0;
	
	private int friPushups = 0;
	private int friSitups = 0;
	private int friSquats = 0;
	
	private int satPushups = 0;
	private int satSitups = 0;
	private int satSquats = 0;
	
	/**
	 * Constructor for WeeklyWorkoutCreator used to setup everything whenever the method is called upon
	 * 
	 * @param ageGiven value of age user had previously entered
	 * @param weightGiven value of weight user had previously entered
	 */
	public WeeklyWorkoutCreator(int ageGiven, int weightGiven) {
		//Stores the values for age and weight
		age = ageGiven;
		weight = weightGiven;
		
		//calls a method to run multiple other methods
		weeklyScheduleRunner();
		
	}
	/**
	 * Runs all the work out calculations for each day
	 */
	private void weeklyScheduleRunner() {
		//runs calculation methods for work outs for each day in a week
		sundayWorkout();
		mondayWorkout();
		tuesdayWorkout();
		wednesdayWorkout();
		thursdayWorkout();
		fridayWorkout();
		saturdayWorkout();
		
	}
	
	/**
	 * Calculates a work out for Sunday based on age and weight 
	 */
	private void sundayWorkout() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight
		if (age < 13) {
			sunPushups = (int) (weight * 0.25 * 2);
			sunSitups = (int) (weight * 0.25 * 3);
			sunSquats = (int) (weight * 0.25 * 4);
		}
		if (age >= 13 && age < 18) {
			sunPushups = (int) (weight * 0.17 * 3);
			sunSitups = (int) (weight * 0.17 * 5);
			sunSquats = (int) (weight * 0.17 * 7);
		}
		if (age >= 18 && age < 50) {
			sunPushups = (int) (weight * 0.10 * 4);
			sunSitups = (int) (weight * 0.10 * 6);
			sunSquats = (int) (weight * 0.10 * 8);
		}
		if (age >= 50) {
			sunPushups = (int) (weight * 0.18 * 2);
			sunSitups = (int) (weight * 0.18 * 3);
			sunSquats = (int) (weight * 0.18 * 4);
		}
	}
	
	/**
	 * Calculates a work out for Monday based on age and weight 
	 */
	private void mondayWorkout() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight
		if (age < 13) {
			monPushups = (int) (weight * 0.25 * 1);
			monSitups = (int) (weight * 0.25 * 2);
			monSquats = (int) (weight * 0.25 * 3);
		}
		if (age >= 13 && age < 18) {
			monPushups = (int) (weight * 0.17 * 2);
			monSitups = (int) (weight * 0.17 * 4);
			monSquats = (int) (weight * 0.17 * 6);
		}
		if (age >= 18 && age < 50) {
			monPushups = (int) (weight * 0.10 * 3);
			monSitups = (int) (weight * 0.10 * 5);
			monSquats = (int) (weight * 0.10 * 7);
		}
		if (age >= 50) {
			monPushups = (int) (weight * 0.18 * 1);
			monSitups = (int) (weight * 0.18 * 2);
			monSquats = (int) (weight * 0.18 * 3);
		}
	}
	
	/**
	 * Calculates a work out for Tuesday based on age and weight 
	 */
	private void tuesdayWorkout() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight
		if (age < 13) {
			tuePushups = (int) (weight * 0.25 * 3);
			tueSitups = (int) (weight * 0.25 * 4);
			tueSquats = (int) (weight * 0.25 * 5);
		}
		if (age >= 13 && age < 18) {
			tuePushups = (int) (weight * 0.17 * 4);
			tueSitups = (int) (weight * 0.17 * 6);
			tueSquats = (int) (weight * 0.17 * 8);
		}
		if (age >= 18 && age < 50) {
			tuePushups = (int) (weight * 0.10 * 5);
			tueSitups = (int) (weight * 0.10 * 7);
			tueSquats = (int) (weight * 0.10 * 9);
		}
		if (age >= 50) {
			tuePushups = (int) (weight * 0.18 * 3);
			tueSitups = (int) (weight * 0.18 * 4);
			tueSquats = (int) (weight * 0.18 * 5);
		}
		
	}
	
	/**
	 * Calculates a work out for Wednesday based on age and weight 
	 */
	private void wednesdayWorkout() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight
		if (age < 13) {
			wedPushups = (int) (weight * 0.25 * 1);
			wedSitups = (int) (weight * 0.25 * 2);
			wedSquats = (int) (weight * 0.25 * 3);
		}
		if (age >= 13 && age < 18) {
			wedPushups = (int) (weight * 0.17 * 2);
			wedSitups = (int) (weight * 0.17 * 4);
			wedSquats = (int) (weight * 0.17 * 6);
		}
		if (age >= 18 && age < 50) {
			wedPushups = (int) (weight * 0.10 * 3);
			wedSitups = (int) (weight * 0.10 * 5);
			wedSquats = (int) (weight * 0.10 * 7);
		}
		if (age >= 50) {
			wedPushups = (int) (weight * 0.18 * 1);
			wedSitups = (int) (weight * 0.18 * 2);
			wedSquats = (int) (weight * 0.18 * 3);
		}
		
	}
	
	/**
	 * Calculates a work out for Thursday based on age and weight 
	 */
	private void thursdayWorkout() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight
		if (age < 13) {
			thurPushups = (int) (weight * 0.25 * 2);
			thurSitups = (int) (weight * 0.25 * 4);
			thurSquats = (int) (weight * 0.25 * 4);
		}
		if (age >= 13 && age < 18) {
			thurPushups = (int) (weight * 0.17 * 3);
			thurSitups = (int) (weight * 0.17 * 6);
			thurSquats = (int) (weight * 0.17 * 7);
		}
		if (age >= 18 && age < 50) {
			thurPushups = (int) (weight * 0.10 * 4);
			thurSitups = (int) (weight * 0.10 * 7);
			thurSquats = (int) (weight * 0.10 * 8);
		}
		if (age >= 50) {
			thurPushups = (int) (weight * 0.18 * 2);
			thurSitups = (int) (weight * 0.18 * 4);
			thurSquats = (int) (weight * 0.18 * 4);
		}
		
	}
	
	/**
	 * Calculates a work out for Friday based on age and weight 
	 */
	private void fridayWorkout() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight
		if (age < 13) {
			friPushups = (int) (weight * 0.25 * 2);
			friSitups = (int) (weight * 0.25 * 1);
			friSquats = (int) (weight * 0.25 * 2);
		}
		if (age >= 13 && age < 18) {
			friPushups = (int) (weight * 0.17 * 3);
			friSitups = (int) (weight * 0.17 * 3);
			friSquats = (int) (weight * 0.17 * 5);
		}
		if (age >= 18 && age < 50) {
			friPushups = (int) (weight * 0.10 * 4);
			friSitups = (int) (weight * 0.10 * 4);
			friSquats = (int) (weight * 0.10 * 6);
		}
		if (age >= 50) {
			friPushups = (int) (weight * 0.18 * 2);
			friSitups = (int) (weight * 0.18 * 1);
			friSquats = (int) (weight * 0.18 * 2);
		}
		
	}
	
	/**
	 * Calculates a work out for Saturday based on age and weight 
	 */
	private void saturdayWorkout() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight
		if (age < 13) {
			satPushups = (int) (weight * 0.25 * 2);
			satSitups = (int) (weight * 0.25 * 3);
			satSquats = (int) (weight * 0.25 * 4);
		}
		if (age >= 13 && age < 18) {
			satPushups = (int) (weight * 0.17 * 3);
			satSitups = (int) (weight * 0.17 * 5);
			satSquats = (int) (weight * 0.17 * 7);
		}
		if (age >= 18 && age < 50) {
			satPushups = (int) (weight * 0.10 * 4);
			satSitups = (int) (weight * 0.10 * 6);
			satSquats = (int) (weight * 0.10 * 8);
		}
		if (age >= 50) {
			satPushups = (int) (weight * 0.18 * 2);
			satSitups = (int) (weight * 0.18 * 3);
			satSquats = (int) (weight * 0.18 * 4);
		}
	}
	
	/**
	 * Formats all the workouts for each day in the week into an easy to read format
	 * 
	 */
	public String format() {
		//Formats work outs to do based on day and displays them
		//in an easy format to see
		String workoutSchedule;
		workoutSchedule = "=====Sunday=====" + "\n" + "Pushups to do: " + sunPushups + "\n" 
				+ "Situps to do: " + sunSitups + "\n" + "Squats to do: " + sunSquats + "\n";
		
		workoutSchedule += "=====Monday=====" + "\n" + "Pushups to do: " + monPushups + "\n" 
				+ "Situps to do: " + monSitups + "\n" + "Squats to do: " + monSquats + "\n";
		
		workoutSchedule += "=====Tuesday=====" + "\n" + "Pushups to do: " + tuePushups + "\n" 
				+ "Situps to do: " + tueSitups + "\n" + "Squats to do: " + tueSquats + "\n";
		
		workoutSchedule += "=====Wednesday=====" + "\n" + "Pushups to do: " + wedPushups + "\n" 
				+ "Situps to do: " + wedSitups + "\n" + "Squats to do: " + wedSquats + "\n";
		
		workoutSchedule += "=====Thursday=====" + "\n" + "Pushups to do: " + thurPushups + "\n" 
				+ "Situps to do: " + thurSitups + "\n" + "Squats to do: " + thurSquats + "\n";
		
		workoutSchedule += "=====Friday=====" + "\n" + "Pushups to do: " + friPushups + "\n" 
				+ "Situps to do: " + friSitups + "\n" + "Squats to do: " + friSquats + "\n";
		
		workoutSchedule += "=====Saturday=====" + "\n" + "Pushups to do: " + satPushups + "\n" 
				+ "Situps to do: " + satSitups + "\n" + "Squats to do: " + satSquats + "\n";
		
		return workoutSchedule;
	}

}
