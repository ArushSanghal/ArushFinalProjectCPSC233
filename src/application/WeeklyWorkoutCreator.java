package application;

public class WeeklyWorkoutCreator extends DailyWorkoutCreator {
	
	//Private variables initialized so that they can be updated and
	//referred to later
	private int pushups = 0;
	private int situps = 0;
	private int squats = 0;
	private double[] ageMultiplierValues = {0.25, 0.17, 0.10, 0.18};
	private int[] pushupValuesUnderThirteen = {2, 1, 3, 1, 2, 2, 2};
	private int[] situpsValuesUnderThirteen = {3, 2, 4, 2, 4, 1, 3};
	private int[] squatsValuesUnderThirteen = {4, 3, 5, 3, 4, 2, 4};
	
	private int[] pushupValuesBetweenThirteenAndEighteen = {3, 2, 4, 2, 3, 3, 3};
	private int[] situpsValuesBetweenThirteenAndEighteen = {5, 4, 6, 4, 5, 3, 5};
	private int[] squatsValuesBetweenThirteenAndEighteen = {7, 6, 8, 6, 7, 5, 7};
	
	private int[] pushupValuesBetweenEighteenAndFifty = {4, 3, 5, 3, 4, 4, 4};
	private int[] situpsValuesBetweenEighteenAndFifty = {6, 5, 7, 5, 7, 4, 6};
	private int[] squatsValuesBetweenEighteenAndFifty = {8, 7, 9, 7, 8, 6, 8};
	
	private int[] pushupValuesAboveFifty = {2, 1, 3, 1, 2, 2, 2};
	private int[] situpsValuesAboveFifty = {3, 2, 4, 2, 4, 1, 3};
	private int[] squatsValuesAboveFifty = {4, 3, 5, 3, 4, 2, 4};
	
	
	
	/**
	 * Constructor for WeeklyWorkoutCreator used to setup everything whenever the method is called upon
	 * 
	 * @param ageGiven value of age user had previously entered
	 * @param weightGiven value of weight user had previously entered
	 */
	public WeeklyWorkoutCreator(int ageGiven, int weightGiven, int indexGiven) {
		//Stores the values for age and weight
		this.setAge(ageGiven);
		this.setWeight(weightGiven);
		this.setIndex(indexGiven);
		
		workoutMaker();
		
	}
	
	/**
	 * Calculates a work out for Sunday based on age and weight 
	 */
	private void workoutMaker() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight
		int weight = this.getWeight();
		int age = this.getAge();
		int index = this.getIndex();
		if (index == 0) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * pushupValuesUnderThirteen[index]);
				situps = (int) (weight * ageMultiplierValues[0] * situpsValuesUnderThirteen[index]);
				squats = (int) (weight * ageMultiplierValues[0] * squatsValuesUnderThirteen[index]);
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * pushupValuesBetweenThirteenAndEighteen[index]);
				situps = (int) (weight * ageMultiplierValues[1] * situpsValuesBetweenThirteenAndEighteen[index]);
				squats = (int) (weight * ageMultiplierValues[1] * squatsValuesBetweenThirteenAndEighteen[index]);
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * pushupValuesBetweenEighteenAndFifty[index]);
				situps = (int) (weight * ageMultiplierValues[2] * situpsValuesBetweenEighteenAndFifty[index]);
				squats = (int) (weight * ageMultiplierValues[2] * squatsValuesBetweenEighteenAndFifty[index]);
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * pushupValuesAboveFifty[index]);
				situps = (int) (weight * ageMultiplierValues[3] * situpsValuesAboveFifty[index]);
				squats = (int) (weight * ageMultiplierValues[3] * squatsValuesAboveFifty[index]);
			}
		}
		
		if (index == 1) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * pushupValuesUnderThirteen[index]);
				situps = (int) (weight * ageMultiplierValues[0] * situpsValuesUnderThirteen[index]);
				squats = (int) (weight * ageMultiplierValues[0] * squatsValuesUnderThirteen[index]);
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * pushupValuesBetweenThirteenAndEighteen[index]);
				situps = (int) (weight * ageMultiplierValues[1] * situpsValuesBetweenThirteenAndEighteen[index]);
				squats = (int) (weight * ageMultiplierValues[1] * squatsValuesBetweenThirteenAndEighteen[index]);
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * pushupValuesBetweenEighteenAndFifty[index]);
				situps = (int) (weight * ageMultiplierValues[2] * situpsValuesBetweenEighteenAndFifty[index]);
				squats = (int) (weight * ageMultiplierValues[2] * squatsValuesBetweenEighteenAndFifty[index]);
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * pushupValuesAboveFifty[index]);
				situps = (int) (weight * ageMultiplierValues[3] * situpsValuesAboveFifty[index]);
				squats = (int) (weight * ageMultiplierValues[3] * squatsValuesAboveFifty[index]);
			}
		}
		
		if (index == 2) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * pushupValuesUnderThirteen[index]);
				situps = (int) (weight * ageMultiplierValues[0] * situpsValuesUnderThirteen[index]);
				squats = (int) (weight * ageMultiplierValues[0] * squatsValuesUnderThirteen[index]);
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * pushupValuesBetweenThirteenAndEighteen[index]);
				situps = (int) (weight * ageMultiplierValues[1] * situpsValuesBetweenThirteenAndEighteen[index]);
				squats = (int) (weight * ageMultiplierValues[1] * squatsValuesBetweenThirteenAndEighteen[index]);
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * pushupValuesBetweenEighteenAndFifty[index]);
				situps = (int) (weight * ageMultiplierValues[2] * situpsValuesBetweenEighteenAndFifty[index]);
				squats = (int) (weight * ageMultiplierValues[2] * squatsValuesBetweenEighteenAndFifty[index]);
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * pushupValuesAboveFifty[index]);
				situps = (int) (weight * ageMultiplierValues[3] * situpsValuesAboveFifty[index]);
				squats = (int) (weight * ageMultiplierValues[3] * squatsValuesAboveFifty[index]);
			}
		}
		
		if (index == 3) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * pushupValuesUnderThirteen[index]);
				situps = (int) (weight * ageMultiplierValues[0] * situpsValuesUnderThirteen[index]);
				squats = (int) (weight * ageMultiplierValues[0] * squatsValuesUnderThirteen[index]);
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * pushupValuesBetweenThirteenAndEighteen[index]);
				situps = (int) (weight * ageMultiplierValues[1] * situpsValuesBetweenThirteenAndEighteen[index]);
				squats = (int) (weight * ageMultiplierValues[1] * squatsValuesBetweenThirteenAndEighteen[index]);
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * pushupValuesBetweenEighteenAndFifty[index]);
				situps = (int) (weight * ageMultiplierValues[2] * situpsValuesBetweenEighteenAndFifty[index]);
				squats = (int) (weight * ageMultiplierValues[2] * squatsValuesBetweenEighteenAndFifty[index]);
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * pushupValuesAboveFifty[index]);
				situps = (int) (weight * ageMultiplierValues[3] * situpsValuesAboveFifty[index]);
				squats = (int) (weight * ageMultiplierValues[3] * squatsValuesAboveFifty[index]);
			}
		}
		
		if (index == 4) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * pushupValuesUnderThirteen[index]);
				situps = (int) (weight * ageMultiplierValues[0] * situpsValuesUnderThirteen[index]);
				squats = (int) (weight * ageMultiplierValues[0] * squatsValuesUnderThirteen[index]);
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * pushupValuesBetweenThirteenAndEighteen[index]);
				situps = (int) (weight * ageMultiplierValues[1] * situpsValuesBetweenThirteenAndEighteen[index]);
				squats = (int) (weight * ageMultiplierValues[1] * squatsValuesBetweenThirteenAndEighteen[index]);
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * pushupValuesBetweenEighteenAndFifty[index]);
				situps = (int) (weight * ageMultiplierValues[2] * situpsValuesBetweenEighteenAndFifty[index]);
				squats = (int) (weight * ageMultiplierValues[2] * squatsValuesBetweenEighteenAndFifty[index]);
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * pushupValuesAboveFifty[index]);
				situps = (int) (weight * ageMultiplierValues[3] * situpsValuesAboveFifty[index]);
				squats = (int) (weight * ageMultiplierValues[3] * squatsValuesAboveFifty[index]);
			}
		}
		
		if (index == 5) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * pushupValuesUnderThirteen[index]);
				situps = (int) (weight * ageMultiplierValues[0] * situpsValuesUnderThirteen[index]);
				squats = (int) (weight * ageMultiplierValues[0] * squatsValuesUnderThirteen[index]);
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * pushupValuesBetweenThirteenAndEighteen[index]);
				situps = (int) (weight * ageMultiplierValues[1] * situpsValuesBetweenThirteenAndEighteen[index]);
				squats = (int) (weight * ageMultiplierValues[1] * squatsValuesBetweenThirteenAndEighteen[index]);
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * pushupValuesBetweenEighteenAndFifty[index]);
				situps = (int) (weight * ageMultiplierValues[2] * situpsValuesBetweenEighteenAndFifty[index]);
				squats = (int) (weight * ageMultiplierValues[2] * squatsValuesBetweenEighteenAndFifty[index]);
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * pushupValuesAboveFifty[index]);
				situps = (int) (weight * ageMultiplierValues[3] * situpsValuesAboveFifty[index]);
				squats = (int) (weight * ageMultiplierValues[3] * squatsValuesAboveFifty[index]);
			}
		}
		
		if (index == 6) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * pushupValuesUnderThirteen[index]);
				situps = (int) (weight * ageMultiplierValues[0] * situpsValuesUnderThirteen[index]);
				squats = (int) (weight * ageMultiplierValues[0] * squatsValuesUnderThirteen[index]);
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * pushupValuesBetweenThirteenAndEighteen[index]);
				situps = (int) (weight * ageMultiplierValues[1] * situpsValuesBetweenThirteenAndEighteen[index]);
				squats = (int) (weight * ageMultiplierValues[1] * squatsValuesBetweenThirteenAndEighteen[index]);
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * pushupValuesBetweenEighteenAndFifty[index]);
				situps = (int) (weight * ageMultiplierValues[2] * situpsValuesBetweenEighteenAndFifty[index]);
				squats = (int) (weight * ageMultiplierValues[2] * squatsValuesBetweenEighteenAndFifty[index]);
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * pushupValuesAboveFifty[index]);
				situps = (int) (weight * ageMultiplierValues[3] * situpsValuesAboveFifty[index]);
				squats = (int) (weight * ageMultiplierValues[3] * squatsValuesAboveFifty[index]);
			}
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
	
