package application;

public class WorkoutCreator {
	
	private int age = 0;
	private int weight = 0;
	private int pushups = 0;
	private int situps = 0;
	private int squats = 0;
	
	public WorkoutCreator(int ageGiven, int weightGiven) {
		age = ageGiven;
		weight = weightGiven;
		
	}
	
	private void exerciseMaker() {
		
		if (age < 13) {
			pushups = (int) (weight * 0.5 * 2);
			situps = (int) (weight * 0.5 * 3);
			squats = (int) (weight * 0.5 * 4);
		}
		if (age >= 13 && age < 18) {
			pushups = (int) (weight * 0.3 * 3);
			situps = (int) (weight * 0.3 * 5);
			squats = (int) (weight * 0.3 * 7);
		}
		if (age >= 18 && age < 50) {
			pushups = (int) (weight * 0.5 * 4);
			situps = (int) (weight * 0.5 * 6);
			squats = (int) (weight * 0.5 * 8);
		}
		if (age >= 50) {
			pushups = (int) (weight * 0.5 * 2);
			situps = (int) (weight * 0.5 * 3);
			squats = (int) (weight * 0.5 * 4);
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