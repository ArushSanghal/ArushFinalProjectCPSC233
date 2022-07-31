package application;

public class WeeklyWorkoutCreator {
	
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
	
	public WeeklyWorkoutCreator(int ageGiven, int weightGiven) {
		age = ageGiven;
		weight = weightGiven;
		weeklyScheduleRunner();
		
	}
	
	private void weeklyScheduleRunner() {
		sundayWorkout();
		mondayWorkout();
		tuesdayWorkout();
		wednesdayWorkout();
		thursdayWorkout();
		fridayWorkout();
		saturdayWorkout();
		
	}
	
	private void sundayWorkout() {
		if (age < 13) {
			sunPushups = (int) (weight * 0.5 * 2);
			sunSitups = (int) (weight * 0.5 * 3);
			sunSquats = (int) (weight * 0.5 * 4);
		}
		if (age >= 13 && age < 18) {
			sunPushups = (int) (weight * 0.3 * 3);
			sunSitups = (int) (weight * 0.3 * 5);
			sunSquats = (int) (weight * 0.3 * 7);
		}
		if (age >= 18 && age < 50) {
			sunPushups = (int) (weight * 0.4 * 4);
			sunSitups = (int) (weight * 0.4 * 6);
			sunSquats = (int) (weight * 0.4 * 8);
		}
		if (age >= 50) {
			sunPushups = (int) (weight * 0.2 * 2);
			sunSitups = (int) (weight * 0.2 * 3);
			sunSquats = (int) (weight * 0.2 * 4);
		}
	}
	
	private void mondayWorkout() {
		if (age < 13) {
			monPushups = (int) (weight * 0.5 * 2);
			monSitups = (int) (weight * 0.5 * 3);
			monSquats = (int) (weight * 0.5 * 4);
		}
		if (age >= 13 && age < 18) {
			monPushups = (int) (weight * 0.3 * 3);
			monSitups = (int) (weight * 0.3 * 5);
			monSquats = (int) (weight * 0.3 * 7);
		}
		if (age >= 18 && age < 50) {
			monPushups = (int) (weight * 0.4 * 4);
			monSitups = (int) (weight * 0.4 * 6);
			monSquats = (int) (weight * 0.4 * 8);
		}
		if (age >= 50) {
			monPushups = (int) (weight * 0.2 * 2);
			monSitups = (int) (weight * 0.2 * 3);
			monSquats = (int) (weight * 0.2 * 4);
		}
	}
	
	private void tuesdayWorkout() {
		if (age < 13) {
			tuePushups = (int) (weight * 0.5 * 2);
			tueSitups = (int) (weight * 0.5 * 3);
			tueSquats = (int) (weight * 0.5 * 4);
		}
		if (age >= 13 && age < 18) {
			tuePushups = (int) (weight * 0.3 * 3);
			tueSitups = (int) (weight * 0.3 * 5);
			tueSquats = (int) (weight * 0.3 * 7);
		}
		if (age >= 18 && age < 50) {
			tuePushups = (int) (weight * 0.4 * 4);
			tueSitups = (int) (weight * 0.4 * 6);
			tueSquats = (int) (weight * 0.4 * 8);
		}
		if (age >= 50) {
			tuePushups = (int) (weight * 0.2 * 2);
			tueSitups = (int) (weight * 0.2 * 3);
			tueSquats = (int) (weight * 0.2 * 4);
		}
		
	}
	
	private void wednesdayWorkout() {
		if (age < 13) {
			wedPushups = (int) (weight * 0.5 * 2);
			wedSitups = (int) (weight * 0.5 * 3);
			wedSquats = (int) (weight * 0.5 * 4);
		}
		if (age >= 13 && age < 18) {
			wedPushups = (int) (weight * 0.3 * 3);
			wedSitups = (int) (weight * 0.3 * 5);
			wedSquats = (int) (weight * 0.3 * 7);
		}
		if (age >= 18 && age < 50) {
			wedPushups = (int) (weight * 0.4 * 4);
			wedSitups = (int) (weight * 0.4 * 6);
			wedSquats = (int) (weight * 0.4 * 8);
		}
		if (age >= 50) {
			wedPushups = (int) (weight * 0.2 * 2);
			wedSitups = (int) (weight * 0.2 * 3);
			wedSquats = (int) (weight * 0.2 * 4);
		}
		
	}
	
	private void thursdayWorkout() {
		if (age < 13) {
			thurPushups = (int) (weight * 0.5 * 2);
			thurSitups = (int) (weight * 0.5 * 3);
			thurSquats = (int) (weight * 0.5 * 4);
		}
		if (age >= 13 && age < 18) {
			thurPushups = (int) (weight * 0.3 * 3);
			thurSitups = (int) (weight * 0.3 * 5);
			thurSquats = (int) (weight * 0.3 * 7);
		}
		if (age >= 18 && age < 50) {
			thurPushups = (int) (weight * 0.4 * 4);
			thurSitups = (int) (weight * 0.4 * 6);
			thurSquats = (int) (weight * 0.4 * 8);
		}
		if (age >= 50) {
			thurPushups = (int) (weight * 0.2 * 2);
			thurSitups = (int) (weight * 0.2 * 3);
			thurSquats = (int) (weight * 0.2 * 4);
		}
		
	}
	
	private void fridayWorkout() {
		if (age < 13) {
			friPushups = (int) (weight * 0.5 * 2);
			friSitups = (int) (weight * 0.5 * 3);
			friSquats = (int) (weight * 0.5 * 4);
		}
		if (age >= 13 && age < 18) {
			friPushups = (int) (weight * 0.3 * 3);
			friSitups = (int) (weight * 0.3 * 5);
			friSquats = (int) (weight * 0.3 * 7);
		}
		if (age >= 18 && age < 50) {
			friPushups = (int) (weight * 0.4 * 4);
			friSitups = (int) (weight * 0.4 * 6);
			friSquats = (int) (weight * 0.4 * 8);
		}
		if (age >= 50) {
			friPushups = (int) (weight * 0.2 * 2);
			friSitups = (int) (weight * 0.2 * 3);
			friSquats = (int) (weight * 0.2 * 4);
		}
		
	}
	
	private void saturdayWorkout() {
		if (age < 13) {
			satPushups = (int) (weight * 0.5 * 2);
			satSitups = (int) (weight * 0.5 * 3);
			satSquats = (int) (weight * 0.5 * 4);
		}
		if (age >= 13 && age < 18) {
			satPushups = (int) (weight * 0.3 * 3);
			satSitups = (int) (weight * 0.3 * 5);
			satSquats = (int) (weight * 0.3 * 7);
		}
		if (age >= 18 && age < 50) {
			satPushups = (int) (weight * 0.4 * 4);
			satSitups = (int) (weight * 0.4 * 6);
			satSquats = (int) (weight * 0.4 * 8);
		}
		if (age >= 50) {
			satPushups = (int) (weight * 0.2 * 2);
			satSitups = (int) (weight * 0.2 * 3);
			satSquats = (int) (weight * 0.2 * 4);
		}
	}
	
	public String format() {
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
