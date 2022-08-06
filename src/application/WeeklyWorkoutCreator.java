package application;

public class WeeklyWorkoutCreator extends DailyWorkoutCreator {
	
	//Private variables initialized so that they can be updated and
	//referred to later
	private int pushups = 0;
	private int situps = 0;
	private int squats = 0;
	private double[] ageMultiplierValues = {0.25, 0.17, 0.10, 0.18};
	
	
	
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
				pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
				situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
				squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
				situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
				squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
				situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
				squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
				situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
				squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
			}
		}
		
		if (index == 1) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
				situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
				squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
				situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
				squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
				situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
				squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
				situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
				squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
			}
		}
		
		if (index == 2) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
				situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
				squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
				situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
				squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
				situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
				squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
				situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
				squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
			}
		}
		
		if (index == 3) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
				situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
				squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
				situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
				squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
				situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
				squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
				situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
				squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
			}
		}
		
		if (index == 4) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
				situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
				squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
				situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
				squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
				situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
				squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
				situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
				squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
			}
		}
		
		if (index == 5) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
				situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
				squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
				situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
				squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
				situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
				squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
				situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
				squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
			}
		}
		
		if (index == 6) {
			if (age < 13) {
				pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
				situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
				squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
			}
			if (age >= 13 && age < 18) {
				pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
				situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
				squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
			}
			if (age >= 18 && age < 50) {
				pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
				situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
				squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
			}
			if (age >= 50) {
				pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
				situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
				squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
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
	
