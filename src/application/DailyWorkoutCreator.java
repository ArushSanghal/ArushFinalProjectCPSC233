package application;

public class DailyWorkoutCreator {
	
	private int age = 0;
	private int weight = 0;
	private int pushups = 0;
	private int situps = 0;
	private int squats = 0;
	
	public DailyWorkoutCreator(int ageGiven, int weightGiven) {
		age = ageGiven;
		weight = weightGiven;
		exerciseMaker();
		
	}
	
	private void exerciseMaker() {
		
		if (age < 13) {
			pushups = (int) (weight * 0.25 * 2);
			situps = (int) (weight * 0.25 * 3);
			squats = (int) (weight * 0.25 * 4);
		}
		if (age >= 13 && age < 18) {
			pushups = (int) (weight * 0.17 * 3);
			situps = (int) (weight * 0.17 * 5);
			squats = (int) (weight * 0.17 * 7);
		}
		if (age >= 18 && age < 50) {
			pushups = (int) (weight * 0.10 * 4);
			situps = (int) (weight * 0.10 * 6);
			squats = (int) (weight * 0.10 * 8);
		}
		if (age >= 50) {
			pushups = (int) (weight * 0.18 * 2);
			situps = (int) (weight * 0.18 * 3);
			squats = (int) (weight * 0.18 * 4);
		}
	}
	
	public int returnPushups() {
		return pushups;
	}
	
	public int returnSitups() {
		return situps;
	}
	
	public int returnSquats() {
		return squats;
	}

}